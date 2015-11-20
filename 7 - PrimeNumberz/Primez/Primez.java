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

	public static void printIntArray(int[] numbers)
	{
		int column = 0;
		String nString;
		for (int n : numbers)
		{
			if (column > 50)
			{	System.out.println();
				column = 0;
			}
			nString = ("" + n + "  ");
			System.out.print(nString);
			column += nString.length();
		}
		System.out.println();
		System.out.println();
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

	//precondition: values.length > 0
	public static double average(int[] values)
	{
		int sum = 0;

	/*	for(int i = 0; i < values.length; i++)
			sum += values[i];
	*/
		// v standing in for each of the values at position i; is NOT an index!
		for(int v : values)
			sum += v;

		return (double)sum / values.length;
	}

	//returns average of only positive numbers
	//returns 0 if there are no positive values
	public static double averagePositives(int[] values)
	{
		int sum = 0;
		int length = 0;

		for(int v : values)
		{
			if(v > 0)
			{
				sum += v;
				length++;
			}
		}
		if(sum == 0)
			return 0;
		return (double)sum / length;
	}

	public static double averageFirstHalf(int[] values)
	{
		int sum = 0;
		int length = 0;

		for(int i = 0; i < (values.length/2); i++)
		{
			sum += values[i];
			length++;
		}

		return (double)sum / length;
	}

	public static int[] reverseArray(int[] values)
	{
		int[] myArray = new int[values.length];
		for(int i = values.length - 1; i >= 0; i--)
			myArray[i] = values[values.length - 1 - i];
		return myArray;
	}

	//returns the number of times value occurs in values
	public static int timesOccurs(int value, int[] values)
	{
		int count = 0;
		for(int v : values)
			if(v == value)
				count++;

		return count;
	}

	//precondition: values.length > 1
	public static int timesSignChanges(int[] values)
	{
		int count = 0;

		for(int i = 1; i < values.length; i++)
		{
			// if there is a sign change
			if((values[i] > 0 && values[i-1] < 0) || (values[i] < 0 && values[i-1] > 0))
			{
				count++;
			}
		}

		return count;
	}

	public static int getHighestValue(int[] values)
	{
		int highest = values[0];
		for(int n : values)
		{
			if(n > highest)
				highest = n;
		}
		return highest;
	}

/*	public static int getHighestValue(int[] values)
	{
		int highest = Integer.MIN_VALUE;
		for(int n : values)
		{
			if(n > highest)
				highest = n;
		}
		return highest;
	}
*/

	public static int getLowestValue(int[] values)
	{
		int lowest = Integer.MAX_VALUE;
		for(int n : values)
		{
			if(n < lowest)
				lowest = n;
		}
		return lowest;
	}

	//precondition: value.length > 0
	//if multiple elements are tied for the highest value
	//you may return the position of any of these elements
	public static int getPositionOfHighestValue(int[] values)
	{
		int index = 0;

		for(int i = 0; i < values.length; i++)
		{
			if(values[i] > values[index])
				index = i;
		}
		return index;
	}

}