package sep22practice;

public class ControlFlow {
	// Problem 1
	/*
	 * Write a program that declares 1 integer variable x, and then assigns 7 to it.
	 * Write an if statement to print out “Less than 10” if x is less than 10.
	 * Change x to equal 15, and notice the result (console should not display
	 * anything).
	 */

	public static void main(String[] args) {
		// Declare an integer variable x and assign 7 to it
		// int x = 7;
		// Change x to 15 (but it won't display anything)
		int x = 15;

		// Check if x is less than 10 and print a message if true
		if (x < 10) {
			System.out.println("Less than 10");
		}

	}
}