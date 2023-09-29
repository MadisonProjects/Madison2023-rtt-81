package pa30371;

import java.util.Arrays;
import java.util.Scanner;

/*Task 11: 
 * Write code that asks the user how many favorite things they have. 
 * Based on their answer, 
 * you should create a String array of the correct size. 
 * Then ask the user to enter the things and store them in the array you created. 
 * Finally, print out the contents of the array.
 */
public class Task11 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("How many favorite things? ");
		int numFavorites = scanner.nextInt();
		
		String[] favorites = new String[numFavorites];
		
		for( int pos = 0 ; pos < numFavorites ; pos++) {
			System.out.println("Enter favorite thing #" + pos);
			favorites[pos]= scanner.nextLine ();
			
		}
		
		System.out.println(Arrays.toString(favorites));
		
	}

}
