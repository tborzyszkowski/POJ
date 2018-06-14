package pl.pawel095.sokoban.views;

import pl.pawel095.sokoban.Main;

public class LoadingScreen extends basicScreen {

	public LoadingScreen(Main parent) {
		super(parent);
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub

	}

	@Override
	public void render(float delta) {
		Main.getAssetLoader().manager.finishLoading();
		parent.changeScreen(Main.MENU);
	}

	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub

	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub

	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub

	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub

	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

}
