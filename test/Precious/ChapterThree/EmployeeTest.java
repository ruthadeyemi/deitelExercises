package Precious.ChapterThree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    Employee employee;
//    Employee employeeTwo;
    @BeforeEach
    void setUp() {
        employee = new Employee("Ruth","Adeyemi",1000);
    }
    @Test
    void employeesCanBeCreatedTest(){
        employee.setFirstName("Timi");
        employee.setLastName("Upah");
        employee.setSalary(2000000);
        assertEquals("Timi",employee.getFirstName());
        assertEquals("Upah",employee.getLastName());
        assertEquals(2000000,employee.getSalary());

    }
    @Test
    void  yearlySalaryCanBeDisplayed(){
        employee.displayYearlySalary(10000);
        assertEquals(120000,employee.getSalary());
    }
    @Test
    void  employeesPercentRaise(){
        employee.giveTenPercentToEmployee(0.1);
        assertEquals(1100,employee.getSalary());
    }
    @Test
    void displayEmployeeYearlySalary(){
        employee.giveTenPercentToEmployee(0.1);
        employee.displayYearlySalary(1100);
        assertEquals(13200,employee.getSalary());
    }
}