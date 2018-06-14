package pl.pawel095.sokoban.movable;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

public interface Movable {
	public final static int UP = -1;
	public final static int DOWN = 0;
	public final static int LEFT = 2;
	public final static int RIGHT = 3;
	public final static int NO_MOVEMENT = -123;

	public void render(SpriteBatch batch, Vector2 size);

	public void logicStep();

	public void spawn(Vector2 pos, Vector2 deltaPrzesuniecie);

	public void move(int direction);

	public Vector2 getPos();
}
