// Mary Karroqe PD 4/5
// Basic Game + Enhancement 1 + Enhancement 2

import java.util.Scanner;
import java.util.ArrayList;

public class Enhancement2 {
	public static void main (String[] args) {
		init();
	}

	public static void init(){
		Scanner scanner = new Scanner(System.in);
		int level = 0;
		
		// array of game results
		int numGames = 0;
		ArrayList gameScores = new ArrayList();

		while (level < 1 || level > 4) {

			System.out.println("1. Beginner Level: 1-10");
			System.out.println("2. Intermediate Level: 1-100");
			System.out.println("3. Advanced Level: 1-1000");
			System.out.println("4. Expert Level: 1-10000");
			System.out.println();
			System.out.print("Enter number for level: ");

			level = scanner.nextInt();
		}

		boolean play = true;

		while (play == true) {
			
			int target = (int)(Math.random()*Math.pow(10, level))+1;
			int tries = 0;
			int guess = 0;
			int playStatus = 0;
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
					// to get out of loop
				//	play = false;
				
				} // == target if
				if (guess > target)
					System.out.print(" That's too high. ");
				if (guess < target)
					System.out.print(" That's too low. ");
					
			} // while guess	
			
			numGames++;
			gameScores.add(tries);
		
			System.out.print("Would you like to play again?  Type 1 for yes and 2 for no: ");
			playStatus = scanner.nextInt();	
				
			// play again
			if (playStatus == 1) {
				System.out.println();
				System.out.println("Whoop! Let's play again.");
				play = true;
			}
			if (playStatus == 2) {
				System.out.println();
				System.out.println("Thanks for playing!");
				System.out.print("Here are all your scores: ");
				System.out.print(gameScores);
				play = false;
			}
		
		} // main loop
		
	} // init
}