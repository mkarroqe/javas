// Mary Karroqe Pd 4/5

public class NumberCube {
	private int numOfSides; // field/instance variable; gets default value

	// constructors do not have a return type
	public NumberCube() {
		numOfSides = 6; // anytime that a new NumberCube is built w no parameters, this is the default
	}

	public int roll() {
		return ((int)(Math.random() * numOfSides) + 1);
	}
}