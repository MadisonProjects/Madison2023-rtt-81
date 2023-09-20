package practiceassignment;

public class numbersandoperators {
	public static void main (String[] args) {
		
		/*/Write a program that declares an integer a variable x, 
		 * assigns the value 2 to it, and prints out the binary 
		 * string version of the number ( Integer.toBinaryString(x) ). 
		 * Now, use the left shift operator (<<) 
		 * to shift by 1 and assign the result to x. 
		 * Before printing the results, write a comment with the predicted decimal 
		 * value and binary string. 
		 * Now, print out x in decimal form and in binary notation. 
		 * Perform the preceding exercise with the following values: 9, 17, 88
		 */
		// x is 9
		int x = 9;
		System.out.println(Integer.toBinaryString(x));
		System.out.println(x << 1);
		
		// x is 17
				int a = 17;
				System.out.println(Integer.toBinaryString(x));
				System.out.println(x << 1);
				
			// x is 88
				int b = 88;
				System.out.println(Integer.toBinaryString(x));
				System.out.println(x << 1);
				
				
			 /* Write a program that declares a variable x, 
			  * and assigns 150 to it, and prints out 
			  * the binary string version of the number. 
			  * Now use the right shift operator (>>) 
			  * to shift by 2 and assign the result to x.
			  * Write a comment indicating what you anticipate 
			  * The decimal and binary values to be. 
			  * Now print the value of x and the binary string. 
			  * Perform the preceding exercise with the following values: 225, 1555, 32456
			  */
				
				int xx = 5;
				int yy = 6;
				double q = yy/xx;
				System.out.println(q);
				q = (double) yy;
				System.out.println(q);
	}

}

