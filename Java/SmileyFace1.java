import java.awt.*;
import java.applet.*;

public class SmileyFace1 extends Applet 
{


   public void paint(Graphics g)
   {
      
                    
         
      // drawing APCS
      g.setColor(Color.orange);
      g.fillRect(200, 30, 200, 200); 
      g.fillRect(200, 200, 80, 150);
      g.fillRect(330, 200, 80, 150); 
      g.setColor(Color.white);
      g.fillRect(270, 100, 60, 60); 
      
      g.setColor(Color.blue);
      g.fillRect(400, 30, 200, 200); 
      g.fillRect(400, 200, 80, 150);
      g.setColor(Color.white);
      g.fillRect(475, 100, 60, 60); 
      
      g.setColor(Color.blue);
      g.fillRect(610, 30, 200, 50); 
      g.fillRect(610, 30, 50, 330);
      g.fillRect(610, 315, 200, 50); 
      
      g.setColor(Color.orange);
      g.fillRect(810, 30, 200, 50); 
      g.fillRect(810, 30, 50, 180);
      g.fillRect(810, 315, 200, 50); 
      g.fillRect(810, 180, 200, 50);
      g.fillRect(1010, 180, 50, 185);
      
      
      

        
        //star
                g.setColor(Color.red);
        int[] xPoints = {100, 150, 200};
int[] yPoints = {100, 200, 100};

int[] yPoints2 = {175, 75, 175};

g.drawPolygon (xPoints, yPoints, 3);
g.drawPolygon (xPoints, yPoints2, 3);


//cs1
g.setColor(Color.blue);
g.drawArc (140, 570, 80, 70, 100, 160);
g.fillArc (120, 550, 120, 110, 100, 160);
g.setColor(Color.white);
g.fillOval (150, 580, 50, 50);
g.drawLine (220, 640, 240, 660);
g.setColor(Color.blue);
g.fillRect(200, 550, 80, 20);
g.fillRect(200, 550, 20, 50);
g.fillRect(200, 600, 80, 20);
g.fillRect(260, 600, 20, 50);
g.fillRect(200, 650, 80, 20);
g.setColor(Color.green);
g.fillRect(300, 550, 20, 50);
g.fillRect(300, 550, 80, 20);
g.fillRect(350, 550, 25, 100);
g.fillRect(300, 550, 80, 20);
g.fillRect(320, 650, 80, 20);




g.setColor(Color.red);
  g.fillRect(450,375,135,25);
  g.fillRect(490,390,20,100);
  g.setColor(Color.gray);
  g.fillRect(600,375,20,125);
  g.fillRect(600,435,90,20);
  g.fillRect(685,375,20,125);
  g.setColor(Color.red);
  g.fillRect(720,375,75,25);
  g.fillRect(720,375,25,70);
  g.fillRect(720,425,75,25);
  g.fillRect(775,425,25,70);
  g.fillRect(720,475,75,25);
  
  
  
  
  
  
  

  
 

  
  
  
  

        
     }
      
      
      
      
      
   }