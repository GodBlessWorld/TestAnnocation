package figures;

import java.io.InputStream;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;
import org.eclipse.draw2d.ImageFigure;

public class In extends ImageFigure {

  public In()  { 
	  	  
	  InputStream in = getClass().getResourceAsStream("images/In48.png");
	  Image image = new Image(Display.getDefault(), in);
	  this.setImage(image);
	  
  }  
}