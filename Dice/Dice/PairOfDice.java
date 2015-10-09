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

	public int roll()
	{
		return die1.roll() + die2.roll();
	}

}