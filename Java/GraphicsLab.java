import java.awt.*; 
import java.applet.*;
public class GraphicsLab extends Applet
{
public void paint(Graphics g)
{
//This code draws Expo
g.setColor (Color.orange);
g.fillRect (50,470, 10,250);
g.fillRect (100,470,50, 10);
g.fillRect (100,580,50,10);
g.fillRect (100,695,50,10);
g.fillRect (290,620,10,50); 
g.fillRect (340,570,10,10); 
g.fillRect (390,620,10,50);
g.fillRect (390,470,10,50);
g.fillRect (290,470,10,50); 
g.fillRect (490,470,10,250);
g.fillRect (490,470,100,10);
g.fillRect (590,520,10,50);
g.fillRect (540,580,50,10);
g.fillOval (650,480,250,250);
g.setColor(Color.white);
g.fillOval (700,550,100,100);


//This code draws a star
g.setColor(Color.red);
g.drawLine(0, 0, 30, 30);
g.drawLine(0, 30, 30, 0);
g.drawLine(0, 0, 30, 0);
g.drawLine(15, 0, 0, 30);
g.drawLine(15, 0, 30, 50);

//This code draws 4 Circles
g.setColor(Color.black);
g.fillOval(110, 100, 30, 30);
g.fillOval(135, 117, 30, 30);
g.fillOval(110, 135, 30, 30);
g.fillOval(85, 117, 30, 30);
g.setColor(Color.white);
g.fillArc(110, 100, 30, 30, 45, 90);
g.fillArc(135, 117, 30, 30,  0 ,90 );
g.fillArc(110, 135, 30, 30, 230, 90);
g.fillArc(85, 117, 30, 30, 180, 90);

}
}
