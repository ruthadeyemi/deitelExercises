package Precious.ChapterThree;

public class ModifiedAccount {


    private String accountHolderName;
    private double accountBalance;

    public ModifiedAccount(String accountHolderName, double accountBalance) {
        this.accountHolderName = accountHolderName;
        this.accountBalance = accountBalance;
    }

    public void setName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public String getName() {
        return accountHolderName;
    }

    public void setBalance(int accountBalance) {
        if (accountBalance > 0.0) {
            this.accountBalance = accountBalance;
        }
    }

    public double getBalance() {
        return accountBalance;
    }

    public void deposit(double amount) {
        if(amount > 0.0 ){
            accountBalance += amount;
        }
    }

    public void withdrawal(double amount) {
        if (amount > accountBalance) {
            throw  new RuntimeException("Withdrawal Amount Exceed Account Balance");
        }
        else {
            accountBalance = accountBalance - amount;
        }
    }
}
