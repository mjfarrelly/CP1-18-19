import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.Color;
import javax.swing.JComponent;

public class Shapes extends JComponent{
    
    public void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D) g; // say the drawiung will be drawn in 2 dimensions
        
        Rectangle box = new Rectangle(5, 10, 50, 30); // gives the dimensions of the rectangle
        g2.draw(box); // draws
        
        g2.setColor(Color.red); // decides the color of the shape
        
        Ellipse2D.Double circle = new Ellipse2D.Double(100, 100, 200, 200); // width and height of the box because it reaches to the end
        g2.fill(circle); // fills in the circle
        
        Ellipse2D.Double ear1 = new Ellipse2D.Double (0,0,100,100);
        g2.draw(ear1);
        
    }
}
