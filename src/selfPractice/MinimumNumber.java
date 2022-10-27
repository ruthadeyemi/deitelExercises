package selfPractice;
import  java.util.Scanner;
public class MinimumNumber{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number:");
        double firstNumber = scanner.nextDouble();
        System.out.println("Enter second number:");
        double secondNumber = scanner.nextDouble();
        double minimum = Math.min(firstNumber, secondNumber);
        System.out.println("The minimum number is: " +minimum);
    }



}
