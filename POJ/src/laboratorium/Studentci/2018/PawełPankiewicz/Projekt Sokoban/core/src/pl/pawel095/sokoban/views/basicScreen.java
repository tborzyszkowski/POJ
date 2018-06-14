package pl.pawel095.sokoban.views;

import com.badlogic.gdx.Screen;

import pl.pawel095.sokoban.Main;

public abstract class basicScreen implements Screen {
	protected Main parent;

	public basicScreen(Main parent) {
		this.parent = parent;
	}

}
