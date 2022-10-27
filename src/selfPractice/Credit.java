package selfPractice;
import  java.util.Scanner;
public class Credit {
    public void calculateBalance(){
        Scanner userInput = new Scanner(System.in);
        int accountNumber;
        int oldBalance;
        int charges;
        int credits;
        int creditLimit;
        int newBalance;
        System.out.print("Enter Account Number (or -1 to quit): ");
        accountNumber =userInput.nextInt();
        while (accountNumber != -1){
            System.out.print("Enter Balance: ");
            oldBalance = userInput.nextInt();
            System.out.print("Enter Charges: ");
            charges = userInput.nextInt();
            System.out.print("Enter Credits: ");
            credits = userInput.nextInt();
            System.out.print("Enter Credit Limit: ");
            creditLimit = userInput.nextInt();
            newBalance = oldBalance + charges - credits;
            System.out.printf("New Balance is: %d\n", newBalance);
            if (newBalance > creditLimit)
                System.out.println("Credit limit exceeded");
            System.out.print("\nEnter Account number (or -1 to quit): ");
            accountNumber = userInput.nextInt();
        }
    }
}
