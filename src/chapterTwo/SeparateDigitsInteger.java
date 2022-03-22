package chapterTwo;
//2.30
import java.util.Scanner;
public class SeparateDigitsInteger {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input five digits: ");
        int input = in.nextInt();
        int n1 = input / 10000 % 10;
        int n2 = input / 1000 % 10;
        int n3 = input / 100 % 10;
        int n4 = input / 10 % 10;
        int n5 = input % 10;
        System.out.println(n1 + " " + n2 + " " + n3 + " " + n4 + " " + n5 );

    }
}
