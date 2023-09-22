package sep22practice;

public class ControlFlow3 {
	public static void main(String[] args) {
		// Declare an integer variable x and assign 15 to it
		int x = 15;

		// Check the value of x and print a message accordingly
		if (x < 10) {
			System.out.println("Less than 10");
		} else if (x >= 10 && x < 20) {
			System.out.println("Between 10 and 20");
		} else {
			System.out.println("Greater than or equal to 20");
		}

		// Change x to 50 and observe the result
		x = 50;

		// Check again after changing x
		if (x < 10) {
			System.out.println("Less than 10");
		} else if (x >= 10 && x < 20) {
			System.out.println("Between 10 and 20");
		} else {
			System.out.println("Greater than or equal to 20");
		}
	}
}