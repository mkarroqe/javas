// Mary Karroqe PD 4/5
// oh shi, objects can contain other objects

public class PairOfDice
{
	// datatype is the object, NumberCube, we created!!!!
	private NumberCube die1;
	private NumberCube die2;

	// constructors: always have same name as class, no datatype, used to build
	public PairOfDice()
	{
		die1 = new NumberCube();
		die2 = new NumberCube();
	}

	public PairOfDice(int sides)
	{
		this(sides, sides);
	}

	public PairOfDice(int sides1, int sides2)
	{
		die1 = new NumberCube(sides1);
		die2 = new NumberCube(sides2);
	}

	public int roll()
	{
		return die1.roll() + die2.roll();
	}

	public int getDie1sides()
	{
		return die1.getNumOfSides();
	}

	public int getDie2sides()
	{
		return die2.getNumOfSides();
	}
}