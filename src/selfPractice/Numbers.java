package selfPractice;
import java.util.Scanner;
public class Numbers {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        int firstNumber;
        int secondNumber;
        int thirdNumber;
        int fourthNumber;
        int fifthNumber;
        int negativeNumber = 0;
        int positiveNumber = 0;
        int numberZero = 0;
        System.out.print("Enter first number: ");
        firstNumber = number.nextInt();
        System.out.print("Enter second number: ");
        secondNumber = number.nextInt();
        System.out.print("Enter third number: ");
        thirdNumber = number.nextInt();
        System.out.print("Enter fourth number: ");
        fourthNumber = number.nextInt();
        System.out.print("Enter fifth number; ");
        fifthNumber = number.nextInt();

        if (firstNumber < 0)
            negativeNumber = negativeNumber + 1;
        if (secondNumber < 0)
            negativeNumber = negativeNumber + 1;
        if (thirdNumber < 0)
            negativeNumber = negativeNumber + 1;
        if (fourthNumber < 0)
            negativeNumber = negativeNumber + 1;
        if (fifthNumber < 0)
            negativeNumber = negativeNumber + 1;

        if (firstNumber > 0)
            positiveNumber = positiveNumber + 1;
        if (secondNumber > 0)
            positiveNumber = positiveNumber + 1;
        if (thirdNumber > 0)
            positiveNumber = positiveNumber + 1;
        if (fourthNumber > 0)
            positiveNumber = positiveNumber + 1;
        if (fifthNumber > 0)
            positiveNumber = positiveNumber + 1;

        if (firstNumber == 0)
            numberZero = numberZero + 1;
        if (secondNumber == 0)
            numberZero = numberZero + 1;
        if (thirdNumber == 0)
            numberZero = numberZero + 1;
        if (fourthNumber == 0)
            numberZero = numberZero + 1;
        if (fifthNumber == 0)
            numberZero = numberZero + 1;

        System.out.println();
        System.out.printf(" negative numbers is: %d\n", negativeNumber);
        System.out.printf(" positive numbers is: %d\n", positiveNumber);
        System.out.printf(" zero numbers is: %d\n", numberZero);
    }
}
