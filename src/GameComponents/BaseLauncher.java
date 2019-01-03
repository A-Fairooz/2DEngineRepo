package GameComponents;
import processing.core.PApplet;

public abstract class  BaseLauncher implements KeyInput{
	
	public PApplet parent;
	public GameManager gameManager;
	
	
	public BaseLauncher(PApplet p) {
		parent = p;
		gameManager = new GameManager(parent);
	}
	
	public abstract void StartGame();
	
	public void UpdateAll() {
		gameManager.UpdateAll();
	}	
}
