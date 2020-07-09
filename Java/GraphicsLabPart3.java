import java.awt.*;
import java.applet.*;

public class GraphicsLabPart3 extends Applet
{
 public void paint(Graphics g)
 {
//This code draws THS
  g.setColor(Color.red);
  g.fillRect(400,275,135,25);
  g.fillRect(450,290,20,100);
  g.setColor(Color.gray);
  g.fillRect(550,275,20,125);
  g.fillRect(550,335,90,20);
  g.fillRect(635,275,20,125);
  g.setColor(Color.red);
  g.fillRect(670,275,75,25);
  g.fillRect(670,275,25,70);
  g.fillRect(670,325,75,25);
  g.fillRect(725,325,25,70);
  g.fillRect(670,375,75,25);
  
//This code draws a four sided star
  g.drawLine(210,480,230,570);
  g.drawLine(240,580,370,600);
  g.drawLine(380,610,230,630);
  g.drawLine(240,640,200,770);
  g.drawLine(210,780,170,630);
  g.drawLine(180,640,30,600);
  g.drawLine(40,610,170,570);
  g.drawLine(180,580,200,430);


 
 }

}