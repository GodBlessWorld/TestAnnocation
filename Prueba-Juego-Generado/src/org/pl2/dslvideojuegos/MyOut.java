package org.pl2.dslvideojuegos;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.actors.Image;

public class MyOut {
	
	Image imagen;
	boolean open = false;
	String name = "";
	
	public MyOut(float x, float y, float w, float h, boolean o, String s){
		TextureRegion texOutOpen = new TextureRegion(new Texture(
				Gdx.files.internal("data/abierta.png")), 0, 0, 256, 256);
		TextureRegion texOutClose = new TextureRegion(new Texture(
				Gdx.files.internal("data/cerrada.png")), 0, 0, 256, 256);
		
		if(o){
			imagen = new Image("outOpen", texOutOpen);
		}
		else{
			imagen = new Image("outClose", texOutClose);
		}		
		imagen.x = x;
		imagen.y = y;
		imagen.width = w;
		imagen.height = h;
		open = o;
		name = s;
	}

	public MyOut(MyOut mo){
		imagen = mo.imagen;
		open = mo.open;
		name = mo.name;
	}
	
	public void openOut(){
		TextureRegion texOutOpen = new TextureRegion(new Texture(
				Gdx.files.internal("data/abierta.png")), 0, 0, 256, 256);
		open = true;		
		float x = imagen.x;
		float y = imagen.y;
		float w = imagen.width;
		float h = imagen.height;
		//Reconstruimos la imagen con otra textura
		imagen = new Image("outOpen", texOutOpen);
		imagen.x = x;
		imagen.y = y;
		imagen.width = w;
		imagen.height = h;
	}	
}	