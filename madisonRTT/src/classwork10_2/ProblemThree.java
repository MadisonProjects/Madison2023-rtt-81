/* Write a for loop that calculates 
 * the sum of the divisor of each number 
 * divided by 2 between 1 and 100 
 */
package classwork10_2;

public class ProblemThree {
    public static void main(String[] args) {
        int sum = 0; // Initialize the sum to 0

        // Use a for loop to iterate from 1 to 100
        for (int i = 1; i <= 100; i++) {
            // Check if 'i' is divisible by 2
            if (i % 2 == 0) {
                sum += calculateSumOfDivisors(i); // Calculate the sum of divisors and add to 'sum'
            }
        }

        System.out.println("The sum of divisors of numbers divided by 2 between 1 and 100 is: " + sum);
    }

    // Function to calculate the sum of divisors of a number
    public static int calculateSumOfDivisors(int num) {
        int divisorSum = 0;

        // Use a for loop to find divisors and add them to 'divisorSum'
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                divisorSum += i;
            }
        }

        return divisorSum;
    }
}

