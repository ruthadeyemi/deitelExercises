package selfPractice;
import java.util.Scanner;
public class CollectUserInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your full name?");
        String name = scanner.nextLine();
        System.out.println("How old are you?");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Where do you live?");
        String address = scanner.nextLine();
        System.out.println("Marital status?");
        String status = scanner.nextLine();
        System.out.println("Add any other information of your choice");
        String anythingelse = scanner.nextLine();

        System.out.println("Hello, " +name);
        System.out.println("You are " +age+ " years old");
        System.out.println("You resides at: " +address);
        System.out.println("you are " +status);
        System.out.println("Then  " +anythingelse);





    }
}
