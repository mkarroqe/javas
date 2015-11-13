// Mary Karroqe PD 4/5

public class DiceTester
{
	public static void main(String[] args)
	{
		PairOfDice myDice = new PairOfDice();
		int theRoll = myDice.roll();

		int numOfRolls = 0;
		while (numOfRolls < 10)
		{
			theRoll = myDice.roll();
			System.out.println(theRoll);
			numOfRolls++;
		}

/*
		NumberCube myCube = new NumberCube(); // creating new instance of the NumberCube object w default values
		NumberCube crazyCube = new NumberCube(28);

		// default NumberCube
		System.out.println("myCube has " + myCube.getNumOfSides() + " sides.");
		int numOfRolls = 0;
		int theRoll;
		while (numOfRolls < 10)
		{
			theRoll = myCube.roll();
			System.out.println(theRoll);
			numOfRolls++;
		}

		System.out.println();

		// crazyCube
		System.out.println("crazyCube has " + crazyCube.getNumOfSides() + " sides.");
		numOfRolls = 0;
		while (numOfRolls < 10)
		{
			theRoll = crazyCube.roll();
			System.out.println(theRoll);
			numOfRolls++;
		}
*/
	}
}