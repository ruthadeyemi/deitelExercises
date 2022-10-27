package classwork;
import java.util.Scanner;
public class Palindromes {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter five number: ");
        int numberOne = input.nextInt();
        int numberTwo = input.nextInt();
        int numberThree = input.nextInt();
        int numberFour = input.nextInt();
        int numberFive = input.nextInt();
        if(numberOne == numberFive){
            if(numberTwo == numberFour){
                System.out.printf("%d %d %d %d  is palindrome", numberOne, numberTwo,  numberFour, numberFive);
            }
        }
        if(numberOne != numberFive){
            if(numberTwo != numberFour){
                System.out.printf("%d %d %d %d  is not palindrome", numberOne, numberTwo,  numberFour, numberFive);
            }
        }
    }
}

