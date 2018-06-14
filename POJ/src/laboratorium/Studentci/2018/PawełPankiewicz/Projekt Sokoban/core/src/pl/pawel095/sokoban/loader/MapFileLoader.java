package pl.pawel095.sokoban.loader;

import com.badlogic.gdx.assets.AssetDescriptor;
import com.badlogic.gdx.assets.AssetLoaderParameters;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.assets.loaders.FileHandleResolver;
import com.badlogic.gdx.assets.loaders.SynchronousAssetLoader;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.utils.Array;

import pl.pawel095.sokoban.mapfile.MapFile;

public class MapFileLoader extends SynchronousAssetLoader<MapFile, MapFileLoader.MapFileParameter>{
	
	private MapFile mapFile;
	
	public MapFileLoader(FileHandleResolver resolver) {
		super(resolver);
	}
	
	protected MapFile getLoadedMapFile() {
		return mapFile;
	}
	
	static public class MapFileParameter extends AssetLoaderParameters<MapFile>{}

	@Override
	public MapFile load(AssetManager assetManager, String fileName, FileHandle file, MapFileParameter parameter) {
		return new MapFile(file);
	}

	@SuppressWarnings("rawtypes")
	@Override
	public Array<AssetDescriptor> getDependencies(String fileName, FileHandle file, MapFileParameter parameter) {
		return null;
	}
}
