package Platformer;

import processing.core.PApplet;
import processing.core.PVector;
import GameComponents.Sprite;
import GameComponents.*;
public class Player extends Sprite implements KeyInput  {

	private PVector size = new PVector (20,20);
	public int stroke = parent.color(120,120,255);
	public int fill = parent.color(255);	
	public int MoveDist = 10;
	
	public Player(PApplet p, float x, float y, float w, float h) {
		super(p);
		this.transform.position.x = x;
		this.transform.position.y = y;
		this.size.x = w;
		this.size.y = h;
		
	}

	@Override
	public void render() {
	
		
		parent.fill(this.fill);
		parent.stroke(this.stroke);
		parent.rect(this.transform.position.x,
					this.transform.position.y,
					this.size.x,
					this.size.y);
	
		
	}

	@Override
	public void start() {
	}

	@Override
	public void update() {

		
	}
	
	public void keyPressed(char key, int keyCode) {
		
		if (keyCode == PApplet.RIGHT) 
		   {
			  
			this.transform.position.x += MoveDist;					
		   }
		if (keyCode == PApplet.UP) 
		   {
			  
			this.transform.position.y -= MoveDist;						
		   }
		   
		if (keyCode == PApplet.LEFT) 
		   {
			  
			this.transform.position.x -= MoveDist;						
		   }
		   
		if (keyCode == PApplet.DOWN) 
		   {
			  
			this.transform.position.y += MoveDist;						
		   }
		   
		   
	}
	public void keyReleased(char key, int keyCode) {
		
	}
	public void mouseClicked(int mouseX, int mouseY, int mouseButton) {
	
	}
}
