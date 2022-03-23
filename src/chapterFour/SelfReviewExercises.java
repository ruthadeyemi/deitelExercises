package chapterFour;
public class SelfReviewExercises {
    public static void main(String[] args) {
        //4.1
//           a) sequence, selection, iteration.
//           b) if…else.
//           c) counter-controlled (or definite).
//           d) sentinel, signal, flag or dummy.
//           e) sequence.
//           f) 0 (zero).
//           g) prefixed.
//           h) 8 [Note: You might expect a compilation error on the assignment statement. The Java Language Specification says that compound
//           assignment operators perform an implicit cast on the right-hand expression’s value to match the
//           type of the variable on the operator’s left side. So the calculated value 5 + 3.3 = 8.3 is actually cast
//           to the int value 8.].
        //4.2
//                         a) True.
//                         b) False. A set of statements contained within a pair of braces ({ and }) is called a  block.
//                         c) False. An iteration statement specifies that an action is to be repeated while some condition remains true.
//                         d) True.
//                         e) True.
//                         f) False. The primitive types (boolean, char, byte, short, int, long,float and double) are portable across all computer platforms that support Java.
//                         g) True.
//                         h) False. The unary cast operator (double) creates a temporary floating-point copy of its operand.
//                         i) False.Instance variables of type boolean are given the value false by default.
//                         j) True.
        //4.3
//        1 x = x + 1;
//        2 x += 1;
//        3 ++x;
//        4 x++;
                                   // 4.4
//                                  a) z = x++ + y;
//                                  b) f (count > 10) {  System.out.println("Count is greater than 10");}
//                                  c) total -= --x;
//                                  d) q %= divisor;
//                                     q = q % divisor;
        // 4.5
//        a) int sum = 0;
//        b) int x = 1;
//        c) sum += x; or sum = sum + x;
//        d) System.out.printf("The sum is: %d%n", sum);
                              //4.6
//                               public class Calculate {
//                                       public static void main(String[] args) {
//                                          int sum = 0;
//                                          int x = 1;
//                                          while (x <= 10) {
//                                         sum += x;
//                                         10 ++x; }
//                                         System.out.printf("The sum is: %d%n", sum);}}
        //4.7
//        product = 25, x = 6
                       //4.8
//                         a) Error: The closing right brace of the while statement’s body is missing.Correction: Add a closing right brace after the statement ++c
//                         b) Error: The semicolon after else results in a logic error. The second output statement will always be executed.
//                         Correction: Remove the semicolon after else.
        //4.9
//        The value of the variable z is never changed in the while statement.
//        Therefore, if the loop-continuation condition (z >= 0) is true, an infinite loop is created.
//        To prevent an infinite loop from occurring, z must be decremented so that it eventually becomes less than 0.
        //The if single-selection statement and the while repetition statement both perfor an action (or set of actions) based on whether a condition is true or false.
        // However if the condition is true, the if single-selection statement performs the action(s) once whereas the while repetition statement repeatedly performs the action(s)
        // until the condition becomes false.
//                         4.11
//                         When a Java program attempts to divide one integer by another, the result should yield in the integer division.
//                         The fractional part of the calculation is lost. To avoid that from happening you can type cast the divisor and the dividend to float
//        4.12
//        The if..else double selection statement perform one action when the condition is true and a different action when the condition is false.
//        The while... repetition statement allows you to specify that a program should repeat an action while some condition remain true.
//                         4.13
//                          Counter-controlled repetition would be appropriate for calculating the sum of the first 100 positive integers because the number of repetition is known in advance.
//                          The program that performs this task could use a while repetition statement with a counter variable that takes on the values 1 to 100.
//                          The program could then add the current counter value to the total variable in each repetition of the loop.
//         4.13b
//        Sentinel-controlled repetition would be appropriate for calculating the sum of an arbitrary number of positive integers.
//        The program that performs this task could use a sentinel value of –1 to mark the end of data entry.
//        The program could use a while repetition statement that totals positive integers from the user until the user enters the sentinel value.
//
//                                4.14
//                                Post Increment(n++) : First execute the statement then increase the value by one.
//                                Pre Increment (++n) : First increase the value by one then execute the statement.
//        4.15 Identify and correct the errors in each of the following pieces of code.
//                a) if ( age >= 65 );
//        System.out.println( "Age greater than or equal to 65" );
//      else
//        System.out.println( "Age is less than 65 )";
//        The semicolon at the end of the if condition should be removed. The closing double
//        quote of the second System.out.println should be inside the closing parenthesis.
//                b) int x = 1, total;
//        while ( x <= 10 )
//        {
//            total += x;
//            ++x;
//        }
//        The variable total should be initialized to zero.
//        c) while ( x <= 100 )
//            total += x;
//        ++x;
//        The two statements should be enclosed in curly braces to properly group them into the body of the while; otherwise the loop will be an infinite loop.
//        d) while ( y > 0 )
//        {
//            System.out.println( y );
//            ++y;
//            The ++ operator should be changed to --; otherwise the loop will be an infinite loop.
//            The closing curly brace for the while loop is missing.
}
}
