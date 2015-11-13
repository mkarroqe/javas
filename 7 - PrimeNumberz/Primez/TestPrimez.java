// Mary Karroqe PD 4/5

import java.util.Scanner;

public class TestPrimez
{
	public static void main(String[] args)
	{
		System.out.print("Enter in a number to determine whether or not it is prime: ");

		Scanner scanner = new Scanner(System.in);
		int test = scanner.nextInt();

		boolean testing = Primez.isPrime(test);

		if (testing == true)
			System.out.println(test + " is a prime number.");
		else
			System.out.println(test + " is not a prime number.");

		System.out.println();

		int[] primes = Primez.getPrimes(8, 4);

		for (int i = 0; i < primes.length; i++)
			System.out.println(primes[i]);

		System.out.println();

		int[] primes2 = Primez.getPrimesWithinRange(2, 10);

		for (int i = 0; i < primes2.length; i++)
			System.out.println(primes2[i]);

	}
}
