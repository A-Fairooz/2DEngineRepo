import processing.core.PApplet;
import Platformer.Launcher;

public class Main extends PApplet{
	
	public Launcher launcher;
	public int sW = 800;
	public int sH = 800;
	
	public static void main(String[] args) {		
		PApplet.main("Main");
	
	}
	
	
	public void settings() {
		size(800, 800);
		launcher = new Launcher(this);
	}
	
	
	
	public void draw() {
		background(0);
		launcher.UpdateAll();
	}
	
	
	

	public void keyPressed() {
		launcher.keyPressed(key, keyCode);
	}
	
	public void keyReleased() {
		launcher.keyReleased(key, keyCode);
	}
	
	public void mouseClicked() {
		launcher.mouseClicked(mouseX, mouseY, mouseButton);
		}
}
