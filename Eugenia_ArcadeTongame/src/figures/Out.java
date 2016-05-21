package figures;

import java.io.InputStream;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;
import org.eclipse.draw2d.ImageFigure;

public class Out extends ImageFigure {

  public Out()  { 
	  	  
	  InputStream in = getClass().getResourceAsStream("images/Out48.png");
	  Image image = new Image(Display.getDefault(), in);
	  this.setImage(image);
	  
  }  
}