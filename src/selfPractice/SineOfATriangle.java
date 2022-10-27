package selfPractice;
import java.util.Scanner;
public class SineOfATriangle{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the opposite number of a triangle: ");
        int opposite = scanner.nextInt();
        System.out.println("Enter the hypotenuse number of a triangle: ");
        int hypotenuse = scanner.nextInt();
        System.out.println("Enter the adjacent number of a triangle: ");
        int adjacent = scanner.nextInt();
        int sine = opposite / hypotenuse;
        System.out.printf("Sine is: %d. ", sine);
        int cosine = adjacent / hypotenuse;
        System.out.printf("cosine is: %d. ", cosine);
        int tangent = opposite / adjacent;
        System.out.printf("Tangent is: %d. ", tangent);
         scanner.close();
    }
}