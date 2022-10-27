package revision.chapterThree;

public class HealthProfile {
    private String firstName, lastName, gender;
    private int[] dateOfBirth = new int[3];
    private double weight, height;

    public HealthProfile(String firstName, String lastName, String gender, int[] dateOfBirth, double weight, double height) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.weight = weight;
        this.height = height;

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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int[] getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(int[] dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getUserAge(){
        return java.util.Calendar.getInstance().get(java.util.Calendar.YEAR) - dateOfBirth[2];
    }

    public  double getBodyMaxIndex(){
        return ((weight * 700) / (height * height));
    }

    public  int getMaximumHeartRateRange(){
        return  220 - getUserAge();
    }

    public  String getTargetHeartRate(){
        return String.format("%.0f - %.0f", getMaximumHeartRateRange() * 0.5, getMaximumHeartRateRange() * 0.85);
    }

    public void printHealthProfileInformation(){
        System.out.println("\n========== Your Health Profile Information ============");
        System.out.printf("Name:\t%s %s\n", firstName, lastName);
        System.out.printf("Date Of Birth:\t%d/%d/%d\nAge:\t%d\n", dateOfBirth[0], dateOfBirth[1], dateOfBirth[2], getUserAge());
        System.out.printf("Height:\t%.2f inches\nWeight: %.2f pounds\n", height, weight);
        System.out.printf("\n***** Your Hearth Rate Is *****\n");
        System.out.printf("Max:\t%d\nTarget:\t%s\n", getMaximumHeartRateRange(), getTargetHeartRate());
        System.out.printf("\n***** Body Max Index *****\n");
        System.out.printf("Your Body Max Index: %.1f\n\n", getBodyMaxIndex());
        System.out.println("Body Max Index Information From Department Of Health And Human Services National Institutes of Health.");
        printBodyMaxIndexTable();
    }

    private void printBodyMaxIndexTable(){
        System.out.println("Body Max Index Values:");
        System.out.println("Underweight: less than 18.5");
        System.out.println("Normal:      between 18.5 and 24.9");
        System.out.println("Overweight:  between 25 and 29.9");
        System.out.println("Obese:       30 or greater");
    }
}
