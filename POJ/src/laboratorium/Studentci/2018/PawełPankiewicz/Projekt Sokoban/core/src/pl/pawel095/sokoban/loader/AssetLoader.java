package pl.pawel095.sokoban.loader;

import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.assets.loaders.resolvers.InternalFileHandleResolver;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;

import pl.pawel095.sokoban.mapfile.MapFile;

public class AssetLoader {
	public final AssetManager manager = new AssetManager();

	public static final String playerIdle = "sprites/player/statics/idle.png";
	public static final String playerWalk = "sprites/player/anims/Walk.atlas";
	public static final String playerSpawn = "sprites/player/anims/Spawn.atlas";

	public static final String worldBarrel = "sprites/enviroinment/statics/barrel.png";
	public static final String worldFloor = "sprites/enviroinment/statics/tiles/Floor.atlas";
	public static final String worldWall = "sprites/enviroinment/statics/tiles/wall.png";
	public static final String worldTarget="sprites/enviroinment/statics/tiles/target.png";

	public static final String level1 = "maps/level1.map";
	
	public static final String skin="skins/gdx-holo/skin/uiskin.json";

	public void loadAssets() {
		manager.setLoader(MapFile.class, new MapFileLoader(new InternalFileHandleResolver()));

		manager.load(playerIdle, Texture.class);
		manager.load(playerWalk, TextureAtlas.class);
		manager.load(playerSpawn, TextureAtlas.class);

		manager.load(worldBarrel, Texture.class);
		manager.load(worldFloor, TextureAtlas.class);
		manager.load(worldWall, Texture.class);
		manager.load(worldTarget, Texture.class);
		
		manager.load(level1, MapFile.class);
		
		manager.load(skin, Skin.class);
	}
}
