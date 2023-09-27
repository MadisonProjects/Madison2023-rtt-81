package pa30371;

/*/Task 2: 
 * Write a program that returns the middle element in an array. 
 * Give the following values to the integer array: {13, 5, 7, 68, 2} and
 *  produce the following output: 7
 */

public class Task2 {

	public static void main(String[] args) {
		int[] theNumbers = { 13, 5, 7, 68, 2 };

		// Calculate the index of the middle element
		int middleIndex = theNumbers.length / 2;

		// Retrieve and print the middle element
		int middleElement = theNumbers[middleIndex];
		System.out.println("The middle number is: " + middleElement);
	}
}