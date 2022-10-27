package revision.chapterTwo;
import java.util.Scanner;
public class Arithmetic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int firstNumber = input.nextInt();

        System.out.print("Enter an integer: ");
        int secondNumber = input.nextInt();

        int squareOfFirstNumber = firstNumber * firstNumber;
        int squareOfSecondNumber = secondNumber * secondNumber;

        int sumOfSquare = squareOfFirstNumber + squareOfSecondNumber;
        int differenceOfSquare = squareOfFirstNumber - squareOfSecondNumber;

        System.out.printf("The square of your first integer is %d%n","\n", "The square of your second integer is %d%n","\n", "The sum of the squares of your integers are %d%n","\n", "The difference of the sum of your integers are %d%n",squareOfFirstNumber,squareOfSecondNumber,sumOfSquare,differenceOfSquare);



































//        System.out.print("Enter first number: ");
//        int firstNumber = input.nextInt();
//        System.out.print("Enter second number: ");
//        int secondNumber = input.nextInt();
//        int sum = firstNumber + secondNumber;
//        int product = firstNumber * secondNumber;
//        double difference  = firstNumber / secondNumber;
//        System.out.print("The sum is: " +sum+"\n" +  "The product is: " +product+"\n"+  "The division is: " +difference+  " ");
    }
}
