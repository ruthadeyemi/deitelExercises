package revision.chapterThree;
import java.util.Scanner;
public class HeartRateAppDriverClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first name: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter last name: ");
        String lastName = scanner.nextLine();
        System.out.print("Enter your day of birth: ");
        int day = scanner.nextInt();
        System.out.print("Enter your month of birth: ");
        int month = scanner.nextInt();
        System.out.print("Enter your Year of birth: ");
        int year = scanner.nextInt();
        HeartRates display = new HeartRates(firstName, lastName,day,month,year);
        System.out.println();
        System.out.print("========User Information========");
        System.out.println("\t\nFirstName: " +firstName+"\t\nlastName: " +lastName+ "\t\nAge: " + display.calculateForAge());
        display.targetHeartRate();
        display.calculateForMaximumHeartRate();
    }
}
