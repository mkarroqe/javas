// Mary Karroqe PD 4/5

public class DiceProbability
{
	// whoop using the PairOfDice object as a datatype, an object made up of another object (NumberCube)
	private PairOfDice dice;
	private int[] rolls;
	private int numberOfRolls;
	private int[] theoreticalOutcomes;

	public static final int DEFAULT_NUM_OF_ROLLS = 10;

	// no info
	public DiceProbability()
	{
		// this constructor
		this(DEFAULT_NUM_OF_ROLLS); // calls function below, passes in DEFAULT_NUM_Of_ROLLS as the parameter numberOfRolls
	}
	// rolls
	public DiceProbability(int numberOfRolls)
	{					 // builds if not given
		this(numberOfRolls, new PairOfDice()); // new PairOfDice built if client does not give parameters, sent anonymously to the next overloaded function as "dice"
	}
	// dice
	public DiceProbability(PairOfDice dice)
	{
		this(DEFAULT_NUM_OF_ROLLS, dice);
	}
	// rolls and dice
	public DiceProbability(int numberOfRolls, PairOfDice dice) //asks to send a new PairOfDice
	{
		this.dice = dice; // refers to what you sent
		int highestRoll = dice.getDie1sides() + dice.getDie2sides();
		rolls = new int[highestRoll + 1];

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
	}

	public void printOutcomes()
	{
		int possibleOutcomes = dice.getDie1sides() * dice.getDie2sides();

		for (int i = 2; i < rolls.length; i++)
		{
			System.out.print("rolls[" + i + "] = " + rolls[i] + "    ");

			System.out.println((rolls[i] / (double)numberOfRolls) + "   " + (theoreticalOutcomes[i] / (double)(possibleOutcomes)));
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


