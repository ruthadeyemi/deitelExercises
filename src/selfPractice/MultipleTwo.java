package selfPractice;
import java.util.Scanner;
public class MultipleTwo {
    public static void main (String [] args) {
        Scanner userInput = new Scanner(System.in);
        int firstNumber;
        int secondNumber;
        int checkForMultiple;
        System.out.print("Enter First Number: ");
        firstNumber = userInput.nextInt();
        System.out.print("Enter Second Number: ");
        secondNumber = userInput.nextInt();
        checkForMultiple = secondNumber%firstNumber;
        if (checkForMultiple == 0)
            System.out.printf (" %d is a multiple of %d", firstNumber, secondNumber);
        else
            System.out.printf (" %d is not a multiple of %d", firstNumber, secondNumber);

    }
}
