package chapterTwo;
//Exercise 2.15 semicolon java.
import java.util.Scanner;
public class Arithmetic {
    public static void main(String[] args) {
   Scanner number = new Scanner(System.in);
   int num1;
   int num2;
   int sum;
   int product;
   double division;
   System.out.println("Enter first integer: ");
        num1 = number.nextInt();
        System.out.println("Enter second integer: ");
         num2 = number.nextInt();
         sum = num1 + num2;
         product = num1 * num2;
         division = num1/num2;
        System.out.print("The sum is: " +sum+ " " +  "The product is: " +product+ " "+  "The division is: " +division+  " ");

    }
}
