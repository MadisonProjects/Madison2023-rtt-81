package sep22practice;

import java.util.Scanner;

public class Bmi {
	public static void main(String args[]) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Input weight in kilogram: ");
			double weight = sc.nextDouble();
			System.out.print("\nInput height in meters: ");
			double height = sc.nextDouble();
			// calcuate bmi
			double BMI = weight / (height * height);
			// check range
			if (BMI < 18.5)
				System.out.println("Under weight");
			else if (BMI >= 18.5 && BMI < 25)
				System.out.println("Normal");
			else if (BMI >= 25 && BMI < 25)
				System.out.println("Overweight");
			else
				System.out.println("Obese");
			System.out.print("\n The Body Mass Index (BMI) is " + BMI + "kg/m2");
		}
	}
}
