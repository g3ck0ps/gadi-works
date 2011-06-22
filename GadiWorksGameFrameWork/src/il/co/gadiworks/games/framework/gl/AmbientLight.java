package il.co.gadiworks.games.framework.gl;

import javax.microedition.khronos.opengles.GL10;

public class AmbientLight {
	float[] color = {0.2f, 0.2f, 0.2f, 1};
	
	public void setColor(float r, float g, float b, float a) {
		this.color[0] = r;
		this.color[1] = g;
		this.color[2] = b;
		this.color[3] = a;
	}
	
	public void enable(GL10 gl) {
		gl.glLightModelfv(GL10.GL_LIGHT_MODEL_AMBIENT, this.color, 0);
	}
}
