#Hello5: Lesson 1
Explored data types and the magic of `System.out.println`

###Data Types

 (8 bits to a byte)

 1. int: 4 bytes (32 bits)
 	 * Range: `-2^31 <= int <= 2^31 - 1`

    ```java
    // for example
    int foo = 5;
    ```

 2. long: 8 bytes (64 bits)
    * Range: `-2^63 <= long <= 2^63 - 1`
    * used when a range larger than int is needed (large af numbers)

 3. short: 2 bytes (16 bits)
 	  * Range: `-2^15 <= short <= 2^15 - 1`
 	  * used back in the day to save memory, not as relevant anymore

 4. byte: 1 byte (8 bits)
 	  * Range: `-2^7 <= long <= 2^7 - 1`
    * used to save space in large arrays to save memory

 5. char: 2 bytes (16 bits)
 	  * stores ASCII code of a character, can be cast into an int
 	  * sassy hybrid: number that internally stores the code to a character

 6. double: 8 bytes (64 bit)
    * decimal values
 	  * allows more precision bc of larger memory than a float
	  * graphing calc capacity
	  
	   ```java
    // for example
    double foo = 5.0;
    ```

 7. float: 4 bytes (32 bit)
 	  * smaller capacity double, half the size
 	  * floating point decimal (scientific notation)

 8. boolean:
 	  * true or false (reserved java words, keep these lowercase)
 	  
 	   ```java
    // for example
    boolean raining = false;
    ```

 9. BigDecimal:
 	  * handy dandy java class
 	  * high precision for when your calculations are very sensitive and a double won't cut it
 	  
 10. String:
    * also a java class (notice the capitalization)
    * used to hold strings
    
    ```java
    // for example
    String message = "You look lovely today.";
    ```
