package revision.chapterThree;
import java.time.LocalDate;
public class HeartRates {
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;

    public HeartRates(String firstName, String lastName, int day, int month, int year) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = LocalDate.of(year, month, day);
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

    public void setDateOfBirth(int year, int month, int day) {
        this.dateOfBirth = LocalDate.of(year,month,day);
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
        System.out.println("Your maximum heart rate is: "+calculateForMaximumHeartRate()+ "\nYour target heart rate is between "+ calculateForTargetHeartRate50() + " and "+ calculateForTargetHeartRate85());
    }
}