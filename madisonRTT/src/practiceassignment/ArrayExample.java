package practiceassignment;

public class ArrayExample {

	public static void main(String[] args) {
		int arraySize = 10;

		// Create a new array of type double with 20 elements
		double[] doubleArray = new double[arraySize];

		String[] stringArray = new String[arraySize];
		stringArray[0] = "zero";
		stringArray[1] = "one";
		stringArray[2] = "two";
		stringArray[3] = "three";
		stringArray[4] = "four";

		// Find the last position in the array (starting at index 9 and counting down to
		// 0)
		int lastNonNullPosition = -1; // Initialize to -1 in case there are no non-null values
		for (int pos = arraySize - 1; pos >= 0; pos--) {
			if (stringArray[pos] != null) {
				lastNonNullPosition = pos;
				break; // Exit the loop after finding the last non-null position
			}
		}
		if (lastNonNullPosition != -1) {
			System.out.println("Last position with a non-null value is " + lastNonNullPosition);
		} else {
			System.out.println("No non-null values found.");
		}

		// Count how many values are not null
		int countNotNull = 0;
		for (String value : stringArray) {
			if (value != null) {
				countNotNull++;
			}
		}
		System.out.println("Number of non-null values is " + countNotNull);

		// Find the last position of null
		int lastNullPosition = -1; // Initialize to -1 in case there are no null values
		for (int pos = arraySize - 1; pos >= 0; pos--) {
			if (stringArray[pos] == null) {
				lastNullPosition = pos;
				break; // Exit the loop after finding the last null position
			}
		}
		if (lastNullPosition != -1) {
			System.out.println("Last position with a null value is " + lastNullPosition);
		} else {
			System.out.println("No null values found.");
		}

		// Split the letters string and count non-vowels
		String letters = "a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z";
		String[] letterArray = letters.split(",");
		int countNonVowels = 0;

		for (String letter : letterArray) {
			if (!isVowel(letter)) {
				countNonVowels++;
			}
		}
		System.out.println("Number of non-vowels is " + countNonVowels);
	}

	// Function to check if a character is a vowel
	public static boolean isVowel(String letter) {
		return "aeiou".contains(letter);
	}
}
