package revision.chapterTwo;
import java.util.Scanner;
public class Multiples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print( "Enter first number: " );
        int firstNumber = input.nextInt();

        System.out.print( "Enter second number: " );
        int secondNumber = input.nextInt();

        if ( firstNumber % secondNumber == 0 )
            System.out.printf( "%d is a multiple of %d\n", firstNumber, secondNumber );

        if ( firstNumber % secondNumber != 0 )
            System.out.printf( "%d is not a multiple of %d\n", firstNumber, secondNumber );
    }
}
