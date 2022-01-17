package classwork;
import java.util.Scanner;

public class Factors {
    public static void main(String[] args){
 Scanner input = new Scanner(System.in);
        int number;
        int f=1;
        int count = 0;

         System.out.println("Enter integer:");
         number = input.nextInt();

        for(f = 1; f <= number; f++){
            if(number % f == 0){
                System.out.println(f);
                count++;


            }

        }
        System.out.println("number of factors are: " +  count);
    }

}
