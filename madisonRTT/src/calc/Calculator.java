package calc;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.menu();

	}

	public void menu() {
		Scanner input = new Scanner(System.in);
		double num1, num2;
		char operator;

		do {
			System.out.println("Calcualtor Menu: ");

			System.out.println("1. Addition (+)");
			System.out.println("2. Subtraction (-)");
			System.out.println("3. Multiplication (*)");
			System.out.println("4. Division (/)");
			System.out.println("5. Exit");
			System.out.print("Select an option (1-5): ");

			int choice = input.nextInt();

			switch (choice) {
			case 1:
				num1 = getUserInput("Enter the first number: ");
				num2 = getUserInput("Enter the second number: ");
				System.out.println("Result: " + add(num1, num2));
				break;
			case 2:
				num1 = getUserInput("Enter the first number: ");
				num2 = getUserInput("Enter the second number: ");
				System.out.println("Result: " + subtract(num1, num2));
				break;
			case 3:
				num1 = getUserInput("Enter the first number: ");
				num2 = getUserInput("Enter the second number: ");
				System.out.println("Result: " + multiply(num1, num2));
				break;
			case 4:
				num1 = getUserInput("Enter the numerator: ");
				num2 = getUserInput("Enter the denominator: ");
				if (num2 == 0) {
					System.out.println("Error: Division by zero.");
				} else {
					System.out.println("Result: " + divide(num1, num2));
				}
				break;
			case 5:
				System.out.println("Exiting Calculator.");
				System.exit(0);
				break;
			default:
				System.out.println("Invalid choice. Please select a valid option.");
			}

		} while (true); // Loop until the user decides to exit
	}

	public double getUserInput(String prompt) {
		Scanner input = new Scanner(System.in);
		System.out.print(prompt);
		return input.nextDouble();
	}

	public double add(double num1, double num2) {
		return num1 + num2;
	}

	public double subtract(double num1, double num2) {
		return num1 - num2;
	}

	public double multiply(double num1, double num2) {
		return num1 * num2;
	}

	public double divide(double num1, double num2) {
		return num1 / num2;
	}
}