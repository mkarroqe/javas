// Mary Karroqe PD 4/5
// Basic Game

import java.util.Scanner;

public class BasicGame {
	public static void main (String[] args) {
		init();
	}

	public static void init(){
		Scanner scanner = new Scanner(System.in);
		int level = 0;

		while (level < 1 || level > 4) {

			System.out.println("1. Beginner Level: 1-10");
			System.out.println("2. Intermediate Level: 1-100");
			System.out.println("3. Advanced Level: 1-1000");
			System.out.println("4. Expert Level: 1-10000");
			System.out.println();
			System.out.print("Enter number for level: ");

			level = scanner.nextInt();
		}

		// number person is trying to guess
		int target = (int)(Math.random()*Math.pow(10, level))+1;
		int tries = 0;
		int guess = 0;
		String tryies = "";

		System.out.print("I'm thinking of a number between 1 and " + (int)Math.pow(10, level) + ".");
		System.out.println();
		
		while (guess != target) {
			System.out.print("Enter your guess: ");
			guess = scanner.nextInt();

			System.out.print("You guessed "+ guess + ".");
			tries++;

			if (guess == target) {
				// grammar
				if (tries > 1) {
					tryies = "tries";
				}
				else {
					tryies = "try";
				}
				
				System.out.println(" Correct! It only took you " + tries + " " + tryies + ". You win a dose of self-validation.");
				// System.out.print("Would you like to play again?  Type 1 for yes and 2 for no: ");
			}
			if (guess > target)
				System.out.print(" That's too high. ");
			if (guess < target)
				System.out.print(" That's too low. ");
				
		} // while guess
	} // init
}