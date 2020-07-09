import java.awt.*;
import java.applet.*;

public class GraphicsLabPart2 extends Applet 
{


   public void paint(Graphics g)
   {
      //////////////////////////////  Smiley Face
      
     // g.setColor(Color.red);
     // g.fillOval(375, 50, 250, 250);
    //  g.setColor(Color.black);
     // g.fillOval(455, 100, 10, 20);
     // g.fillOval(530, 100, 10, 20);
    //  g.drawArc(450, 160, 100, 50, 180, 180);
      
    //  g.fillOval(492, 150, 10, 10);
      
      /////////////////////////////////////////  Own Drawing
      
                    
         
//This code draws APCS
      g.setColor(Color.orange);
      g.fillRect(210, 30, 200, 200); 
      g.fillRect(210, 200, 80, 150);
      g.fillRect(340, 200, 80, 150); 
      g.setColor(Color.white);
      g.fillRect(280, 100, 60, 60); 
      
      g.setColor(Color.blue);
      g.fillRect(410, 30, 200, 200); 
      g.fillRect(410, 200, 80, 150);
      g.setColor(Color.white);
      g.fillRect(485, 100, 60, 60); 
      
      g.setColor(Color.blue);
      g.fillRect(620, 30, 200, 50); 
      g.fillRect(620, 30, 50, 330);
      g.fillRect(620, 315, 200, 50); 
      
      g.setColor(Color.orange);
      g.fillRect(820, 30, 200, 50); 
      g.fillRect(820, 30, 50, 180);
      g.fillRect(820, 315, 200, 50); 
      g.fillRect(820, 180, 200, 50);
      g.fillRect(1020, 180, 50, 185);
      
      
      
//This code draws a snowman
      g.setColor(Color.black);
	    g.drawOval (140, 250, 40, 40);
		 g.drawOval (125, 285, 70, 50);	
	    g.drawOval (110, 330, 100, 60);
	    g.setColor (Color.blue);		
	    g.fillOval (150, 260, 5, 5);
	    g.fillOval (165, 260, 5, 5);
	    g.drawArc (150, 270, 20, 10, 190, 160);
	    g.drawLine (135, 310, 100, 290);
	    g.drawLine (185, 310, 205, 310);
	    g.drawLine (140, 255, 170, 255);
	    g.fillRect (145, 233, 30, 25);
       
       
//This code draws a Texan Flag      
       g.setColor(Color.white);
        g.fillRect(35,25,100,30);

        g.setColor(Color.red);
        g.fillRect(35,55,60,30);
        
        g.setColor(Color.blue);
        g.fillRect(10,25,30,60);
        
//This code draws the Star of David
        g.setColor(Color.black);
        int[] xPoints = {100, 150, 200};
int[] yPoints = {100, 200, 100};

int[] yPoints2 = {175, 75, 175};

g.drawPolygon (xPoints, yPoints, 3);
g.drawPolygon (xPoints, yPoints2, 3);


//This code draws CS1
g.setColor(Color.blue);
g.drawArc (150, 580, 90, 80, 90, 170);
g.fillArc (130, 560, 130, 120, 110, 170);
g.setColor(Color.white);
g.fillOval (160, 570, 60, 60);
g.drawLine (230, 650, 250, 670);
g.setColor(Color.blue);
g.fillRect(210, 560, 90, 30);
g.fillRect(210, 560, 30, 60);
g.fillRect(210, 610, 90, 30);
g.fillRect(270, 610, 30, 60);
g.fillRect(210, 660, 90, 30);
g.setColor(Color.green);
g.fillRect(310, 560, 30, 60);
g.fillRect(310, 560, 90, 30);
g.fillRect(360, 560, 35, 110);
g.fillRect(310, 560, 90, 30);
g.fillRect(330, 660, 90, 30);

        
     }
      
      
      
      
      
   }
