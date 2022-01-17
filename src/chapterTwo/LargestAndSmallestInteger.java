package chapterTwo;//2.24
import java.util.Scanner;
public class LargestAndSmallestInteger {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
        System.out.println("Enter first number:");
        int firstNumber=input.nextInt();
        System.out.println("Enter second Number:");
        int secondNumber=input.nextInt();
        System.out.println("Enter third Number:");
        int thirdNumber = input.nextInt();
        System.out.println("Enter fourth Number:");
        int fourthNumber = input.nextInt();
        System.out.println("Enter fifth Number:");
        int fifthNumber = input.nextInt();
        int smallest = firstNumber;
        if(secondNumber < smallest)
        smallest = secondNumber;
        if (thirdNumber < smallest)
        smallest = thirdNumber;
        if (fourthNumber < smallest)
            smallest = fourthNumber;
        if (fifthNumber < smallest)
            smallest = fifthNumber;
                System.out.printf("Smallest value is %d:", +smallest);
        int largest = firstNumber;
        if (secondNumber > largest)
        largest = secondNumber;
        if (thirdNumber > largest)
        largest = thirdNumber;
        if(fourthNumber > largest)
            largest = fourthNumber;
        if(fifthNumber > largest)
            largest = fifthNumber;
        System.out.printf("    Largest value is %d:", +largest);
    }
}
