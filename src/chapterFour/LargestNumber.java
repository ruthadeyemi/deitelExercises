package chapterFour;//4.21
//pseudocode//
/*declare and initialize counter and largest number to zero
do a while loop that counter is less than ten, counter plus  plus
then prompt the user to enter a number ten times with the counter
then do a if statement that is variable number is larger than the last input from the user
then store the number into the variable largest number than print the largest number
 */
import java.util.Scanner;
public class LargestNumber {
    public static void main(String[] args) {
        int number;
        int largestNumber = 0;
        int counter = 0;
        Scanner userInput = new Scanner(System.in);
        while (counter < 10){
            counter++;
            System.out.println("Enter a number: ");
            number = userInput.nextInt();
            if (number > largestNumber){
                largestNumber = number;
            }
        }
        System.out.printf("The Largest Number is: %d", largestNumber);
    }
}
