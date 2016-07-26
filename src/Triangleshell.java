import org.jointheleague.graphical.robot.Robot;

public class Triangleshell {

	// 1. Create a new Robot
Robot Bob = new Robot(500,500);
void go() {
	
		// 6. Make the robot go as fast as possible
Bob.setSpeed(10);
		// 4. make a variable to hold the length of the triangle and set it to 50
int x=50;
		// 7. Do the following (up to step 10) 60 times
int angle = 50;
while(angle<60);{
			// 9. Change the color of the pen to a random color
	Bob.setRandomPenColor();
			// 8. Increase the length of the side by 10 pixels
angle=angle+10;
			// 5. call your drawTriangle() method using your length variable
drawTriangle(x);
			// 10. Turn the tortoise 6 degrees to the right
Bob.turn(6);
}
	}

	/* 2. fill in the method below to draw a triangle. Use the length variable for the size of the triangle. */
	private void drawTriangle(int length) {
for (int i = 0; i <3; i++) {
	Bob.move(length);
	Bob.turn(120);
	
}
		
		
	}

	
	public static void main(String[] args) {
		new Triangleshell().go();
	}
}



