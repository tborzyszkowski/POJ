package pl.pawel095.sokoban.tile;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;

import pl.pawel095.sokoban.Main;
import pl.pawel095.sokoban.loader.AssetLoader;

public class WallTile implements MapTile {
	private Sprite s;

	public int getType() {
		return MapTile.WALL;
	}

	public WallTile() {
		s = new Sprite( (Texture)Main.getAssetLoader().manager.get(AssetLoader.worldWall));
	}

	@Override
	public Sprite getSprite() {
		return s;
	}
}