// Mary Karroqe PD 4/5

public class Primez
{
	public static boolean isPrime(int num)
	{
		int maxTestFactor = (int)(Math.sqrt(num)) + 1;

		if (num < 2)
			return false;

		for (int i = 2; i <= maxTestFactor; i++)
		{
			if (num % i == 0)
				return false;
		}
		return true;

	}

	public static int[] getPrimes(int start, int numberOfPrimes)
	{
		int[] primes = new int[numberOfPrimes];
		int currentNum = start;
		int primesFound = 0;
		while(primesFound < numberOfPrimes)
		{
			if (isPrime(currentNum))
			{
				primes[primesFound] = currentNum;
				primesFound++;
			}
			currentNum++;
		}
		return primes;
	}

	public static int[] getPrimesWithinRange(int low, int high)
	{
		int primeCount = 0;

		for (int num = low; num <= high; num++)
		{
			if (isPrime(num))
				primeCount++;
		}

		return getPrimes(low, primeCount);

	}
}