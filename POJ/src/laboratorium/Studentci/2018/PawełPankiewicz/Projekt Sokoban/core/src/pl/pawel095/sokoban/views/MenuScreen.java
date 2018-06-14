package pl.pawel095.sokoban.views;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.utils.ChangeListener;
import com.badlogic.gdx.utils.viewport.ScreenViewport;

import pl.pawel095.sokoban.Main;
import pl.pawel095.sokoban.loader.AssetLoader;

public class MenuScreen extends basicScreen {
	private Stage stage;

	public MenuScreen(final Main parent) {
		super(parent);
		stage = new Stage(new ScreenViewport());

	}

	@Override
	public void show() {

		Gdx.input.setInputProcessor(stage);
		Table table = new Table();
		table.setFillParent(true);
		// table.setDebug(true);
		stage.addActor(table);

		Skin skin = Main.getAssetLoader().manager.get(AssetLoader.skin);

		TextButton newGame = new TextButton("New Game", skin);
		newGame.addListener(new ChangeListener() {

			@Override
			public void changed(ChangeEvent event, Actor actor) {
				parent.changeScreen(Main.APPLICATION);
			}
		});
		TextButton exit = new TextButton("Exit", skin);
		exit.addListener(new ChangeListener() {
			@Override
			public void changed(ChangeEvent event, Actor actor) {
				Gdx.app.exit();
			}
		});

		table.add(newGame).fillX().uniformX();
		table.row().pad(10, 0, 10, 0);
		table.row();
		table.add(exit).fillX().uniformX();

	}

	@Override
	public void render(float delta) {
		// czyszczenie ekranu
		Gdx.gl.glClearColor(153f, 153f, 153f, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		stage.act(Math.min(Gdx.graphics.getDeltaTime(), 1 / 30f));
		stage.draw();

	}

	@Override
	public void resize(int width, int height) {
		stage.getViewport().update(width, height, true);

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
		stage.clear();
	}

	@Override
	public void dispose() {
		stage.dispose();
	}

}
