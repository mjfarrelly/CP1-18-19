import javax.swing.JFrame;

public class FrameDemo{
    public static void main(String[] args){
		JFrame frame= new JFrame("Frame Demo"); // Creates the title of the frame, also createes the object of the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // when the frame is closed the program stops running
		frame.setSize(400,400); // sets the size of the frame
        Shapes r = new Shapes(); // creates rhe shape object named r
        frame.add(r); // adding the shpes to the frame
        frame.setVisible(true); // this sets the frame so it can be seen
	}
}
