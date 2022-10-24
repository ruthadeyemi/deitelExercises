package Precious.chapterTwo;

import java.util.Scanner;
public class Multiple {
    private static int result =1;
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter a number:");
            int firstNumber = input.nextInt();
            multiplication(firstNumber);
        }
            System.out.println(resultValue());
    }
    public static int multiplication(int firstNumber){
        return result *= firstNumber;
    }

    public static int resultValue(){
        return result;
    }
}
