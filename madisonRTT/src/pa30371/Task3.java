package pa30371;

/*Task 3: 
 * Write a program that creates an array of String type 
 * and initializes it with the strings “red,” “green,” “blue,” and “yellow.” 
 * Print out the array length. Make a copy using the clone( ) method. 
 * Use the Arrays.toString( ) method on the new array 
 * to verify that the original array was copied.
 */

import java.util.Arrays;

public class Task3 {

	public static void main(String[] args) {
		// Create an array of String type and initialize it
		String[] colors = { "red", "green", "blue", "yellow" };

		// Print out the original array length
		System.out.println("Original Array Length: " + colors.length);

		// Make a copy of the array using the clone() method
		String[] copyOfColors = colors.clone();

		// Use Arrays.toString() to verify that the original array was copied
		System.out.println("Original Array: " + Arrays.toString(colors));
		System.out.println("Copied Array: " + Arrays.toString(copyOfColors));
	}
}
