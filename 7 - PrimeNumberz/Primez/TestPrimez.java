// Mary Karroqe PD 4/5

import java.util.Scanner;

public class TestPrimez
{
	public static void main(String[] args)
	{
	/*	System.out.print("Enter in a number to determine whether or not it is prime: ");

		Scanner scanner = new Scanner(System.in);
		int test = scanner.nextInt();

		boolean testing = Primez.isPrime(test);

		if (testing == true)
			System.out.println(test + " is a prime number.");
		else
			System.out.println(test + " is not a prime number.");

		System.out.println();

		int[] primes = Primez.getPrimes(31, 11);

		for (int n: primes)
			System.out.print(n + " ");

		System.out.println();
		System.out.println();

		Primez.printIntArray(primes);
	*/

		int[] tester = new int[]{2, 2, 3, 5, -7, 8, 8, 8, 8, 8, 9, -10, 12, 12, 12, 3};
	/*	System.out.println("The average is " + Primez.average(tester));
		System.out.println("The average of the positives is " + Primez.averagePositives(tester));
		System.out.println("The average of the first half is " + Primez.averageFirstHalf(tester));
	*/ 	System.out.println(Primez.timesSignChanges(tester));
	}
}
