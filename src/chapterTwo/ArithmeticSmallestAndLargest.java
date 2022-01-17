package chapterTwo;
//Exercise 2.17 semicolon java.
/*2.17 (Arithmetic, Smallest and Largest) Write an application that inputs three integers from the
        user and displays the sum, average, product, smallest and largest of the numbers. Use the techniques
        shown in Fig. 2.15. [Note: The calculation of the average in this exercise should result in an integer
        representation of the average. So, if the sum of the values is 7, the average should be 2, not
        2.3333….]*/
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
