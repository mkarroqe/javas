// Mary Karroqe PD 4/5

public class DiceProbability
{
	// whoop using the PairOfDice object as a datatype, an object made up of another object (NumberCube)
	private PairOfDice dice;
	private int[] rolls;
	int numberOfRolls;

	public static final int DEFAULT_NUM_OF_ROLLS = 10;

	public DiceProbability()
	{
		//build the dice we initiated above w no arguments, therefore defaults
		dice = new PairOfDice();
		rolls = new int[13]; // numbers of indexes in the array
		numberOfRolls = DEFAULT_NUM_OF_ROLLS;
	}

	public void generateOutcomes()
	{

		for (int i = 0; i < numberOfRolls; i++) // i only exists in this for loop
		{
			rolls[dice.roll()]++;

		}

/*		int rollsDone = 0;
		while (rollsDone < numberOfRolls)
		{
			rolls[dice.roll()]++; // what they roll is the index, the value of the roll, an array
			rollsDone++;
		}

*/
	}

	public void printOutcomes()
	{
		for (int i = 2; i < rolls.length; i++)
		{
			System.out.println("rolls[" + i + "] " + rolls[i]);
		}
	}

}