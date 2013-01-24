package org.pl2.dslvideojuegos;

import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.scenes.scene2d.actors.Image;

public class MySound {
	
	Image imagen;
	Music sonido;
	
	public MySound(Image i, Music m){
		imagen = i;
		sonido = m;
	}
	
	public MySound(MySound ms){
		imagen = ms.imagen;
		sonido = ms.sonido;
	}
}	