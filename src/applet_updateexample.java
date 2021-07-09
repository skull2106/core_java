import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
public class applet_updateexample extends Applet implements MouseListener {
private int mouseX, mouseY;
private boolean mouseclicked =false;
public void init()
{
	setBackground(Color.BLACK);
	addMouseListener(this);
}
public void mouseClick(MouseEvent e)
{
	mouseX=e.getX();
	mouseY=e.getY();
	mouseclicked = true;
	repaint();
}
public void mouseEntered(MouseEvent e) {};
public void mousePressed(MouseEvent e) {};
public void mouseReleased(MouseEvent e) {};
public void mouseExited(MouseEvent e) {};
public void update(Graphics g)
{
	paint(g);
}
public void paint(Graphics g)
{
	String str;
	g.setColor(Color.white);
	if(mouseclicked)
	{
		str="X="+mouseX+","+"Y="+mouseY;
		g.drawString(str, mouseX, mouseY);
		mouseclicked = false;
		
	}
}
}
