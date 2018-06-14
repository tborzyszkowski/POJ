package pl.pawel095.sokoban;

import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.InputProcessor;

public class KeyboardConroller implements InputProcessor {

	public boolean up;
	public boolean down;
	public boolean left;
	public boolean right;
	// return true jeżeli keypress obsłużony

	@Override
	public boolean keyDown(int keycode) {
		switch (keycode) {
		case Keys.LEFT:
			left = true;
			return true;
		case Keys.RIGHT:
			right = true;
			return true;
		case Keys.UP:
			up = true;
			return true;

		case Keys.DOWN:
			down = true;
			return true;
		default:
			return false;
		}
	}

	@Override
	public boolean keyUp(int keycode) {
		switch (keycode) {
		case Keys.LEFT:
			left = false;
			return true;
		case Keys.RIGHT:
			right = false;
			return true;
		case Keys.UP:
			up = false;
			return true;

		case Keys.DOWN:
			down = false;
			return true;
		default:
			return false;
		}
		
	}

	@Override
	public boolean keyTyped(char character) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean touchDown(int screenX, int screenY, int pointer, int button) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean touchUp(int screenX, int screenY, int pointer, int button) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean touchDragged(int screenX, int screenY, int pointer) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean mouseMoved(int screenX, int screenY) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean scrolled(int amount) {
		// TODO Auto-generated method stub
		return false;
	}

}
