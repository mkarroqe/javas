// Mary Karroqe PD 4/5

import java.util.Scanner;

// primitives: declare and initialize
// objects: instantiate

public class Input5_1 {

    public static void main(String[] args) {
    	Scanner myScanner = new Scanner(System.in); // whoop building a new Scanner that'll read from the keyboard

		System.out.print("Please enter your name: ");
		String name = myScanner.nextLine(); // nextLine is a built in method for reading strings

		System.out.println();
		System.out.println("What's up " + name + " ?");

		System.out.println();
		System.out.print("How old are you? ");

		int age = myScanner.nextInt(); // another built in method for reading ints; nextDouble is also a thing
		int nextYearAge = age + 1;
/* debugging this
		if (nextYearAge == 18) {
			String extra = "You will be your own responsible and independent adult.";
		}
		else if (nextYearAge == 21) {
			String extra = "More and more freedom for you.";
		}
		else {
			String extra = "Congrats.";
		}
*/		
		System.out.println("Next year you will be " + nextYearAge + ". ");
//		System.out.print(extra);

    }
}
