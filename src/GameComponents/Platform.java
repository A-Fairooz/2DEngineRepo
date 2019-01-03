package GameComponents;

import processing.core.*;
public class Platform extends Sprite{

	
	public void DrawPlatform(PApplet p, int x, int y, int w, int h, int c) {
		p.rect(x, y, w, h);
	}
	
	
}
