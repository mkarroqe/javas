// Mary Karroqe PD 4/5

public class DiceTester {
	public static void main(String[] args) {
		NumberCube myCube = new NumberCube(); // creating new instance of the NumberCube object

		int numOfRolls = 0;
		int theRoll;

		while (numOfRolls < 10) {
			theRoll = myCube.roll();
			System.out.println(theRoll);
			numOfRolls++;
		}
	}
}
