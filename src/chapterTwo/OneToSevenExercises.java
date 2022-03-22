package chapterTwo;
import java.util.Scanner;
public class OneToSevenExercises {
    public static void main(String[] args) {
       // 2.1
        // a) left brace ({), right brace (}).
        // b) if.
        // c) //.
        // d) Space characters, newlines and tabs.
       // e) Keywords.
        // f) main.
        // g) System.out.print, System.out.println and System.out.printf.

        //2.2
              //a) False. Comments do not cause any action to be performed when the program executes.
              //They’re used to document programs and improve their readability.
              //b) True.
             //c) False. Java is case sensitive, so these variables are distinct.
             //d) False. The remainder operator can also be used with noninteger operands in Java.
            //e) False. The operators *, / and % have higher precedence than operators + and -.
            // f) False. As of Java 9, _ (underscore) by itself is no longer a valid identifier.
        //2.3
//        a) int c = 0;
//        int thisIsAVariable = 0;
//        int q76354 = 0;
//        int number = 0;
//        b) System.out.print("Enter an integer: ");
//        c) int value = input.nextInt();
//        d) System.out.println("This is a Java program");
//        e) System.out.printf("%s%n%s%n", "This is a Java", "program");
//        f) if (number != 7) {
//            System.out.println("The variable number is not equal to 7");

        //2.4
//a) Error: Semicolon after the right parenthesis of the condition (c < 7) in the if. As a result, the output statement executes regardless of whether the condition in the if is true.
//Correction: Remove the semicolon after the right parenthesis.
//b) Error: The relational operator => is incorrect.
//Correction: Change => to >=

//        2.5
//        a) Calculate the product of three integers
//        b) Scanner input = new Scanner(System.in);
//        c) System.out.print("Enter first integer: ");
//        d) int x = input.nextInt();
//        e) System.out.print("Enter second integer: ");
//        f) int y = input.nextInt();
//        g) System.out.print("Enter third integer: ");
//        h) int z = input.nextInt();
//        i) int result = x * y * z;
//        j) System.out.printf("Product is %d%n", result);

        //  2.6:
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int x = input.nextInt();
        System.out.print("Enter second integer: ");
        int y = input.nextInt();
        System.out.print("Enter third integer: ");
        int z = input.nextInt();
        int result = x * y * z;
        System.out.printf("Product is %d%n", result);

        //2.7
        //a - comments
        //b -if statement
        //c - assignment
        //d - remainder and division
        //e - innermost
    }
}
