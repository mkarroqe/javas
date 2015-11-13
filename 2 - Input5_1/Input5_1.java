// Mary Karroqe PD 4/5

import java.util.Scanner;

// primitives: declare and initialize
// objects: instantiate

public class Input5_1 {

    public static void main(String[] args) {
		Scanner mainScan = new Scanner(System.in);
		System.out.print("Which method would you like to run? Type: numAvg, sup, xor randy. ");
		String choice = mainScan.nextLine();
		
		if (choice.equals("numAvg")) {
			numAvg();
		}
		else if (choice.equals("sup")) {
			sup();
		}
		else if (choice.equals("randy")) {
			randy();
		}
		else {
			System.out.println("You broke the computer.");
		}
    	
    }
    
    public static void numAvg() {
    	
    	Scanner myScanner = new Scanner(System.in); // whoop building a new Scanner that'll read from the keyboard
    	int sum = 0;
    	int num = 0;
    	int track = -1;
    	double avg = 0;

		while (num != -999){
    		sum = sum + num;
    		System.out.println("Enter an integer or -999 if you are done.");
    		num = myScanner.nextInt();
    		track++;
    	}

    	System.out.println();
    	System.out.println("Your total is " + sum + ".");

    	if (track == 0 && sum == 0) {
    		avg = 0;
    	}
    	else {
    		avg = ((double)sum/track);
    	}

    	System.out.println("The average number you entered is " + avg + ".");
    	
    } // numAvg function
    
    public static void sup() {
    	
    	Scanner myScanner = new Scanner(System.in);
    	
    	System.out.print("Please enter your name: ");
		String name = myScanner.nextLine(); // nextLine is a built in method for reading strings

		System.out.println();
		System.out.println("What's up " + name + " ?");

		System.out.println();
		System.out.print("How old are you? ");

		int age = myScanner.nextInt(); // another built in method for reading ints; nextDouble is also a thing
		int nextYearAge = age + 1;
		String extra;

		if (nextYearAge == 18) {
			extra = "You will be your own responsible and independent adult.";
		}
		else if (nextYearAge == 21) {
			extra = "More and more freedom for you.";
		}
		else {
			extra = "Congrats.";
		}

		System.out.println("Next year you will be " + nextYearAge + ". " + extra);
    	
    } // sup function

	public static void randy() {
		
		double rand = Math.random();
    	System.out.println("Random number = " + rand);
    	int randInt = (int)(rand*10) + 1; // casts rand double as an int, creates a range from 1-10
    	System.out.println("Random int = " + randInt);

    	/* NOTES: MATH.RANDOM
    	 	Math.random generates a random # between 0 - 0.99
    	 	you have to multiply to broaden that range
    	 	rand = 0.987654321
    	 	* 10 (number of options) 9.87654321
    	 	(int) 9
    	 	+1 (adding on lowest value) 10

    	*/

		for (int i=0; i<100; i++){
	    	double psatRand = Math.random();
	    	int psatScore = (int)(psatRand * 61) + 20; // have to subtract the starting number from the largerst number
	    	System.out.println("You scored a " + psatScore + " on your PSAT.");
		}
		
	} // randy function		    
} // public class
