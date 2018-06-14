package pl.pawel095.sokoban;

import com.badlogic.gdx.Game;

import pl.pawel095.sokoban.loader.AssetLoader;
import pl.pawel095.sokoban.views.EndScreen;
import pl.pawel095.sokoban.views.GameScreen;
import pl.pawel095.sokoban.views.LoadingScreen;
import pl.pawel095.sokoban.views.MenuScreen;

public class Main extends Game {

	private LoadingScreen loadingScreen;
	private MenuScreen menuScreen;
	private GameScreen gameScreen;
	private EndScreen endScreen;

	private static AssetLoader assetLoader;

	public final static int MENU = 0;
	public final static int APPLICATION = 2;
	public final static int ENDGAME = 3;

	@Override
	public void create() {
		assetLoader = new AssetLoader();
		assetLoader.loadAssets();
		loadingScreen = new LoadingScreen(this);
		setScreen(loadingScreen);
	}

	public static AssetLoader getAssetLoader() {
		//nie powino być odpalone przed wykonianiem create()
		return assetLoader;
	}
	
	public void changeScreen(int screen) {
		// System.out.println("changeScreen: "+screen);
		switch (screen) {
		case MENU:
			if (menuScreen == null)
				menuScreen = new MenuScreen(this);
			this.setScreen(menuScreen);
			break;
		case APPLICATION:
			if (gameScreen == null)
				gameScreen = new GameScreen(this);
			this.setScreen(gameScreen);
			break;
		case ENDGAME:
			if (endScreen == null)
				endScreen = new EndScreen(this);
			this.setScreen(endScreen);
			break;
		}
	}
}
