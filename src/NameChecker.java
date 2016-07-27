import javax.swing.JOptionPane;

public class NameChecker {
public static void main(String[] args) {
String name=
JOptionPane.showInputDialog("What is your name?");
String myname="Dasha";
if(name.equals(myname)){
JOptionPane.showMessageDialog("You have a great name")
}
}
}

