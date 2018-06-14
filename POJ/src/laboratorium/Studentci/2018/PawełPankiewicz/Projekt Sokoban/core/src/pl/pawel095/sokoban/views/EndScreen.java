package pl.pawel095.sokoban.views;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.utils.ChangeListener;
import com.badlogic.gdx.utils.viewport.ScreenViewport;

import pl.pawel095.sokoban.Main;
import pl.pawel095.sokoban.loader.AssetLoader;

public class EndScreen extends basicScreen {

	private Stage stage;

	public EndScreen(Main parent) {
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
		
		Label congratulationsLabel=new Label("Congratulations!", skin);
		
		TextButton newGame = new TextButton("Back to menu", skin);
		newGame.addListener(new ChangeListener() {

			@Override
			public void changed(ChangeEvent event, Actor actor) {
				parent.changeScreen(Main.MENU);
			}
		});
		table.add(congratulationsLabel);
		table.row().pad(10, 0, 10, 0);
		table.add(newGame).fillX().uniformX();
		table.row().pad(10, 0, 10, 0);

	}

	@Override
	public void render(float delta) {
		Gdx.gl.glClearColor(153f, 153f, 153f, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		stage.act(Math.min(Gdx.graphics.getDeltaTime(), 1 / 30f));
		stage.draw();

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
