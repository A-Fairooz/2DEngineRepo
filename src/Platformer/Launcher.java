package Platformer;

import processing.core.PApplet;
import GameComponents.*;
import java.util.ArrayList;

public class Launcher extends BaseLauncher {
	
	
	public boolean started = false;
	int waiting = 0;
	public Launcher(PApplet p) {
		super(p);
		StartGame();
		
	}

	public void keyPressed(char key, int keyCode) {
		super.keyPressed(key, keyCode);
		//activeScreen.keyPressed(key, keyCode);
	}

	public void keyReleased(char key, int keyCode) {
		super.keyReleased(key, keyCode);
		//activeScreen.keyReleased(key, keyCode);

	}
	public void mouseClicked(int mouseX, int mouseY, int mouseButton) {
		super.mouseClicked(mouseX,mouseY,mouseButton);
		//activeScreen.mouseClicked(mouseX,mouseY,mouseButton);
		
		
		
		
		
	}
	
	public void StartGame() {
		//StartScreen startScreen = new StartScreen(parent, this.gameManager);
		//GameLevel gameLevel = new GameLevel(parent, this.gameManager);
		//LevelEditor levelEditor = new LevelEditor(parent, this.gameManager);
		//activeScreen = startScreen;
		started = true;	
		//startScreen.exitScreensAdd(gameLevel);		
		//startScreen.exitScreensAdd(levelEditor);
		//levelEditor.exitScreensAdd(startScreen);
		//gameLevel.exitScreensAdd(startScreen);
	
		
		this.gameManager.StartAll();
	
	}
	
	
	
	public void UpdateAll() {
		super.UpdateAll();
		
	
	}
}
