package GameComponents;

import processing.core.PApplet;
import java.util.ArrayList;

public abstract class GameObject extends ProcessingEntity implements ProcessingInterface, KeyInput {
	public String name;
	public String tag;
	public String layer;
	
	
	public ArrayList<GameComponent> components;
	public Transform transform = new Transform();
	
	public GameObject(PApplet p) {
		super(p);
		this.components = new ArrayList<GameComponent>();
	}
	
	
	
	public abstract void start();
	public abstract void render();
	public abstract void update();
	
	
	
	public String ToString() {
		return this.name;
	}
	
}
