// Mary Karroqe PD 4/5

public class DiceProbability
{
	// whoop using the PairOfDice object as a datatype, an object made up of another object (NumberCube)
	private PairOfDice dice;
	private int[] rolls;
	private int numberOfRolls;
	private int[] theoreticalOutcomes;

	public static final int DEFAULT_NUM_OF_ROLLS = 10;

	public DiceProbability()
	{
		// this constructor
		this(DEFAULT_NUM_OF_ROLLS);
	}

	public DiceProbability(int numberOfRolls)
	{
		//build the dice we initiated above w no arguments, therefore defaults
		dice = new PairOfDice();
		int highestRoll = dice.getDie1sides() + dice.getDie2sides();
		rolls = new int[highestRoll + 1]; // numbers of indexes we're reserving in the array

		theoreticalOutcomes = new int[highestRoll + 1];
		generateTheoreticalOutcomes();

		// this refers to the local variable, in this case, the parameter
		// helpful when there is an ambiguity
		this.numberOfRolls = numberOfRolls;
			// this.numberOf.Rolls refers to the private int at the top, the INSTANCE variable
			// numberOfRolls refers to the LOCAL variable (parameter)
	}

	public void generateOutcomes()
	{

		for (int i = 0; i < numberOfRolls; i++) // i only exists in this for loop
		{
			rolls[dice.roll()]++; // mutator

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
			int possibleOutcomes = dice.getDie1sides() * dice.getDie2sides();
			System.out.print("rolls[" + i + "] = " + rolls[i] + "    ");

			System.out.println((rolls[i] / (double)numberOfRolls) + (theoreticalOutcomes[i] / (double)(possibleOutcomes)));
		}
	}

	public void generateTheoreticalOutcomes()
	{
		for (int i = 1; i <= dice.getDie1sides(); i++)
		{
			for (int j = 1; j <= dice.getDie2sides(); j++)
			{
				theoreticalOutcomes[i + j]++;
			}
		}
	}

}