package pl.pawel095.sokoban.tile;

public class MapTileFactory {
	
	public MapTile getMapTile(int type) {
		switch (type) {
		case MapTile.FLOOR:
			return new FloorTile();
		case MapTile.TARGET:
			return new TargetTile();
		case MapTile.WALL:
			return new WallTile();
		default:
			return null;
		}
	}
	public MapTile getMapTile(String s) {
		char type=s.charAt(0);
		switch (type) {
		case 'g':
		case 's':
		case 'p':
			return new FloorTile();
		case 'c':
			return new TargetTile();
		case 'w':
			return new WallTile();
		default:
			return null;
		}
	}
	
}
