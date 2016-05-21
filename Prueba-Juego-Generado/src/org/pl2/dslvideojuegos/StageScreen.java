package org.pl2.dslvideojuegos;

import com.badlogic.gdx.Files.FileType;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.collision.BoundingBox;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.actors.Image;

import java.util.Iterator;
import java.util.Vector;


public class StageScreen implements Screen {
 
    MyGame game;
    Stage stage;
  	Texture fondo;
  	// Se utiliza para dibujar y optimizar las imagenes en el renderizado de la pantalla
  	SpriteBatch batcher;
  	// gui cam
  	OrthographicCamera guiCam;
	// Vector de sonidos
	Vector sonidos = new Vector();
	// Vector de textos
  	Vector textos = new Vector();
	// Vector de muros
  	Vector muros = new Vector();
	// Vector de entradas
	Vector entradas = new Vector();
	// Vector de salidas
	Vector salidas = new Vector();
	// Para saber si se deben mostrar los textos
	boolean mostrar_textos = false;

  	Vector3 touchPoint = new Vector3();
  	BoundingBox rightArrowsBounds;

    public StageScreen(MyGame game){
        this.game = game;
        //definicion de nuestra propia medida del juego
	    guiCam = new OrthographicCamera();
	    guiCam.setToOrtho(false, MyGame.WORLD_WIDTH, MyGame.WORLD_HEIGHT);

		//crear solamente un batcher por pantalla y eliminarlo cuando no se use	
		batcher = new SpriteBatch();
		
		stage = new Stage(MyGame.WORLD_WIDTH, MyGame.WORLD_HEIGHT, true);	
		fondo = new Texture(Gdx.files.internal("data/background.png"));
		
		float e_width;
		float e_height;

		// Creamos los sonidos
		TextureRegion texIpod = new TextureRegion(new Texture(
				Gdx.files.internal("data/ipod.png")), 0, 0, 64, 64);        		       		
		Image im;
		Music mu;

				im = new Image("ipod", texIpod);
        		im.x = (float)200.0;
        		im.y = (float)200.0;
					im.width = 64;
					im.height = 64;
				mu = Gdx.audio.newMusic(Gdx.files.getFileHandle("data/sonidoprueba.mp3", FileType.Internal));
        		//se añade al vector
        		sonidos.add(new MySound(im,mu));

		//Creamos los muros
		Image w;
		TextureRegion texWall = new TextureRegion(new Texture(
				Gdx.files.internal("data/Wall.png")), 0, 0, 64, 64);
				w = new Image("Wall", texWall);
					w.width = 64;
					w.height = 64;
				
        		w.x = (float)400.0;
        		w.y = (float)400.0;
        		//se añade al vector y a la stage
        		muros.add(w);
				stage.addActor(w);

		//Creamos las entradas
		MyIn mi;
				mi = new MyIn((float)0.0, (float)0.0, false);
				entradas.add(mi);
				mi = new MyIn((float)0.0, (float)0.0, false);
				entradas.add(mi);

		// Creamos las salidas
        MyOut mo;
					e_width = 256;
					e_height = 256;
        		mo = new MyOut((float)0.0, (float)0.0, e_width, e_height, false, "Salida1");
				salidas.add(mo);

		// Creamos los textos
		MyText mytext;
					e_width = MyText.DEFAULT_W;
					e_height = MyText.DEFAULT_H;
				mytext = new MyText("Hola amigo", e_width, e_height, (float)400.0, (float)200.0);
        		//se añade al vector
        		textos.add(mytext);
					mytext.establecerSalida("Salida1", salidas);
					e_width = MyText.DEFAULT_W;
					e_height = MyText.DEFAULT_H;
				mytext = new MyText("Adios colega", e_width, e_height, (float)600.0, (float)150.0);
        		//se añade al vector
        		textos.add(mytext);
					e_width = MyText.DEFAULT_W;
					e_height = MyText.DEFAULT_H;
				mytext = new MyText("¿Que hora es?", e_width, e_height, (float)600.0, (float)250.0);
        		//se añade al vector
        		textos.add(mytext);
		
    }
   
   
    @Override
	public void render(float delta) {
		guiCam.update();		
		batcher.setProjectionMatrix(guiCam.combined);
		//Dibujando el fondo, se elimina graficamente la transparencia ya que es un fondo
		//batcher.disableBlending();
		batcher.begin();
		batcher.draw(fondo, 0, 0, MyGame.WORLD_WIDTH, MyGame.WORLD_HEIGHT);

		//Recorremos los sonidos
		for(Iterator<MySound> it = sonidos.iterator(); it.hasNext();){
            MySound aux = (MySound)it.next();
            batcher.draw(aux.imagen.region, aux.imagen.x, aux.imagen.y, aux.imagen.width, aux.imagen.height);
            //Se comprueba si el prota ha pasado por encima
            if(game.prota.positionX >= aux.imagen.x - aux.imagen.width*0.8 && 
            		game.prota.positionX <= aux.imagen.x + aux.imagen.width*0.8 &&
            		game.prota.positionY >= aux.imagen.y - aux.imagen.height*0.8 && 
            		game.prota.positionY <= aux.imagen.y + aux.imagen.height*0.8){
            	aux.sonido.play();
				mostrar_textos = true;
            }
		}

		//Mostramos las salidas
		for(Iterator<MyOut> it = salidas.iterator(); it.hasNext();){
            MyOut mo = (MyOut)it.next();
            batcher.draw(mo.imagen.region, mo.imagen.x, mo.imagen.y, mo.imagen.width, mo.imagen.height);
		}
		
		batcher.end();

		//Si se ha pasado por algún archivo de sonido mostramos los textos en pantalla
    	if(mostrar_textos){
	    	for(Iterator<MyText> it = textos.iterator(); it.hasNext();) {
				MyText mt = (MyText)it.next();
				mt.spriteBatch.begin();
				mt.font.draw(mt.spriteBatch, mt.texto, mt.x, mt.y);
				mt.spriteBatch.end();
			}
		}
		
		game.prota.render(0,guiCam,this);
		
		stage.act(Gdx.graphics.getDeltaTime());
		stage.draw();
	} 

    @Override
    public void resize(int width, int height) {
    	// stage.setViewport(width, height, true);
    }
 

    @Override
    public void show() {
        // called when this screen is set as the screen with game.setScreen();
	  	for(Iterator<MyIn> it = entradas.iterator(); it.hasNext();){
	  		MyIn mi = (MyIn)it.next();
	  		if(mi.isStart){
	  			game.prota.positionX = mi.x;
	  			game.prota.positionY = mi.y;
	  		}
		} 
    }
 

    @Override
    public void hide() {
        // called when current screen changes from this to a different screen
    }
 

    @Override
    public void pause() {
    }
 

    @Override
    public void resume() {
    }
 

    @Override
    public void dispose() {
    	// never called automatically
    }
}	