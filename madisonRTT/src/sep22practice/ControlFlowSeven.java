package sep22practice;

/*Create a program that lets the users input their filing status and income. 
 * Display how much tax the user would have to pay according to status and income.
The U.S. federal personal income tax is calculated based on the 
filing status and taxable income. 
There are four filing statuses: 
Single, Married Filing Jointly, Married Filing Separately, and Head of Household. 
The tax rates for 2009 are shown below.

 * 
 */

import java.util.Scanner;

public class ControlFlowSeven {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Prompt the user to enter filing status and income
		System.out.print("Enter your filing status (Single, MFJ, MFS, or HoH): ");
		String filingStatus = scanner.nextLine();
		System.out.print("Enter your taxable income: ");
		double income = scanner.nextDouble();

		// Calculate tax based on filing status and income
		double tax = calculateTax(filingStatus, income);

		// Display the calculated tax
		System.out.println("Estimated federal income tax: $" + tax);

		// Close the scanner
		scanner.close();
	}

	// Function to calculate tax based on filing status and income
	public static double calculateTax(String filingStatus, double income) {
		// Tax rates for 2009 (simplified for illustration purposes)
		double taxRate = 0.0;
		double taxableIncome = income;

		switch (filingStatus) {
		case "Single":
			if (income <= 8350) {
				taxRate = 0.10;
			} else if (income <= 33950) {
				taxRate = 0.15;
				taxableIncome -= 8350 + 33950; 
			} else if (income <= 82250) {
				taxRate = 0.25;
				taxableIncome -= 8350 + 82250;
			} else if (income <= 171550) {
				taxRate = 0.28;
				taxableIncome -= 8350 + 171550;
			} else if (income <= 82250) {
				taxRate = 0.33;
				taxableIncome -= 8350 + 372950;
			} else {
				taxRate = 0.35;
				taxableIncome -= 8350 + 372951;
				break;
			}
		case "MFJ":
			// Handle Married Filing Jointly status
			// Add similar cases for other filing statuses
			break;
		case "MFS":
			// Handle Married Filing Separately status
			// Add similar cases for other filing statuses
			break;
		case "HoH":
			// Handle Head of Household status
			// Add similar cases for other filing statuses
			break;
		default:
			System.out.println("Invalid filing status.");
			return 0.0; // Return 0 tax for invalid status
		}

		// Calculate the final tax
		return taxableIncome * taxRate;
	}
}
