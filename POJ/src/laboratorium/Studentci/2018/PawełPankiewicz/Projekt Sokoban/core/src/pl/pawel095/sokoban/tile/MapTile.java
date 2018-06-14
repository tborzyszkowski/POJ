package pl.pawel095.sokoban.tile;

import com.badlogic.gdx.graphics.g2d.Sprite;

public interface MapTile {
	public static final int WALL = 1;
	public static final int FLOOR = 2;
	public static final int TARGET = 3;
	
	public int getType();
	public Sprite getSprite();
}
