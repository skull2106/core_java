import java.awt.Image;
import java.awt.Graphics;
import java.net.URL;
import java.applet.Applet;
public class Applet_image_text extends Applet {
	public void paint(Graphics G)
	{ 
		String str="E:\Work\java\PhotoFunia Football Player Regular 2017-05-16 06 17 15"
		Image img= getImage(str);
		G.drawString("Saurabh is the best", 180,110);
		G.drawImage(img,60,120,this);
	}

}
