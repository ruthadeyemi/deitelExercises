package revision.chapterTwo;
import java.util.Scanner;
public class IntegerSeparator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int fiveIntegers;
        int numberOne, NumberTwo, numberThree, numberFour, numberFive;
        System.out.print("Enter a five digit integer: ");
        fiveIntegers = input.nextInt();

        numberOne = fiveIntegers/10_000;
        NumberTwo = fiveIntegers%10_000/1000;
        numberThree = fiveIntegers%10_000%1000/100;
        numberFour = fiveIntegers%10_000%1000%100/10;
        numberFive = fiveIntegers%10_000%1000%100%10;

        System.out.printf("%d %d %d %d %d", numberOne, NumberTwo, numberThree, numberFour, numberFive);
    }
}
