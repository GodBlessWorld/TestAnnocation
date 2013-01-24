package org.pl2.dslvideojuegos;

import java.util.Iterator;
import java.util.Vector;

import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class MyText {

	static float DEFAULT_W = (float)1.6;
	static float DEFAULT_H = (float)1.6;
	String texto;
	float x = 1;
	float y = 1;
	float w = DEFAULT_W;
	float h = DEFAULT_H;
	BitmapFont font;
	SpriteBatch spriteBatch;
	MyOut out = null;
	
	public MyText(String t, float width, float height, float posX, float posY){
		texto = "- " + t;
		x = posX;
		y = posY;
		w = width;
		h = height;
		font = new BitmapFont();
		font.setColor(0, 220, 255, 0);
		font.setScale(w, h);
		spriteBatch  = new SpriteBatch();
	}
	
	public void establecerSalida(String nameOut, Vector salidas){
		for(Iterator<MyOut> it = salidas.iterator(); it.hasNext();){
            MyOut mo = (MyOut)it.next();
            if(mo.name.equals(nameOut)){
            	out = mo;
            }
		}				
	}
	
	public void textoPisado(float positionX, float positionY){
		if(positionX >= x - texto.length()*w && positionX <= x + texto.length()*w && positionY >= y - h + 5 && positionY <= y + h + 5){
			if(out!=null){
				out.openOut();
			}
        }
	}
}	