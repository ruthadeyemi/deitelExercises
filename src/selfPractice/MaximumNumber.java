package selfPractice;
import java.util.Scanner;
public class MaximumNumber {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number:");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter second number:");
        int secondNumber = scanner.nextInt();
        int maximum = Math.max(firstNumber, secondNumber);
        System.out.println("The maximum number is: " +maximum);
    }
}
