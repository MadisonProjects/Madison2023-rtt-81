package pa30371;
/* Task 5: 
 * Write a program where you create an integer array with a length of 5. 
 * Loop through the array  
 * assign the value of the loop control variable (e.g., i) 
 * to the corresponding index in the array.
 */

public class Task5 {
	public static void main(String[] args) {

		int[] theNumbers = { 1, 2, 3, 4, 5 };

		// for to print each array
	
		for (int i = 0; i < theNumbers.length; i++) {
			theNumbers[i] = i + 1;
		}
		for (int i = 0; i < theNumbers.length; i++) {
			
			System.out.println("Element number " + i + ": " + theNumbers[i]);
		}

	}
}

