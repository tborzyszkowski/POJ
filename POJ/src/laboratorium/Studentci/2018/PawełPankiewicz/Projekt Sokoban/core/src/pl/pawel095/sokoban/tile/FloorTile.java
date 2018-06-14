package pl.pawel095.sokoban.tile;

import java.util.Random;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;

import pl.pawel095.sokoban.Main;
import pl.pawel095.sokoban.loader.AssetLoader;

public class FloorTile implements MapTile{

	private Sprite s;
	
	public FloorTile() {
		Random r=new Random();
		int index=1+r.nextInt(50);
		TextureAtlas atlas=Main.getAssetLoader().manager.get(AssetLoader.worldFloor);
		s=atlas.createSprite("Floor", index);
	}
	
	@Override
	public int getType() {
		return MapTile.FLOOR;
	}

	@Override
	public Sprite getSprite() {
		return s;
	}
	
	


}
