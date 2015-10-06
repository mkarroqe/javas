// Mary Karroqe PD 4/5

public class DieRoll {
	public static void main(String[] args) {
		rollSingle();
		rollPair();
	}

	public static void rollSingle() {
		double rand = Math.random();
		int num = (int)(rand*6) + 1;
		System.out.println("You have rolled a " + num + ".");
	}

	public static void rollPair() {
		int roll1 = (int)(Math.random() * 6) + 1;
		int roll2 = (int)(Math.random() * 6) + 1;
		int theRoll = roll1 + roll2;
		System.out.println("You have rolled a " + roll1 + " and a " + roll2 + ", adding up to a total of " + theRoll + ".");
	}
}