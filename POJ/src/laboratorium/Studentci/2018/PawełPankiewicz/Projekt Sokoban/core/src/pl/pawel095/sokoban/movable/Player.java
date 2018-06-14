package pl.pawel095.sokoban.movable;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Vector2;

import pl.pawel095.sokoban.Main;
import pl.pawel095.sokoban.loader.AssetLoader;

public class Player implements Movable {

	public static final float speedModifier = 4;

	private Vector2 pos;
	private Animation<TextureRegion> walkAnimation;
	private Animation<TextureRegion> spawnAnimation;
	private TextureRegion idle;
	private Vector2 movementSpeed;
	private Vector2 oneTileSize;

	private boolean animating = false;
	private boolean justFinishedWalking = false;
	private float animationState = 0f;
	private Animation<TextureRegion> currentAnimation;
	private Vector2 movementDirection;
	private float rotation = 0;

	private Vector2 movementTarget;

	public Player() {
		movementTarget = new Vector2();
		walkAnimation = new Animation<TextureRegion>(1 / (30 * speedModifier),
				Main.getAssetLoader().manager.get(AssetLoader.playerWalk, TextureAtlas.class).getRegions());
		spawnAnimation = new Animation<TextureRegion>(1 / 30f,
				Main.getAssetLoader().manager.get(AssetLoader.playerSpawn, TextureAtlas.class).getRegions());

		Texture tmp = Main.getAssetLoader().manager.get(AssetLoader.playerIdle);
		idle = new TextureRegion();
		idle.setRegion(tmp);
		movementDirection = new Vector2();

	}

	@Override
	public void spawn(Vector2 pos, Vector2 deltaPrzesuniecie) {
		this.pos = pos;
		oneTileSize = deltaPrzesuniecie;
		movementSpeed = new Vector2(speedModifier * deltaPrzesuniecie.x / 2, speedModifier * deltaPrzesuniecie.y / 2);
		currentAnimation = spawnAnimation;
		animationState = 0f;
		animating = true;
	}

	@Override
	public void render(SpriteBatch batch, Vector2 size) {
		if (animating) {
			TextureRegion currentFrame = currentAnimation.getKeyFrame(animationState);
			// draw(TextureRegion region, float x , float y , float originX , float originY
			// , float width, float height, float scaleX, float scaleY, float rotation,
			// boolean clockwise)
			batch.draw(currentFrame, pos.x - size.x / 2, pos.y - size.y / 2, size.x / 2, size.y / 2, size.x, size.y, 1,
					1, rotation, true);
		} else {
			batch.draw(idle, pos.x - size.x / 2, pos.y - size.y / 2, size.x / 2, size.y / 2, size.x, size.y, 1, 1,
					rotation, true);
		}
	}

	@Override
	public void move(int direction) {
		if (!animating) {
			if (direction == Movable.DOWN) {
				movementDirection.x = 0;
				movementDirection.y = -1;
				movementTarget.x = pos.x;
				movementTarget.y = pos.y - oneTileSize.y;
				rotation = 0;
			} else if (direction == Movable.UP) {
				movementDirection.x = 0;
				movementDirection.y = 1;
				movementTarget.x = pos.x;
				movementTarget.y = pos.y + oneTileSize.y;
				rotation = 180;
			} else if (direction == Movable.LEFT) {
				movementDirection.x = -1;
				movementDirection.y = 0;
				movementTarget.x = pos.x - oneTileSize.x;
				movementTarget.y = pos.y;
				rotation = 90;
			} else if (direction == Movable.RIGHT) {
				movementDirection.x = 1;
				movementDirection.y = 0;
				movementTarget.x = pos.x + oneTileSize.x;
				movementTarget.y = pos.y;
				rotation = 270;
			}
			animating = true;
			animationState = 0f;
			currentAnimation = walkAnimation;
			// System.out.println("moving to " + movementDirection.x + "," +
			// movementDirection.y);
		}
	}

	@Override
	public void logicStep() {
		animationState += Gdx.graphics.getDeltaTime();
		if (currentAnimation.isAnimationFinished(animationState)) {
			animating = false;
			if (currentAnimation == walkAnimation) {
				justFinishedWalking = true;
			}
		}

		if (animating && currentAnimation == walkAnimation) {
			pos.x += movementSpeed.x * Gdx.graphics.getDeltaTime() * movementDirection.x;
			pos.y += movementSpeed.y * Gdx.graphics.getDeltaTime() * movementDirection.y;
		}

		if (justFinishedWalking) {
			justFinishedWalking = false;
			pos.x = movementTarget.x;
			pos.y = movementTarget.y;
		}
	}

	@Override
	public Vector2 getPos() {
		return pos;
	}
}
