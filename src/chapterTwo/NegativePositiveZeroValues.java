package chapterTwo;//2.32
import java.util.Scanner;
public class NegativePositiveZeroValues {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter five separate integer ");
        int positiveNumber = 0;
        int negativeNumber = 0;
        int zero = 0;
        int firstNumber = input.nextInt();
        int secondNumber = input.nextInt();
        int thirdNumber = input.nextInt();
        int fourthNumber = input.nextInt();
        int fifthNumber = input.nextInt();
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
        if (firstNumber < 0)
            negativeNumber = negativeNumber + 1;
        if (secondNumber > 0)
            negativeNumber = negativeNumber + 1;
        if (thirdNumber > 0)
            negativeNumber = negativeNumber + 1;
        if (fourthNumber > 0)
            negativeNumber = negativeNumber + 1;
        if (fifthNumber > 0)
            negativeNumber = negativeNumber + 1;
        if (firstNumber == 0)
            zero = zero + 1;
        if (secondNumber == 0)
            zero = zero + 1;
        if (thirdNumber == 0)
            zero = zero + 1;
        if (fourthNumber == 0)
            zero = zero + 1;
        if (fifthNumber == 0)
            zero = zero + 1;
        System.out.printf ("Positive numbers = %d\n", positiveNumber);
        System.out.printf ("Negative numbers = %d\n", negativeNumber);
        System.out.printf ("Zero numbers = %d\n", zero);


    }
}
