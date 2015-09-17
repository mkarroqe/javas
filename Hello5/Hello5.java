// Mary Karroqe PD 4/5

public class Hello5 {
	public static void main(String[] args) {
		String name = "Mary";
		System.out.println("hey, " + name + ".");

		// INTS AND DOUBLES

		int x = 11, y = 4;
		double z = x/(double)y; // y acts as a double just for this instance when you cast it as one
		System.out.println(z);

		double a = 1.32; // doubles take up way more space in memory than ints
		int b = (int)a; // when you try to shrink a double into an int slot, it just won't happen
		System.out.println("a = " + a);
		System.out.println("b = " + b);

		// BOOLEANS

		boolean passed = false;
	 	boolean correct = (1 + 1 == 2); // will evaluate what's in parentheses and gen a true/false
	 	passed = !passed; // flipping boolean value, false now becomes true

	 	// a boolean variable in itself is a boolean expression

	 	if (passed) {
	 		System.out.println("Congrats, friend!");
	 	} else {
	 		System.out.println("You failed, sorry bud.");
	 	}

	} // end main
} // end class

/*
 NOTES: DATA TYPES

 8 bits to a byte

 int: 4 bytes (32 bits)
 	  -2^31 <= int <= 2^31 - 1
 	  first bit: determines if it's a positive/negative number

 long: 8 bytes (64 bits)
 	  -2^63 <= long <= 2^63 - 1

 	  used when a range larger than int is needed (large af numbers)

 short: 2 bytes (16 bits)
 	  -2^15 <= short <= 2^15 - 1

 	  used back in the day to save memory

 byte: 1 byte (8 bits)
 	  -2^7 <= long <= 2^7 - 1

 	  used to save space in large arrays

 char: 2 bytes (16 bits)
 	  stores ASCII code of a character, can be cast into an int
 	  sassy hybrid: number that internally stores the code to a character

 double: 8 bytes (64 bit)
 	  allows more precision bc of larger memory than a float
	  graphing calc capacity

 float: 4 bytes (32 bit)
 	  smaller capacity double, half the size
 	  floating point decimal (scientific notation)

 boolean:
 	  true or false (reserved java words, keep these lowercase)

 BigDecimal:
 	  handy dandy java class
 	  hella high precision for when your calculations are very sensitive and a double won't cut it

*/