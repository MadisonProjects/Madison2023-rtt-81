package sep22practice;

public class ControlFlowFour {
	public static void main(String[] args) {
		// Declare an integer variable x and assign 15 to it
		int x = 15;

		// Check if x is in the specified range and print a message accordingly
		if (x >= 10 && x <= 20) {
			System.out.println("In range");
		} else {
			System.out.println("Out of range");
		}

		// Change x to 5 and observe the result
		x = 5;

		// Check again after changing x
		if (x >= 10 && x <= 20) {
			System.out.println("In range");
		} else {
			System.out.println("Out of range");
		}
	}
}
