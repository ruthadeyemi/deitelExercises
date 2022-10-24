package chapterFour;
import java.util.Scanner;
class CreditLimitCalculatorTest {
    public static void main(String[] args) {
        Scanner info = new Scanner(System.in);
        CreditLimitCalculator creditLimitCalculator = new CreditLimitCalculator();
        int accountNo, beginningBalance, chargesTotal, creditsTotal, creditLimit;
        System.out.print("Enter Store Customer Account Number:");
        accountNo = info.nextInt();
        while(accountNo != -42){
            beginningBalance = userInput("Enter Balance At The Beginning Of The Month:", info);
            chargesTotal = userInput("Enter Total Of All Items Charged By The Customer This Month:", info);
            creditsTotal = userInput("Enter Total Of All Credits Applied To The Customer’s Account This Month:", info);
            creditLimit = userInput("Enter Customer's Allowed Credit Limit " + accountNo + ":", info);
            creditLimitCalculator.setAccountDetails(accountNo, beginningBalance, chargesTotal, creditsTotal, creditLimit);
            System.out.printf("Credit Details For Customer's Account:  %d\n", accountNo);
            System.out.printf("Initial Balance:  %d\n", creditLimitCalculator.getBeginningBalance());
            System.out.printf("Allowed Credit Limit:  %d\n", creditLimitCalculator.getAllowedCreditLimit());
            System.out.printf("Total Items Charges By Customer This Month:  %d\n", creditLimitCalculator.getTotalItemsCharges());
            System.out.printf("Total Credits Of Customer This Month:  %d\n", creditLimitCalculator.getTotalCreditsApplied());
            System.out.printf("Customer New Balance For This Month:  %d\n", creditLimitCalculator.getNewBalance());
            if (creditLimitCalculator.creditLimitExceed())
                System.out.println("Customer's Credit Limit Exceed");
            System.out.print("Do You Want To Calculate Credit Limit For Another Customer Account?, input (-42 to quit):");
        }
    }

    public static int userInput(String d, Scanner info) {
        System.out.print(d);
        return info.nextInt();
    }
}