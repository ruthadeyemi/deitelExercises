package selfPractice;
public class Account {
    private String name;
    private double balance;

    public Account(String name, double balance){
        this.name = name;

        if (balance > 0.0){
            this.balance = balance;
        }
    }

    public void deposit(double depositAmount) {
        if (depositAmount > 0.0) {
            balance = balance + depositAmount;
        }
    }
    public double getBalance(){
        return balance;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }



//
//        else{
//            System.out.println("cannot deposit amount!!!!!!!!");
//        }
//
//    }
//    public void withdrawal(double withdrawalAmount)
//    {
//        if(withdrawalAmount > 0.0 & withdrawalAmount <= balance)
//        {
//            balance = balance - withdrawalAmount;
//            this.balance = balance;
//        }
//        else
//        {
//            System.out.println("Withdrawal amount exceeded account balance");
//        }
//    }




}
