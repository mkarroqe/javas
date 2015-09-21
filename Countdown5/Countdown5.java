// Mary Karroqe PD 4/5

public class Countdown5 {
	public static void main(String[] args){
		countdown();
	}

	public static void countdown(){
		int num = 10;

		while (num >= 0){
			System.out.println(num);
			num--;
		}
		System.out.println("BLAST OFF!");
	}

	public static void countdown(int start){
		// formal parameter
		// whatever that int is, that's the start number
	}
}