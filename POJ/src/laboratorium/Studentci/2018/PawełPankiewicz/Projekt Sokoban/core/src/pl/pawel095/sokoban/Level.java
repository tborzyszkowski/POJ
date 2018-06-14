package pl.pawel095.sokoban;

import java.util.ArrayList;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

import pl.pawel095.sokoban.movable.Barrel;
import pl.pawel095.sokoban.movable.Movable;
import pl.pawel095.sokoban.movable.Player;
import pl.pawel095.sokoban.tile.MapTile;

public class Level {
	private ArrayList<MapTile> map;
	private Vector2 sizeInTiles;
	private Player player;
	private ArrayList<Barrel> barrel;
	private Vector2 oneTileSize;
	private KeyboardConroller controller;
	private int currentTargetCount = 0;
	private int totalTargetCount = 0;

	public boolean levelFinished = false;

	public Level(Vector2 size, Vector2 camSize, KeyboardConroller c) {
		this.sizeInTiles = size;
		map = new ArrayList<MapTile>();
		barrel = new ArrayList<Barrel>();
		controller = c;
		oneTileSize = new Vector2(camSize.x / size.x, camSize.y / size.y);
	}

	public void addMapTile(MapTile m) {
		map.add(m);
		if (m.getType() == MapTile.TARGET) {
			totalTargetCount += 1;
		}
	}

	public void spawnPlayer(Player p, Vector2 pos) {
		this.player = p;
		p.spawn(pos, oneTileSize);
	}

	public void spawnBarrel(Barrel b, Vector2 pos) {
		b.spawn(pos, oneTileSize);
		barrel.add(b);
	}

	public void draw(SpriteBatch batch, Vector2 camSize) {

		for (int i = 0; i < sizeInTiles.x; i++) {
			for (int j = 0; j < sizeInTiles.y; j++) {
				// oś y jest obrócona!
				batch.draw(getTileBasedOnArrayIndex(i, (int) (sizeInTiles.y - j - 1)).getSprite(),
						i * oneTileSize.x - (camSize.x / 2), j * oneTileSize.y - (camSize.y / 2), oneTileSize.x,
						oneTileSize.y);
			}
		}
		player.render(batch, new Vector2(oneTileSize.x * 1.5f, oneTileSize.y * 1.5f));
		for (Barrel b : barrel) {
			b.render(batch, new Vector2(oneTileSize.x * 1.5f, oneTileSize.y * 1.5f));
		}
	}

	public void logicStep() {
		int direction = Movable.NO_MOVEMENT;

		if (controller.down) {
			direction = Movable.DOWN;
		}
		if (controller.up) {
			direction = Movable.UP;
		}
		if (controller.left) {
			direction = Movable.LEFT;
		}
		if (controller.right) {
			direction = Movable.RIGHT;
		}

		if (direction != Movable.NO_MOVEMENT) {
			if (canPlayerMove(direction, true) != 0b11) {
				player.move(direction);
			}

		}

		player.logicStep();
		for (Barrel barrel2 : barrel) {
			barrel2.logicStep();
		}

		// sprawdzanie czy gra jest wygrana
		for (Barrel b : barrel) {
			if (b.justFinishedMoving) {
				System.out.println(b.getPos().x + " " + b.getPos().y + " "
						+ getTileBasedOnMapPosition(b.getPos().x, b.getPos().y).getType());
				if (getTileBasedOnMapPosition(b.getPos().x, b.getPos().y).getType() == MapTile.TARGET) {
					currentTargetCount += 1;
					System.out.println(currentTargetCount);
				}
				b.justFinishedMoving = false;
			}
		}

		if (totalTargetCount <= currentTargetCount) {
			levelFinished = true;
		}
	}

	private int canPlayerMove(int direction, boolean doIMoveBarrel1) {
		// 0b01 = popychalna znaleziona
		// 0b10 && 0b00 = można iść
		// 0b11 = nie można iść
		int ret = 0b00;
		Barrel barrelToMove = null;
		if (direction == Movable.DOWN) {
			for (Barrel b : barrel) {
				// gracz->ściana
				if (getTileBasedOnMapPosition(b.getPos().x, player.getPos().y - oneTileSize.y)
						.getType() == MapTile.WALL) {
					ret = 0b11;
				}

				if (player.getPos().x == b.getPos().x) {
					// gracz->beczka
					if (player.getPos().y - oneTileSize.y == b.getPos().y) {
						ret |= 0b01;
						barrelToMove = b;
					}
					// gracz -> beczka -> ściana
					if (ret == 0b01 && getTileBasedOnMapPosition(b.getPos().x, player.getPos().y - 2 * oneTileSize.y)
							.getType() == MapTile.WALL) {
						ret = 0b11;
					}

					// gracz -> X -> beczka
					if (player.getPos().y - 2 * oneTileSize.y == b.getPos().y) {
						ret |= 0b10;
					}
				}
			}
		} else if (direction == Movable.UP) {
			for (Barrel b : barrel) {
				// gracz->ściana
				if (getTileBasedOnMapPosition(b.getPos().x, player.getPos().y + oneTileSize.y)
						.getType() == MapTile.WALL) {
					ret = 0b11;
				}

				if (player.getPos().x == b.getPos().x) {

					if (player.getPos().y + oneTileSize.y == b.getPos().y) {
						ret |= 0b01;
						barrelToMove = b;
					}
					// gracz -> beczka -> ściana
					if (ret == 0b01 && getTileBasedOnMapPosition(b.getPos().x, player.getPos().y + 2 * oneTileSize.y)
							.getType() == MapTile.WALL) {
						ret = 0b11;
					}
					if (player.getPos().y + 2 * oneTileSize.y == b.getPos().y) {
						ret |= 0b10;
					}
				}
			}
		} else if (direction == Movable.LEFT) {

			for (Barrel b : barrel) {
				// gracz->ściana
				if (getTileBasedOnMapPosition(player.getPos().x - oneTileSize.x, b.getPos().y)
						.getType() == MapTile.WALL) {
					ret = 0b11;
				}

				if (player.getPos().y == b.getPos().y) {
					if (player.getPos().x - oneTileSize.x == b.getPos().x) {
						ret |= 0b01;
						barrelToMove = b;
					}
					// gracz -> beczka -> ściana
					if (ret == 0b01 && getTileBasedOnMapPosition(player.getPos().x - 2 * oneTileSize.x, b.getPos().y)
							.getType() == MapTile.WALL) {
						ret = 0b11;
					}
					if (player.getPos().x - 2 * oneTileSize.x == b.getPos().x) {
						ret |= 0b10;
					}
				}
			}
		} else if (direction == Movable.RIGHT) {
			for (Barrel b : barrel) {
				// gracz->ściana
				if (getTileBasedOnMapPosition(player.getPos().x + oneTileSize.x, b.getPos().y)
						.getType() == MapTile.WALL) {
					ret = 0b11;
				}
				if (player.getPos().y == b.getPos().y) {
					if (player.getPos().x + oneTileSize.x == b.getPos().x) {
						ret |= 0b01;
						barrelToMove = b;
					}
					// gracz -> beczka -> ściana
					if (ret == 0b01 && getTileBasedOnMapPosition(player.getPos().x + 2 * oneTileSize.x, b.getPos().y)
							.getType() == MapTile.WALL) {
						ret = 0b11;
					}
					if (player.getPos().x - 2 * oneTileSize.x == b.getPos().x) {
						ret |= 0b10;
					}
				}
			}
		}
		if (doIMoveBarrel1 && ret == 0b01) {
			barrelToMove.move(direction);
		}
		return ret;
	}

	// UWAGA! W kolejnośći y,x są argumenty
	private MapTile getTileBasedOnArrayIndex(int y, int x) {
		if (y < sizeInTiles.y && x < sizeInTiles.x) {
			return map.get((int) (sizeInTiles.y * x + y));
		}
		return null;
	}

	private MapTile getTileBasedOnMapPosition(float x, float y) {
		Vector2 sizeInPixels = new Vector2(sizeInTiles.x * oneTileSize.x, sizeInTiles.y * oneTileSize.y);
		// skalowanie i przesuniecie
		int indexX = (int) ((x + sizeInPixels.x / 2) / oneTileSize.x);
		// skalowanie przesunięcie i odbicie
		int indexY = (int) ((sizeInPixels.y - y - sizeInPixels.y / 2) / oneTileSize.y);
		// System.out.println(
		// indexX + " " + indexY + " " + x + " " + y + "+" +
		// getTileBasedOnArrayIndex(indexY, indexX).getType());
		return getTileBasedOnArrayIndex(indexX, indexY);
	}
}
