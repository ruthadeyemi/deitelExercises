package revision.chapterTwo;
import java.util.Scanner;
public class LargestAndSmallestIntegers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int largest;
        int smallest;

        System.out.print("Enter first number:");
        int firstNumber = input.nextInt();
        smallest = firstNumber;
        largest = firstNumber;

        System.out.print("Enter second number:");
        int secondNumber = input.nextInt();

        if (secondNumber < smallest)
            smallest = secondNumber;

        if (secondNumber > largest)
            largest = secondNumber;

        System.out.print("Enter third number:");
        int thirdNumber = input.nextInt();

        if (thirdNumber < smallest)
            smallest = thirdNumber;

        if (thirdNumber > largest)
            largest = thirdNumber;

        System.out.print("Enter fourth number:");
        int fourthNumber = input.nextInt();

        if (fourthNumber < smallest)
            smallest = fourthNumber;

        if (fourthNumber > largest)
            largest = fourthNumber;

        System.out.print("Enter fifth number:");
        int fifthNumber = input.nextInt(); // read fifth number

        if (fifthNumber < smallest)
            smallest = fifthNumber;

        if (fifthNumber > largest)
            largest = fifthNumber;

        System.out.printf("Numbers input:%d, %d, %d, %d, %d\n\n", firstNumber, secondNumber, thirdNumber, fourthNumber, fifthNumber);
        System.out.printf("Smallest number is:%d\n", smallest);

        System.out.printf("Largest number is:%d\n", largest);
    }
}
