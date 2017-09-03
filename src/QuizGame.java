import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		int score = 0;
		String capital = JOptionPane.showInputDialog("What is the capital of Spain?");
		if(capital.equalsIgnoreCase("Madrid")) {
			JOptionPane.showMessageDialog(null, "You are correct!");
			score++;
		}
		else {
			JOptionPane.showMessageDialog(null, capital + " is incorrect.");
		}
		String city = JOptionPane.showInputDialog("What is the capital of Canada?");
		if(city.equalsIgnoreCase("Ottawa")) {
			JOptionPane.showMessageDialog(null, "You are correct!");
			score++;
		}
		else {
			JOptionPane.showMessageDialog(null, city + " is incorrect.");
		}
		String country = JOptionPane.showInputDialog("What is the capital of Malaysia?");
		if(country.equalsIgnoreCase("Kuala Lumpur")) {
			JOptionPane.showMessageDialog(null, "You are correct!");
			score++;
		}
		else {
			JOptionPane.showMessageDialog(null, country + " is incorrect.");
		}
		JOptionPane.showMessageDialog(null, "Congratulations, you got " + score + "/3 correct!");
	}

}
