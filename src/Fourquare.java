import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {
	
	// 2. Create a new Robot
	Robot l = new Robot (500,500);
	

	void go() {
		// 4. Make the robot move as fast as possible
l.setSpeed(10);
		// 5. Set the pen width to 5
l.setPenWidth(5);
		// 6. Do steps #7 to #8 four times...
int o=0;
while(i<4){
			// 7. Set the pen color to random
l.setRandomPenColor;
			// 1. Call the drawSquare() method
	
			// 8. Turn the robot 90 degrees to the right
l.turn(90);
	}

	/* 3. Fill in the code to draw a square inside the method below. */
	void drawSquare() {
		JOptionPane.showMessageDialog(null, "yay! you called the drawSquare() method!");

		
		
	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}



