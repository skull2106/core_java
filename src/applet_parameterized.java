import java.applet.Applet;
import java.awt.Graphics;
public class applet_parameterized extends Applet{
public void pain(Graphics g)
{
	String str=getParameter("msg");
	g.drawString(str,50,50);
}
}
