


/**
 * This makes a pandas face
 *
 * @author (Michael Farrelly
 * @version (2/5/19)
 */

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class DrawingPicture extends JComponent
{
    public void paintComponent(Graphics g){

        Graphics2D g2 = (Graphics2D)g;
        
        /******** Put your code here  *********/
        Ellipse2D.Double ear1 = new Ellipse2D.Double (175, 175, 150, 150 );
        g2.draw(ear1);
        g2.fill(ear1);
       
      
        Ellipse2D.Double face = new Ellipse2D.Double (200,200, 400, 400);
        g2.setColor(Color.white);
        g2.draw(face);
        g2.fill(face);
        
        Ellipse2D.Double ear2 = new Ellipse2D.Double (475, 175, 150, 150 );
        g2.setColor(Color.black);
        g2.draw(ear2);
        g2.fill(ear2);
        
        Ellipse2D.Double mouth = new Ellipse2D.Double (325, 475, 125, 25 );
        g2.setColor(Color.black);
        g2.draw(mouth);
        g2.fill(mouth);
        
        QuadCurve2D q = new QuadCurve2D.Float();
        q.setCurve(365, 500, 385, 575, 385, 500);
        g2.setColor(Color.black);
        g2.draw(q);
        g2.fill(q);
        
        
        CubicCurve2D c = new CubicCurve2D.Double();
        c.setCurve(350, 350, 240,
                   410, 380, 500, 350, 350);
        g2.draw(c);
        g2.fill(c);

        g2.draw(new Line2D.Double(355, 400, 350, 350));
       
        Ellipse2D.Double eye1 = new Ellipse2D.Double (325, 390, 12.5, 12.5);
         g2.setColor(Color.white);
        g2.draw(eye1);
        g2.fill(eye1);
        
        CubicCurve2D b = new CubicCurve2D.Double();
        c.setCurve(435, 350, 525,
                   410, 405, 500, 435, 350);
        g2.setColor(Color.black);
        g2.draw(c);
                g2.fill(c);
        
        Ellipse2D.Double eye2 = new Ellipse2D.Double (440, 390, 12.5, 12.5);
        g2.setColor(Color.white);
        g2.draw(eye2);
        g2.fill(eye2);
      
     
        
   	// comment this out once you have finished
        drawGrid(g2);
    }
    public void drawGrid(Graphics g2){
        g2.setColor(new Color(211, 211, 211));
        
        // Draw vertical lines
        for(int x = 0; x < 1000; x += 50){
            g2.drawLine(x, 0, x, 1000);
            g2.drawString("" + x, x, 10);
        }
        
        // Draw horizontal lines
        for(int y = 50; y < 1000; y += 50){
            g2.drawLine(0, y, 1000, y);
            g2.drawString("" + y, 0, y);
            
            
        }
    }
}
