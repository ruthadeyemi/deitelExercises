package selfPractice;

public class TargetHeartRateCalculator {

    private String firstName;
    private String lastName;
    private int day;
    private int month;
    private int year;

    public TargetHeartRateCalculator(String firstName, String lastName, int day,int month, int year){
        this.firstName = firstName;
        this.lastName = lastName;
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setDay (int day){
        this.day = day;
    }
    public int getDay(){
        return day;
    }
    public void setMonth (int month){
        this.month = month;
    }
    public int getMonth(){
        return month;
    }
    public void setYear (int year){
        this.year = year;
    }
    public int getYear(){
        return year;
    }

    public int displayAge(){
        int year = 2021;
        return year - getYear();

    }

    public int maximumHeartRate() {
        int rates = 220 - displayAge();
        return rates;
    }

    public double targetHeartRate(){
        return 0.70 * maximumHeartRate();
    }}
