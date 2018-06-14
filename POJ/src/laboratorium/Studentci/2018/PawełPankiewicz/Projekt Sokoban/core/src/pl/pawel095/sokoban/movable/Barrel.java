package pl.pawel095.sokoban.movable;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Vector2;

import pl.pawel095.sokoban.Main;
import pl.pawel095.sokoban.loader.AssetLoader;

public class Barrel implements Movable {
	public static final float speedModifier = 7;

	private Vector2 pos;
	private Vector2 oneTileSize;
	private TextureRegion barrel;

	private Vector2 movementSpeed;
	private Vector2 movementDirection;
	private Vector2 movementTarget;

	private float rotation = 0;
	private boolean moving = false;
	private float timeSpentMoving = 0f;
	public boolean justFinishedMoving=false;

	public Barrel() {
		Texture tmp = Main.getAssetLoader().manager.get(AssetLoader.worldBarrel);
		barrel = new TextureRegion();
		barrel.setRegion(tmp);
		movementDirection = new Vector2();
		movementSpeed = new Vector2();
		movementTarget = new Vector2();
	}
	
	@Override
	public void spawn(Vector2 pos, Vector2 deltaPrzesuniecie) {
		this.pos = pos;
		oneTileSize = deltaPrzesuniecie;
		movementSpeed = new Vector2(speedModifier * deltaPrzesuniecie.x / 2, speedModifier * deltaPrzesuniecie.y / 2);
	}

	@Override
	public void render(SpriteBatch batch, Vector2 size) {
		batch.draw(barrel, pos.x - size.x / 2, pos.y - size.y / 2, size.x / 2, size.y / 2, size.x, size.y, 1, 1,
				rotation, true);
	}

	@Override
	public void move(int direction) {
		if (!moving) {
			if (direction == Movable.DOWN) {
				movementDirection.x = 0;
				movementDirection.y = -1;
				movementTarget.x = pos.x;
				movementTarget.y = pos.y - oneTileSize.y;
				rotation = 90;

			} else if (direction == Movable.UP) {
				movementDirection.x = 0;
				movementDirection.y = 1;
				movementTarget.x = pos.x;
				movementTarget.y = pos.y + oneTileSize.y;
				rotation = 90;
			} else if (direction == Movable.LEFT) {
				movementDirection.x = -1;
				movementDirection.y = 0;
				movementTarget.y = pos.y;
				movementTarget.x = pos.x - oneTileSize.x;
				rotation = 0;
			} else if (direction == Movable.RIGHT) {
				movementDirection.x = 1;
				movementDirection.y = 0;
				movementTarget.y = pos.y;
				movementTarget.x = pos.x + oneTileSize.x;
				rotation = 0;
			}

			timeSpentMoving = 0;
			moving = true;
		}
	}

	@Override
	public void logicStep() {
		// 2 to orginalny czas animacji gracza
		if (moving) {

			pos.x += movementSpeed.x * Gdx.graphics.getDeltaTime() * movementDirection.x;
			pos.y += movementSpeed.y * Gdx.graphics.getDeltaTime() * movementDirection.y;

		}
		timeSpentMoving += Gdx.graphics.getDeltaTime();
		if (moving && timeSpentMoving >= (2 / speedModifier)) {
			moving = false;
			pos.x = movementTarget.x;
			pos.y = movementTarget.y;
			justFinishedMoving=true;
		}
	}

	@Override
	public Vector2 getPos() {
		return pos;
	}
	
	public Vector2 getMovementTarget() {
		return movementTarget;
	}
}
