package org.pl2.dslvideojuegos;

import java.util.Iterator;
import java.util.Vector;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.scenes.scene2d.actors.Image;

public class Player {
	private static final int FRAME_COLS = 6;
	private static final int FRAME_ROWS = 5;
	Animation walkAnimation;
	Animation walkAnimationInv;
	Texture walkSheet;
	Texture walkSheetInv;
	TextureRegion[] walkFrames;
	TextureRegion[] walkFramesInv;
	TextureRegion currentFrame;
	SpriteBatch spriteBatch;
	float positionX=1;
	float positionY=1;
	float positionX_anterior=1;
	float positionY_anterior=1;
	float stateTime;
	float anchura;
	float altura;
	// Indica si el protagonista va hacia la derecha(1) o hacia la izquierda(-1)
	int posicion = 1;
	
	public Player(){
		walkSheet = new Texture(Gdx.files.internal("data/personaje.png"));
		walkSheetInv = new Texture(Gdx.files.internal("data/personajeInv.png"));
		anchura = walkSheet.getWidth() / FRAME_COLS;
		altura = walkSheet.getHeight() / FRAME_ROWS;
		TextureRegion[][] tmp = TextureRegion.split(walkSheet,
				walkSheet.getWidth() / FRAME_COLS, walkSheet.getHeight() / FRAME_ROWS);
		TextureRegion[][] tmpInv = TextureRegion.split(walkSheetInv,
				walkSheetInv.getWidth() / FRAME_COLS, walkSheetInv.getHeight() / FRAME_ROWS);
		walkFrames = new TextureRegion[FRAME_COLS * FRAME_ROWS];
		walkFramesInv = new TextureRegion[FRAME_COLS * FRAME_ROWS];
		int index = 0;
		for (int i = 0; i < FRAME_ROWS; i++) {
			for (int j = 0; j < FRAME_COLS; j++) {
				walkFrames[index] = tmp[i][j];
				walkFramesInv[index] = tmpInv[i][FRAME_COLS-j-1];
				index++;
			}
		}
		walkAnimation = new Animation(0.025f, walkFrames);
		walkAnimationInv = new Animation(0.025f, walkFramesInv);
		spriteBatch = new SpriteBatch();
		stateTime = 0f;
	}
	
	public void render(float delta, OrthographicCamera guiCam, StageScreen stage_screen) {
		int posicion_anterior = posicion;

		if(Gdx.input.isTouched()) {
		    Vector3 touchPos = new Vector3();
		    touchPos.set(Gdx.input.getX(), Gdx.input.getY(), 0);
		    guiCam.unproject(touchPos);
		    //Si se pincha a la derecha del objeto
		    if(touchPos.x > positionX){
			    positionX += 500 * Gdx.graphics.getDeltaTime();
			    stateTime += Gdx.graphics.getDeltaTime();
				posicion = 1;
		    }
		    //Si se pincha a la izquierda del objeto
		    else if(touchPos.x < positionX){
			   	positionX -= 500 * Gdx.graphics.getDeltaTime();
			   	stateTime += Gdx.graphics.getDeltaTime();
				posicion = -1;
		    }
		    //Si se pincha arriba del objeto
		    if(touchPos.y > positionY){
			    positionY += 500 * Gdx.graphics.getDeltaTime();
			    stateTime += Gdx.graphics.getDeltaTime();
		    }
		    //Si se pincha abajo del objeto
		    else if(touchPos.y < positionY){
		    	positionY -= 500 * Gdx.graphics.getDeltaTime();
		    	stateTime += Gdx.graphics.getDeltaTime();
		    }
 	    }

		if (posicion!=posicion_anterior){
			stateTime = 0f;
		}
		
		//Se evalua hacia donde debe mirar el personaje
		if(posicion == 1){
			currentFrame = walkAnimation.getKeyFrame(stateTime, true); // #16
		}
		else{
			currentFrame = walkAnimationInv.getKeyFrame(stateTime, true); // #16
		}

		//Para que no pase por encima de un muro
	    for(Iterator<Image> it = stage_screen.muros.iterator(); it.hasNext();){
			Image wall = (Image)it.next();
			if(positionX >= wall.x - (float)(wall.width*0.92) && 
            		positionX <= wall.x + wall.width &&
            		positionY >= wall.y - wall.height && 
            		positionY <= wall.y + wall.height){
            	
				positionX = positionX_anterior;
				positionY = positionY_anterior;
            }
		}
		
		//Para que no se salga de la pantalla
	    if(positionX < 0 || positionX > MyGame.WORLD_WIDTH - anchura){
	    	positionX = positionX_anterior;
	    }
	    if(positionY < 0 || positionY > MyGame.WORLD_HEIGHT - altura){
	    	positionY = positionY_anterior;
	    }
	    
		//Para ver si ha activado una salida al pisar un texto
	    for(Iterator<MyText> it = stage_screen.textos.iterator(); it.hasNext();){
			((MyText)it.next()).textoPisado(positionX, positionY);
	    }

		spriteBatch.begin();
	    spriteBatch.draw(currentFrame, positionX, positionY);
		spriteBatch.end();
		//update(delta);
		positionX_anterior = positionX;
		positionY_anterior = positionY;
	}
	
	public void update(float delta){
		positionX+=0.1f;
		positionY+=0.1f;
	}
}	