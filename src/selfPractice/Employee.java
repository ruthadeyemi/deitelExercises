package chapterThree;

public class Employee {
    private String firstName;
    private String lastName;
    private double monthlySalary;

    public Employee(String firstName, String lastName, double monthlySalary){
        this.firstName = firstName;
        this.lastName = lastName;
        if(monthlySalary < 0.00)
        {
            monthlySalary = 0;
            System.out.println("Monthly salary cannot be negative");
            this.monthlySalary = monthlySalary;
        }

        this.monthlySalary = monthlySalary;


    }

    public double getyearlySalary()
    {
        return  getMonthlySalary() * 12;
    }


    public double getTenPercentRaise()
    {
        double raise = 0.1 *getMonthlySalary() ;
        return raise + getMonthlySalary();
    }


    public double getYearlySalaryAfterTenPercentRaise()
    {

        return getTenPercentRaise() * 12;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;

    }
    public String getFirstName(){
        return firstName;
    }

    public void setlastName(String lastName){

        this.lastName = lastName;
    }
    public String getLastName(){

        return lastName;
    }
    public void setMonthlySalary(double monthlySalary){
        this.monthlySalary = monthlySalary;

    }
    public double getMonthlySalary(){
        return monthlySalary;
    }
}
