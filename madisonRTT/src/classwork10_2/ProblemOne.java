
/* Write a for loop that calculates the sum of all 
 * the numbers between 1 and 100.
 */
package classwork10_2;

public class ProblemOne {
    public static void main(String[] args) {
        int sum = 0; // Initialize the sum to 0

        // Use a for loop to iterate from 1 to 100
        for (int i = 1; i <= 100; i++) {
            sum += i; // Add the current value of 'i' to the sum
        }

        System.out.println("The sum of numbers from 1 to 100 is: " + sum);
    }
}
