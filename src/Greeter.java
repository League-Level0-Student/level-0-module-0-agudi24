import javax.swing.JOptionPane;

public class Greeter {
	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("What is your name?");
		JOptionPane.showMessageDialog(null, "Nice to meet you " + name);

		String fruit = JOptionPane.showInputDialog("What is you favorite fruit?");
		JOptionPane.showMessageDialog(null, fruit + " is/are awesome!");
	}

}
