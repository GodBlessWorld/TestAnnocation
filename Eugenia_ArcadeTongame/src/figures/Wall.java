package figures;

import java.io.InputStream;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;
import org.eclipse.draw2d.ImageFigure;

public class Wall extends ImageFigure {

  public Wall()  { 
	  	  
	  InputStream in = getClass().getResourceAsStream("images/Wall48.png");
	  Image image = new Image(Display.getDefault(), in);
	  this.setImage(image);
	  
  }  
}