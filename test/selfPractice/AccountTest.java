//package selfPractice;
//
//import java.util.Scanner;
//
//public class AccountTest {
//    public static void main(String[] args) {
//
//        Account myAccount = new Account("Ibidapo Abdulazeez", 60.00);
//        Account dapoAccount = new Account("Dapo Abiodun", 0.00);
//
//
//
//        Scanner input = new Scanner (System.in);
//
//        System.out.print("Enter deposit amount for my Account: ");
//        double depositAmount = input.nextDouble();
//        System.out.printf("%n adding %.2f to myAccount balance%n%n", depositAmount);
//        myAccount.deposit(depositAmount);
//
//        System.out.printf("%s balance: #%.2f%n",
//                myAccount.getName(), myAccount.getBalance());
//        System.out.printf("%s balance: #%.2f%n",
//                dapoAccount.getName(), dapoAccount.getBalance());
//
//        System.out.print("Enter deposit amount for Dapo's Account : ");
//        depositAmount = input.nextDouble();
//        System.out.printf("%nadding %.2f to Dapo's balance%n%n",
//                depositAmount);
//        dapoAccount.deposit(depositAmount);
//
//        System.out.printf("%n%s balance : #%.2f%n",
//                myAccount.getName(), myAccount.getBalance());
//        System.out.printf("%s balance : #%.2f%n%n",
//                dapoAccount.getName(), dapoAccount.getBalance());
//
//
//
//        System.out.print("Enter withdrawal amount for myAccount : ");
//        double withdrawalAmount = input.nextDouble();
//        System.out.printf("%n removing %.2f from myAccount %n%n",
//                withdrawalAmount);
//        myAccount.withdrawal(withdrawalAmount);
//        System.out.printf("%n%s balance : #%.2f%n",
//                myAccount.getName(), myAccount.getBalance());
//
//
//        System.out.print("Enter withdrawal amount for Dapo's Account : ");
//        withdrawalAmount = input.nextDouble();
//        System.out.printf("%n removing %.2f from %s Account %n",
//                withdrawalAmount, dapoAccount.getName());
//        dapoAccount.withdrawal(withdrawalAmount);
//
//
//        System.out.printf("%s balance : #%.2f%n%n",
//                dapoAccount.getName(), dapoAccount.getBalance());
//
//    }
//}
