import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.Color;
import javax.swing.JComponent;

public class MMShapes extends JComponent{
    
    public void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D) g; // say the drawiung will be drawn in 2 dimensions
        
        
        
        Ellipse2D.Double circle = new Ellipse2D.Double(100, 100, 200, 200); // width and height of the box because it reaches to the end
        g2.fill(circle); // fills in the circle
        
        Ellipse2D.Double ear1 = new Ellipse2D.Double (50, 50, 100, 100 );
        g2.draw(ear1);
        g2.fill(ear1);
        Ellipse2D.Double ear2 = new Ellipse2D.Double (250, 50, 100, 100 );
        g2.draw(ear2);
        g2.fill(ear2);
        
    }
}
