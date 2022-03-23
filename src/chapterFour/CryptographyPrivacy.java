package chapterFour; //4.39
import java.util.Scanner;
public class CryptographyPrivacy {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.println("Enter four digits integer: ");
        int numbers = input.nextInt();
        int value = 10;
        int numberOne = (numbers/1000);
        int numberTwo = (numbers % 1000)/100;
        int numberThree = (numbers % 100) /10;
        int numberFour = (numbers % 10);

        int enNumberOne = (numberOne + 7) % value;
        int enNumberTwo = (numberTwo + 7) % value;
        int enNumberThree = (numberThree + 7) % value;
        int enNumberFour = (numberFour + 7) % value;
    }


//        System.out.printf("\nThe modulo digits is %d %d %d %d", enNumberOne, digit2Modulo, digit3Modulo, digit4Modulo);
//        System.out.printf("\nAfter swapping the modulo results, the new digits are " +
//                "%d %d %d %d ",digit3Modulo,digit4Modulo,digit1Modulo,digit2Modulo);
}
