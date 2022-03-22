package chapterTwo;
//Exercise 2.16 semicolon java.
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
