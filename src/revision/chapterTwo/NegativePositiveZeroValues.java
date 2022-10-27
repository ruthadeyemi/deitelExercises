package revision.chapterTwo;
import  java.util.Scanner;
public class NegativePositiveZeroValues {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        int negativeNumber = 0;
        int positiveNumber = 0;
        int numberZero = 0;
        System.out.print("Enter first number: ");
        int  firstNumber = number.nextInt();
        System.out.print("Enter second number: ");
        int secondNumber = number.nextInt();
        System.out.print("Enter third number: ");
        int thirdNumber = number.nextInt();
        System.out.print("Enter fourth number: ");
        int fourthNumber = number.nextInt();
        System.out.print("Enter fifth number; ");
        int fifthNumber = number.nextInt();

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

