import java.awt.*;
import java.applet.*;

public class GraphicLabPart extends Applet
{
    public void paint(Graphics g)
    {
//This code draws overlapping shapes
      
      g.drawOval(100, 100, 100, 100);
      g.drawOval(128, 140,45, 45);
      g.drawLine(100, 140, 150, 200);
      g.drawLine(100, 140, 200, 138);
      g.drawLine(200, 140, 146, 200);
 
//This code draws a simple house
      
      g.drawRect(350,400,450,250);
      g.drawLine(350,400,570,300);
      g.drawLine(570,300,800,400);
      g.drawOval(545,320,50,50);
      g.drawLine(570,320,570,370); 
      g.drawLine(545,345,595,345);
      g.drawRect(390,440,150,210);
      g.fillOval(510,565,10,10);
      g.drawRect(570,440,210,155);
      g.drawLine(675,440,675,595);
      g.drawLine(570,515,780,515);                  
    }
    }
    
