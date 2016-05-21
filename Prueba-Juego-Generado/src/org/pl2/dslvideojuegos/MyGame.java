package org.pl2.dslvideojuegos;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.collision.BoundingBox;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.actors.Image;
import java.util.Vector;


public class MyGame extends Game implements ApplicationListener{
		static final float WORLD_WIDTH = 800;
		static final float WORLD_HEIGHT = 480;
	
	Vector3 touchPoint = new Vector3();
	
	Vector stages = new Vector();
	Player prota;
	
	@Override
	public void create() {
		//referencia a OpenGL 1.0
		GL10 gl = Gdx.graphics.getGL10(); 
	    //creacion del protagonista
	    prota = new Player();
	    //creacion del vector de fases
			stages.add(new StageScreen(this));
			stages.add(new StageScreen(this));
	    setScreen((StageScreen)stages.get(0));
	}
}	