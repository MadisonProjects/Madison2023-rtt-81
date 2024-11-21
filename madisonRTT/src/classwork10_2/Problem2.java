/* Write a for loop that calculates the sum of 
 * the remainders of each number
 * divided by 2 between 1 and 100
 */
package classwork10_2;

public class ProblemTwo {
    public static void main(String[] args) {
        int sumOfRemainders = 0; // Initialize the sum to 0

        // Use a for loop to iterate from 1 to 100
        for (int i = 1; i <= 100; i++) {
            int remainder = i % 2; // Calculate the remainder of 'i' divided by 2
            sumOfRemainders += remainder; // Add the remainder to the sum
        }

        System.out.println("The sum of remainders of numbers divided by 2 between 1 and 100 is: " + sumOfRemainders);
    }
}
