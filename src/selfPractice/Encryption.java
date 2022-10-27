package selfPractice;
import java.util.Scanner;
public class Encryption {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n =10;

        System.out.println("Enter 4 digits");
        int digits = input.nextInt();

        int digit1 = digits/1000;
        int digit2 = (digits % 1000)/100;
        int digit3 = (digits % 100) /10;
        int digit4 = (digits %10);

        System.out.println("The digits are "+digit1+ " "+digit2+" "+digit3+" "+digit4);
        int digit1Modulo = (digit1 +7) % n;
        int digit2Modulo = (digit2 +7) % n;
        int digit3Modulo = (digit3 +7) % n;
        int digit4Modulo = (digit4 +7) % n;

        System.out.printf("\nThe modulo digits is %d %d %d %d", digit1Modulo, digit2Modulo, digit3Modulo, digit4Modulo);
        System.out.printf("\nAfter swapping the modulo results, the new digits are " +
                "%d %d %d %d ",digit3Modulo,digit4Modulo,digit1Modulo,digit2Modulo);
    }
}
