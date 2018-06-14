package pl.pawel095.sokoban.tile;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;

import pl.pawel095.sokoban.Main;
import pl.pawel095.sokoban.loader.AssetLoader;

public class TargetTile implements MapTile{

	private Sprite s;
	@Override
	public int getType() {
		return MapTile.TARGET;
	}

	public TargetTile() {
		s = new Sprite( (Texture)Main.getAssetLoader().manager.get(AssetLoader.worldTarget));
	}
	@Override
	public Sprite getSprite() {
		
		return s;
	}

}
