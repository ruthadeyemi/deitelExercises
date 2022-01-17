package chapterTwo;
//Exercise 2.16 semicolon java.
/*2.16 (Comparing Integers) Write an application that asks the user to enter two integers, obtains
        them from the user and displays the larger number followed by the words "is larger".
        If the numbers are equal, print the message "These numbers are equal". */
import java.util.Scanner;
public class ComparingIntegers {
    public static void main(String[] args) {
Scanner input = new Scanner(System.in);
        System.out.println("Please enter first number.");
int number1 = input.nextInt();
        System.out.println("please enter second number.");
        int number2 = input.nextInt();
        if (number1 > number2){
            System.out.println(number1+ " first input is larger.");
        }
        else if(number2 > number1){
            System.out.println(number2+ " second input is larger.");
        }
        if (number1 == number2){
            System.out.println("These numbers are equal.");
        }
    }
}
