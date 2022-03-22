package chapterTwo;
//Exercise 2.17 semicolon java.
import java.util.Scanner;
public class ArithmeticSmallestAndLargest {
    public static void main(String[] args) {
Scanner input = new Scanner(System.in);
    int smallest;
    int largest;
        System.out.println("Enter number:");
        int number1 = input.nextInt();
        System.out.println("Enter a number:");
        int number2 = input.nextInt();
        System.out.println("Enter a number:");
        int number3 = input.nextInt();
        int sum = number1+number2+number3;
        System.out.printf("The sum is: %d. ", sum);
        int product = number1*number2*number3;
        System.out.printf("The product is: %d. ", product);
        int average = sum/3;
        System.out.printf("The average is: %d. ", average);

    }
}
