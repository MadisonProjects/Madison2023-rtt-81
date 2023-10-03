/* Write a while loop
 * while a number is > 0 subtract 1 from the number starting at 10
 */

package classwork10_2;

public class ProblemFour {
    public static void main(String[] args) {
        int number = 10; // Starting number

        while (number > 0) {
            System.out.println("Number: " + number);
            number--; // Subtract 1 from the number
        }
    }
}
