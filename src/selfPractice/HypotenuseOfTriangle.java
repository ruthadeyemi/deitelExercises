package selfPractice;
import java.util.Scanner;
public class HypotenuseOfTriangle {
    public static void main(String[] args) {
        double sideA;
        double sideB;
        double resultC;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter side A of the triangle:");
        sideA = scanner.nextDouble();
        System.out.println("Enter side B of the triangle:");
        sideB = scanner.nextDouble();
        resultC = Math.sqrt((sideA * sideA)+(sideB * sideB));
        System.out.println("The hypotenuse of right-angled triangle of: " +sideA+ " and " +sideB+ " is: " +resultC);
        scanner.close();

    }
}
