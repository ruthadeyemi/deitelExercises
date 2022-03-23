package chapterThree;//3.11
import java.util.Scanner;
public class ModifiedAccountTest {
    public static void main(String[] args) {
        ModifiedAccountClass  account1 = new ModifiedAccountClass ("Jane Green", 50.00);
        ModifiedAccountClass  account2 = new ModifiedAccountClass ("John Blue", -7.53);
        System.out.printf("%s Account balance is: $%.2f%n ", account1.getName(), account1.getBalance());
        System.out.printf("%s Account balance is: $%.2f%n ", account2.getName(), account2.getBalance());
        Scanner depositMoney = new Scanner(System.in);
        System.out.println("Enter deposit amount for Account1: ");
        double depositAmount = depositMoney.nextDouble();
        System.out.printf("%n Adding amount to Account1 balance%n%n",depositAmount);
        account1.deposite(depositAmount);
        System.out.print("Enter deposit amount for Account2: ");
        depositAmount = depositMoney.nextDouble();
        System.out.printf("%n Adding amount to Account2 balance%n%n", depositAmount);
        account2.deposite(depositAmount);
        System.out.printf("%s balance is : $%.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance is : $%.2f%n", account2.getName(), account2.getBalance());
        System.out.print( "Enter withdrawal amount for Account1: ");
        double withdrawalAmount = depositMoney.nextDouble();
        System.out.printf("subtracting %.2f from Account1.",withdrawalAmount);
        account1.withdrawal(withdrawalAmount);
        System.out.printf(" Current Account1 balance is : $%.2f\t\n", account1.getBalance(), "\n" );
        System.out.print("Enter withdrawal amount for Account2: ");
        withdrawalAmount = depositMoney.nextDouble();
        System.out.printf("subtracting %.2f from Account2.",withdrawalAmount);
        account2.withdrawal(withdrawalAmount);
        System.out.printf(" Current Account2 balance is : $%.2f\t\t", account1.getBalance());


    }
}
