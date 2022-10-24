package classwork;
import java.util.Scanner;
public class CountNumberFactors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integer:");
        int number = scanner.nextInt();
        int count = 0;
        int f = 1;
        for(f = 1; f <= number; f++){
            if(number % f == 0) {
                System.out.println(f);
                count++;


            }
        }
        System.out.println("number of factors are: " +  count);
    }
}
