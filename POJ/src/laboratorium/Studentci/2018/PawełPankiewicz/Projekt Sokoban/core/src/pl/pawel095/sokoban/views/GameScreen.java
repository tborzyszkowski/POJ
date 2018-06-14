package pl.pawel095.sokoban.views;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

import pl.pawel095.sokoban.KeyboardConroller;
import pl.pawel095.sokoban.Level;
import pl.pawel095.sokoban.LevelBuilder;
import pl.pawel095.sokoban.Main;
import pl.pawel095.sokoban.loader.AssetLoader;

public class GameScreen extends basicScreen {

	private KeyboardConroller controller;
	private Level l;
	private SpriteBatch batch;
	private OrthographicCamera cam;
	private Vector2 camSize=new Vector2(70,70);
	public GameScreen(Main parent) {
		super(parent);

		controller = new KeyboardConroller();
		
		cam=new OrthographicCamera(camSize.x,camSize.y);
		batch=new SpriteBatch();
		batch.setProjectionMatrix(cam.combined);
		
		LevelBuilder lb=new LevelBuilder();
		l=lb.buildLevel(Main.getAssetLoader().manager.get(AssetLoader.level1),camSize,controller);
		
	}

	@Override
	public void show() {
		Gdx.input.setInputProcessor(controller);

	}

	@Override
	public void render(float delta) {
		l.logicStep();
		Gdx.gl.glClearColor(0f, 0f, 0f, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		l.draw(batch,camSize);
		batch.end();
		
		//jeżeli poziom rozwiązany to gotoEndScreen
		if (l.levelFinished) {
			parent.changeScreen(Main.ENDGAME);
		}
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
