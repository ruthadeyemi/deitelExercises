package chapterThree;//3.11
public class ModifiedAccountClass {
    private String name;
    private double balance;
    public ModifiedAccountClass(String name, double balance){
        this.name = name;
        if (balance > 0.0){
            this.balance = balance;
        }
    }
    public void deposite(double depositeAmount){
        if(depositeAmount > 0.0){
            balance = balance + depositeAmount;
        }
    }
    public  void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void withdrawal(double amount){
        if (amount > balance)
            System.out.println(" withdrawal amount exceeded account balance." );
        if ( amount <= balance )
            balance = balance - amount;
    }
    public double getBalance() {
        return balance;
    }

}
