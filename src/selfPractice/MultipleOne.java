package selfPractice;
import java.util.Scanner;
public class MultipleOne {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = sc.nextInt();
        System.out.print("Enter a number: ");
        int y = sc.nextInt();
        System.out.printf("%d is%sa multiple of %d\n", x, (x % y == 0 ? " " : " not "), y);
    }
}
