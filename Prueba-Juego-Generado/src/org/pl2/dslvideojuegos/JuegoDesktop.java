package org.pl2.dslvideojuegos;

import com.badlogic.gdx.backends.jogl.JoglApplication;

public class JuegoDesktop {
	public static void main (String[] argv) {
		int width = 800;
		int height = 480;
		new JoglApplication(new MyGame(), "Arcade Tongame", width, height, false);
	}
}	