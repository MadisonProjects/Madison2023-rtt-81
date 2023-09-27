package pa30371;

/*/Task 1: 
 * Write a program that creates an array of integers with a length of 3. 
 * Assign the values 1, 2, and 3 to the indexes. 
 * Print out each array element. 
 */

public class Task1 {
	public static void main(String[] args) {

		int[] theNumbers = { 1, 2, 3 };

		// for to print each array
		for (int i = 0; i < theNumbers.length; i++) {
			System.out.println("Element number " + i + ": " + theNumbers[i]);
		}

	}
}