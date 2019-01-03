package Platformer;
import GameComponents.Sprite;
import GameComponents.GameManager;
import Platformer.Player;
import processing.core.PApplet;
import GameComponents.BaseLauncher;


public class Launcher extends BaseLauncher{
	//public PApplet parent; // The parent PApplet that we will render ourselves onto
	
	public Player player;
	public Launcher(PApplet p) {
		super(p);
		StartGame();
		
	}

	@Override
	public void keyPressed(char key, int keyCode) {
		player.keyPressed(key, keyCode);

	}

	@Override
	public void keyReleased(char key, int keyCode) {
		// TODO Auto-generated method stub
		player.keyReleased(key, keyCode);
	}
	
	@Override
	public void mouseClicked(int mouseX, int mouseY, int mouseButton) {
		
	}
		// TODO Auto-generated method stub
	@Override
	public void StartGame() {

		parent.println(parent.width + ", " + parent.height);
		player = new Player(parent, parent.width/2,  parent.height/2, 20, 20);
		parent.println(player.transform.position.x+ ", " + player.transform.position.y);
		
		gameManager.addObject(player);
		gameManager.addPlayerGameObjects(player);
		player.start();
	}


}