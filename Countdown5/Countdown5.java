// Mary Karroqe PD 4/5

public class Countdown5 {

	private static final int DEFAULT_START = 10;
	private static final int DEFAULT_STEP = 2;

	public static void main(String[] args){

		double rand = Math.random();
    	int randStart = (int)(rand*100) + 1;
    	int randStep = (int)(rand*randStart) + 1;

		countdown(); // will adhere to DEFAULT_START and DEFAULT_STEP
		countdown(6); // will adhere to DEFAULT_STEP
		countdown(randStart, randStep); // will do whatever it wants ;)
	}

	public static void countdown(){

		countdown(DEFAULT_START);

	}

	public static void countdown(int start){
		countdown(start, DEFAULT_STEP);
	}

	public static void countdown(int start, int step){
		step = Math.abs(step); //always a positive number

		int num = start;
		while (num > 0){
			System.out.print(num + "...");
			num = num - step;

			long time1 = System.currentTimeMillis();
			while (System.currentTimeMillis() - time1 < 1000) {
				// keep me in a loop for one second (1000 ms) to create a delay
			}

		}
		System.out.println("BLAST OFF!");

	}
}

	/* NOTES: OVERLOADING A METHOD:

		 helping w not repeating code
		 static vs nonstatic- static is a stand alone method
	     Scanner is not static, it builds from the Scanner object
		 Math.random is static, call it by class name, doesn't require another object
		 void - the method does not return anything

		*/