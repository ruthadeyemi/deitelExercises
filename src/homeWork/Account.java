package homeWork;

public class Account {
    private String name;
    private String pin;
    private int balance = 50_000;
    public Account(String accountName, String accountPin) {
        name = accountName;
        pin = accountPin;
        //return name;
    }
    public String getAccountName(){
        return name;
        }

    public int getBalance(String acconutPin){
        return balance;
    }
    public void deposite(int amount){
        if(amount>0) {
            balance = balance + amount;
        }
    }
}
