import javax.swing.JOptionPane;

public class WorldDomination {
	public static void main(String[] args) {
		// 1. Ask the user if they know how to write code.
String answer=JOptionPane.showInputDialog("do you know how to code?");

String yes="yes";
if(answer.equals(yes)){JOptionPane.showMessageDialog(null,"You will rule the world!");
		// 2. If they say "yes", tell them they will rule the world.

		// 3. Otherwise, wish them good luck washing dishes.

}
else{
JOptionPane.showMessageDialog(null, "Good luck washing dishes!");
}
}
}