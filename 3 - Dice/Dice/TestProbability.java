// Mary Karroqe PD 4/5

public class TestProbability
{
	public static void main (String[] args)
	{
		DiceProbability dp1 = new DiceProbability();
		dp1.generateOutcomes();
		dp1.printOutcomes();

		System.out.println();

		DiceProbability dp2 = new DiceProbability(100);
		dp2.generateOutcomes();
		dp2.printOutcomes();

		System.out.println();

		DiceProbability dp3 = new DiceProbability(1000000);
		dp3.generateOutcomes();
		dp3.printOutcomes();

		System.out.println();

		PairOfDice myDice4 = new PairOfDice(10, 8);	// number of rolls and pair of dice below
		DiceProbability dp4 = new DiceProbability(1000000, myDice4);
		dp4.generateOutcomes();
		dp4.printOutcomes();

	}
}