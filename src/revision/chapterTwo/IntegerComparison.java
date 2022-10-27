package revision.chapterTwo;
import java.util.Scanner;
public class IntegerComparison {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int numberSquare = number * number;
        int comparedNumber = 100;

        if (number > 100) {
            System.out.printf("The number %d is greater than %d%n", number, 100);
            System.out.printf("%d > %d%n",number,comparedNumber);
        }
        if(numberSquare > 100) {
            System.out.printf("The square of your number is %d : it is greater than %d%n", numberSquare, 100);
            System.out.printf("%d > %d%n", numberSquare,comparedNumber);
        }
        if(number < 100) {
            System.out.printf("The number %d is less than %d%n", number, 100);
            System.out.printf("%d < %d%n",number,comparedNumber);
        }
        if(numberSquare < 100) {
            System.out.printf("The square of your number is %d: it is less than %d%n", numberSquare, 100);
            System.out.printf("%d < %d%n", numberSquare,comparedNumber);
        }
        if (number == 100) {
            System.out.printf("The number %d is equal to %d%n", number, 100);
            System.out.printf("%d > %d%n",number,comparedNumber);
        }
        if(numberSquare == 100) {
            System.out.printf("The square of your number is %d : it is equal to %d%n", numberSquare, 100);
            System.out.printf("%d == %d%n", numberSquare,comparedNumber);
        }
        if (number != 100) {
            System.out.printf("The number %d is not equal to %d%n", number, 100);
            System.out.printf("%d != %d%n",number,comparedNumber);
        }
        if(numberSquare != 100) {
            System.out.printf("The square of your number is %d : it is not equal to %d%n", numberSquare, 100);
            System.out.printf("%d != %d%n", numberSquare,comparedNumber);
        }
    }
}
