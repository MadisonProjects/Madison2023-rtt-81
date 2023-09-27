package pa30371;

/* Task 8: 
 * Write a program that creates a String array of 5 elements
 *  and swaps the first element with the middle element 
 *  without creating a new array.
 */
public class Task8 {

	public static void main(String[] args) {

		String[] colors = { "yellow", "purple", "orange", "pink", "blue" };

		// Print the original array
		System.out.println("Original Array:");
		for (int i = 0; i < colors.length; i++) {
			System.out.println("Element number " + i + ": " + colors[i]);
		}

		// Swap the first element with the middle element
		String temp = colors[0];
		colors[0] = colors[colors.length / 2];
		colors[colors.length / 2] = temp;

		// Print the array after swapping
		System.out.println("\nArray After Swapping First and Middle Elements:");
		for (int i = 0; i < colors.length; i++) {
			System.out.println("Element number " + i + ": " + colors[i]);
		}
	}
}
