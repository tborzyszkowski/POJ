package pl.pawel095.sokoban.mapfile;

import java.util.ArrayList;

import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.math.Vector2;

import pl.pawel095.sokoban.exception.BadMapFileException;
import pl.pawel095.sokoban.iterator.Iterator;

public class MapFile {

	private TileReader tileReader;
	private ArrayList<String> tileList = new ArrayList<String>();
	private Vector2 mapSize;
	private int numberOfTargets;


	public MapFile(FileHandle file) {
		try {
			tileReader = new TileReader(file.file());
			Iterator i=tileReader.getIterator();
			mapSize=new Vector2();
			mapSize.x=Integer.parseInt((String) i.next());
			mapSize.y=Integer.parseInt((String) i.next());
			
			while (tileReader.getIterator().hasNext()) {
				tileList.add((String) tileReader.getIterator().next());
			}
			checkMapValidity();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public ArrayList<String> getStringTileList() {
		return tileList;
	}
	public Vector2 getMapSize() {
		return mapSize;
	}
	
	private boolean checkMapValidity() throws BadMapFileException {
		int numberOfBarrels = 0, numberOfTargets = 0, numberOfSpawns = 0;
		boolean unknownSymbols = false;

		for (String string : tileList) {
			switch (string) {
			case "s":
				numberOfBarrels += 1;
				break;
			case "c":
				numberOfTargets += 1;
				break;
			case "g":
				numberOfSpawns += 1;
				break;
			case "w":
				break;
			case "p":
				break;
			default:
				unknownSymbols = true;
				break;
			}
		}
		if (numberOfBarrels >= numberOfTargets && numberOfSpawns == 1 && !unknownSymbols) {
			this.numberOfTargets=numberOfTargets;
			return true;
		} else {
			throw new BadMapFileException();
		}
	}
	public int getNumberOfTargets() {
		return numberOfTargets;
	}
}
