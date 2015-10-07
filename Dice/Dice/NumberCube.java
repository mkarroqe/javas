// Mary Karroqe Pd 4/5
// instructions for any number cube

public class NumberCube
{
	private int numOfSides; // field/instance variable; gets default value (local variables do not) of 0
	public static final int MINIMUM_SIDES = 4; // final declares it as a constant
	public static final int MAXIMUM_SIDES = 32;
	public static final int DEFAULT_SIDES = 6;

	// constructors do not have a return type! instead it returns the instance of that class (aka new NumberCube)
	public NumberCube()
	{
		// if no parameter is given:
		numOfSides = DEFAULT_SIDES;
	}

	// overloading the constructor
	public NumberCube(int sides)
	{
		// if you pass in a parameter, sides:
		numOfSides = sides;
	}

	// our "verb"
	public int roll()
	{
		return ((int)(Math.random() * numOfSides) + 1);
	}
}

/* something static: owned by class, not object
 * our constants are static because it's something that all the individual number cubes can share
 *
 *
 *
 */