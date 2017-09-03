import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {
        for (int i = 0; i < 1; i++) {
        	
		// 1. Watch the first 2 minutes of this movie: http://vimeo.com/2485018
		int randomNumber = new Random().nextInt(10);
		// 2. On paper, write all the numbers that get printed when you run this class
		System.out.println(randomNumber);
		
		if(randomNumber == 0) {
			JOptionPane.showMessageDialog(null, "You are going to have a great future.");
		}
		
		if(randomNumber == 1) {
			JOptionPane.showMessageDialog(null, "You are going to drive an awesome car.");
		}
		
		if(randomNumber == 2) {
			JOptionPane.showMessageDialog(null, "You are going to go to Harvard.");
		}
		
		if(randomNumber == 3) {
			JOptionPane.showMessageDialog(null, "You are going to live in a mansion.");
		}
		
		if(randomNumber == 4) {
			JOptionPane.showMessageDialog(null, "You are going to be a billionare.");
		}
		
		if(randomNumber == 5) {
			JOptionPane.showMessageDialog(null, "You have big hands.");
		}
		
		if(randomNumber == 6) {
			JOptionPane.showMessageDialog(null, "You are very athletic.");
		}
		
		if(randomNumber == 7) {
			JOptionPane.showMessageDialog(null, "You have a big nose.");
		}
		
		if(randomNumber == 8) {
			JOptionPane.showMessageDialog(null, "You are super tall.");
		}
		
		if(randomNumber == 9) {
			JOptionPane.showMessageDialog(null, "Your shoes are very cool.");

		// 3. Use the randomNumber to give the user a random compliment.

		// 4. Repeat all the code above 10 times
		
		// 5. Find someone to test out your program. They will like it :)
	}
	}
}
}
