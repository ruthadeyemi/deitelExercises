package chapterThree;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee myStaff = new Employee("Olalekan", "Ibidapo", 1000000);
        Employee Dapo = new Employee("Dapo", "Ade", 10000000);


        System.out.printf("%s %s is earning # %.2f monthly which is # %.2f annually %n",
                myStaff.getFirstName(),
                myStaff.getLastName(),myStaff.getMonthlySalary(),myStaff.getyearlySalary());

        System.out.printf("%s %s is earning # %.2f monthly after getting a 10 percent raise %n", myStaff.getFirstName(),
                myStaff.getLastName(), myStaff.getTenPercentRaise());
        System.out.printf("%s %s is earning # %.2f yearly after getting a 10 percent raise%n%n", myStaff.getFirstName(),
                myStaff.getLastName(), myStaff.getYearlySalaryAfterTenPercentRaise());

        System.out.printf("%s %s is earning # %.2f monthly which is # %.2f annually %n",
                Dapo.getFirstName(),
                Dapo.getLastName(),Dapo.getMonthlySalary(),Dapo.getyearlySalary());

        System.out.printf("%s %s is earning # %.2f monthly after getting a 10 percent raise %n", Dapo.getFirstName(),
                Dapo.getLastName(), Dapo.getTenPercentRaise());
        System.out.printf("%s %s is earning # %.2f yearly after getting a 10 percent raise", Dapo.getFirstName(),
                Dapo.getLastName(), Dapo.getYearlySalaryAfterTenPercentRaise());

    }
}
