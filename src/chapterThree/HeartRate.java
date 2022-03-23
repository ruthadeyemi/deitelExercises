package chapterThree;//3.16
import java.time.LocalDate;
public class HeartRate {
    private String firstName;
    private  String lastName;
    private LocalDate dateOfBirth;

    public HeartRate(String firstName, String lastName,int day, int month, int year) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = LocalDate.of(year,month,day);
       // this.dateOfBirth = dateOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

//    public void setDateOfBirth(LocalDate dateOfBirth) {this.dateOfBirth = dateOfBirth;}

    public void setDayOfBirth(int year, int month, int day){
        this.dateOfBirth = LocalDate.of(year, month, day);
    }

    public int  calculateForAge(){
        int currentYear = LocalDate.now().getYear();
        return currentYear - dateOfBirth.getYear();
    }

    public int calculateForMaximumHeartRate(){
        int maximumHeartRate = 220 -  calculateForAge();
        return maximumHeartRate;
    }

    public int calculateForTargetHeartRate50(){
        double targetHeartRate50Percent = calculateForMaximumHeartRate() * 0.5;
        return (int)targetHeartRate50Percent;
    }

    public int calculateForTargetHeartRate85(){
        double targetHeartRate85Percent = calculateForMaximumHeartRate() * 0.85;
        return (int)targetHeartRate85Percent;
    }

    public void targetHeartRate() {
        System.out.println("Your target heart rate is between "+ calculateForTargetHeartRate50() + " and "+ calculateForTargetHeartRate85());
    }
}
