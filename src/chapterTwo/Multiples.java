package chapterTwo;
//2.26
import java.util.Scanner;
public class Multiples {
    public static void main(String[] args) {
        Scanner numbers = new Scanner (System.in);
        int firstNumber;
        int secondNumber;
        int determine;
        System.out.print ("Enter First Number: ");
        firstNumber = numbers.nextInt();
        System.out.print ("Enter Second Number: ");
        secondNumber = numbers.nextInt();
        determine = firstNumber%secondNumber;

        System.out.println ();

        if (determine == 0)
            System.out.printf ("The Number %d is a multiple of %d", firstNumber , secondNumber);
        else
            System.out.printf ("The Number %d is not a multiple of %d", firstNumber, secondNumber);

    }
}
