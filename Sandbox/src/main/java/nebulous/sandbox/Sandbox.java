package nebulous.sandbox;

import nebulous.loreEngine.core.game.Game;
import nebulous.loreEngine.core.game.Scene;
import nebulous.loreEngine.core.game.Window;
import nebulous.loreEngine.core.graphics.Texture;

public class Sandbox extends Game {

	public Scene testScene = new TestScene();
	
	public Sandbox(Window window) {
		super(window);
	}

	@Override
	public void onPreInit() {
		
	}
	
	@Override
	public void onInit() {
		window.center();
		
		final Texture BLUE 		= Texture.create("textures/default.png");
		final Texture ORANGE 	= Texture.create("textures/default2.png");
		final Texture ANIM 		= Texture.create("textures/default_animated.png");
		
		registerTexture("blue", BLUE);
		registerTexture("orange", ORANGE);
		registerTexture("anim", ANIM);
		registerScene("testScene", testScene);
	}

	@Override
	public void onStart() {
		loadScene("testScene");
	}

	@Override
	public void onStop() {
		
	}
	
	public static void main(String[] args) {
		Window window = new Window("Sandbox", 1360, 720);
		Game game = new Sandbox(window);
		game.start();
	}

}
