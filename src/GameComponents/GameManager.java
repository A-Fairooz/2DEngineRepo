package GameComponents;

import processing.core.*;
import java.util.ArrayList;

public class GameManager extends ProcessingEntity{

	
	public int background = 0;
	
	private ArrayList<GameObject> GUIGameObjects;
	private ArrayList<GameObject> gameObjects;
	private ArrayList<GameObject> playerGameObjects;
	
	public static PVector offset = new PVector(0,0);
	public static PVector screenOffset = new PVector(0,0);
	
	public GameManager(PApplet p) {
		super(p);
		this.name = "GameManager";
		
		screenOffset.x = parent.width / 2;
		screenOffset.y = parent.height / 2;
		this.Initialise();
	}
	
	
	public void Initialise() {
		gameObjects = new ArrayList<GameObject>();
		playerGameObjects = new ArrayList<GameObject>();
		GUIGameObjects = new ArrayList<GameObject>();
		
	}
	
	public void addPlayerGameObjects(GameObject b) {
		playerGameObjects.add(b);
	}
	
	public void addObject(GameObject g) {
		gameObjects.add(g);
	}
	public void removeObject(GameObject g) {
		gameObjects.remove(gameObjects.lastIndexOf(g));
	}
	
	
	
	public void replaceObjects(ArrayList<GameObject> _gameObjects) {
		gameObjects = _gameObjects;
	}	
	public void replaceGUIObjects(ArrayList<GameObject> _gameObjects) {
		GUIGameObjects = _gameObjects;
	}
	public void replacePlayerObjects(ArrayList<GameObject> _gameObjects) {
		playerGameObjects = _gameObjects;
	}
	
	
	public void StartAll() {
		for(int i = 0; i < gameObjects.size(); i++) {
			GameObject g = gameObjects.get(i);
			g.start();
		}
	}
	
	public void UpdateAll() {
		parent.pushMatrix();
		parent.translate(offset.x, offset.y);
		parent.background(background);
		for(int i = 0; i < gameObjects.size(); i++) {
			GameObject g = gameObjects.get(i);
			g.update();
			g.render();
		}
		parent.popMatrix();
		for(int i = 0; i < GUIGameObjects.size(); i++) {
			GameObject g = GUIGameObjects.get(i);
			g.update();
			g.render();
		}
		
	}
	
	public void keyPressed(char key, int keyCode) {
		for(int i = 0; i <playerGameObjects.size(); i++) {
			GameObject g = playerGameObjects.get(i);
			g.keyPressed(key, keyCode);
		}
	}
	
	public void keyReleased(char key, int keyCode) {
		for (int i = 0; i < playerGameObjects.size(); i++) {
			GameObject g = playerGameObjects.get(i);
			g.keyReleased(key, keyCode);
			}
		}
	
	public void mouseClicked(int mouseX, int mouseY, int mouseButton) {
		for(int i = 0; i < playerGameObjects.size(); i++) {
			GameObject g = playerGameObjects.get(i);
			g.mouseClicked(mouseX, mouseY, mouseButton);
		}
	}
	
	
}
