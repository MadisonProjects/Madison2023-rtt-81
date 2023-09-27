package pa30371;

/* Task 7: 
 * Write a program where you create an array of 5 elements. 
 * Loop through the array and print the value of each element, 
 * except for the middle (index 2) element.
 */

public class Task7 {

	public static void main(String[] args) {

		int[] theNumbers = { 1, 2, 3, 4, 5 };

		// for to print each array

		for (int i = 0; i < theNumbers.length; i++) {
			theNumbers[i] = (i + 1) * 2;
		}
		for (int i = 0; i < theNumbers.length; i++) {

			System.out.println("Element value multiplied by two " + i + ": " + theNumbers[i]);
		}

	}

}
