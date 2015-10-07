// Mary Karroqe PD 4/5

public class DiceTester
{
	public static void main(String[] args)
	{
		NumberCube myCube = new NumberCube(); // creating new instance of the NumberCube object w default values
		NumberCube crazyCube = new NumberCube(93);

		// default NumberCube
		int numOfRolls = 0;
		int theRoll;
		while (numOfRolls < 10)
		{
			theRoll = myCube.roll();
			System.out.println(theRoll);
			numOfRolls++;
		}

		System.out.println();

		// crazyCube, 93 sides
		numOfRolls = 0;
		while (numOfRolls < 10)
		{
			theRoll = crazyCube.roll();
			System.out.println(theRoll);
			numOfRolls++;
		}
	}
}
