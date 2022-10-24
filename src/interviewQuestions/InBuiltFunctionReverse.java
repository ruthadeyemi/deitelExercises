package interviewQuestions;

import java.util.Scanner;

public class InBuiltFunctionReverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Word: ");
        String word = input.nextLine();
        System.out.println("After reversing it: ");
        for (int iterate = word.length(); iterate > 0; --iterate){
            System.out.print(word.charAt(iterate - 1));
        }
    }
}
