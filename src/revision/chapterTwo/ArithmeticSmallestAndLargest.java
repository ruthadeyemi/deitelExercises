package revision.chapterTwo;
import java.util.Scanner;
public class ArithmeticSmallestAndLargest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first integer: ");
       int firstNumber = input.nextInt();

        System.out.print("Enter second integer: ");
        int secondNumber = input.nextInt();

        System.out.print("Enter third integer: ");
        int thirdNumber = input.nextInt();

        int sum = firstNumber + secondNumber + thirdNumber;
         int product = firstNumber * secondNumber * thirdNumber;
         int average = sum / 3;

        System.out.printf("The sum is: %s" +sum+  "The product is %d%n" +product+ "The average is %s", average);
    }

}
