package pa30371;

/*  Task 4: 
 * Write a program that creates an integer array with 5 elements (i.e., numbers). 
 * The numbers can be any integers.  
 * Print out the value at the first index and the last index using length - 1 as the index.
 *  Now try printing the value at index = length (e.g., myArray[myArray.length] ).  
 *  Notice the type of exception which is produced. 
 *  Now try to assign a value to the array index 5. 
 *  You should get the same type of exception.
 */

public class Task4 {

	public static void main(String[] args) {

		int[] theNumbers = { 8, 7, 6, 5, 4 };

		System.out.println("Value at first index:  " + theNumbers[0]);

		int lastIndex = theNumbers.length - 1;
		System.out.println("Value at the last index: " + theNumbers[lastIndex]);

	}

}
