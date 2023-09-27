package pa30371;
/* Task 6: 
 * Write a program where you create an integer array of 5 numbers. 
 * Loop through the array and assign the value of the loop control variable
 *  multiplied by 2 to the corresponding index in the array.
 */

public class Task6 {

	public static void main(String[] args) {

		int[] theNumbers = { 1, 2, 3, 4, 5 };

		// for to print each array

		for (int i = 0; i < theNumbers.length; i++) {
			theNumbers[i] = (i + 1) * 2;
		}
		for (int i = 0; i < theNumbers.length; i++) {

			System.out.println("Element value multiplied by two" + i + ": " + theNumbers[i]);
		}

	}

}
