package Precious.chapterTwo;
import selfPractice.Sum;

import java.util.Arrays;
import java.util.Scanner;
public class IntegerCharacter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of character you want input: ");
        int[] sum = new int[input.nextInt()];
        for (int i = 0; i < sum.length; i++) {
            System.out.println("enter a character:" + i);
//            sum[i] = input.next().charAt(0);
            String _char = input.next();

            sum[i]= (int)_char.charAt(0);
        }
//        System.out.println(Arrays.toString(sum));

        for (int i = 0; i < sum.length; i++) {
            if (i == sum.length-1) System.out.println(sum[i]);
            else System.out.print(sum[i] + ", ");

        }
    }

//     "   System.out.printf("The character %c has the value %d%n", , ((int) ));
//        char character;
//        for (character = 'A'; character<= 'Z'; ++character ){
//            System.out.print(character+"");
//        }"




}
