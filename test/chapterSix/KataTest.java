package chapterSix;

import classwork.Kata;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KataTest {
    @Test
    public void aGradeCanBeCalculatedTest(){
        Kata grade = new Kata();
       char result = grade.calculateGradeFor( 98);
       assertEquals('A', result);
    }
    @Test
    public void bGradeCanBeCalculatedTest(){
     Kata grade = new Kata();
     char result = grade.calculateGradeFor(89);
     assertEquals('B', result);
    }
    @Test
    public void cGradeCanBeCalculatedTest(){
        Kata grade = new Kata();
        char result = grade.calculateGradeFor(79);
        assertEquals('C', result);
    }
    @Test
    public void dGradeCanBeCalculatedTest() {
        Kata grade = new Kata();
        char result = grade.calculateGradeFor(65);
        assertEquals('D', result);
    }
    @Test
    public void fGradeCanBeCalculatedTest() {
        Kata grade = new Kata();
        char result = grade.calculateGradeFor(59);
        assertEquals('F', result);
    }
//    @Test
//    public void arraysTotalCanBeCalculatedTestOf(){
//        int[] numbers = {1,2,3,4,5};
//        int result = Kata.calculateTotalOf(numbers);
//        assertEquals(15,result);
//    }
//    @Test
//    public void arraysMinimumCanBeCalculatedTestOf() {
//        int[] numbers = {1, 2, 3, 4, 5};
//        int result = Kata.calculateMinimumOf(numbers);
//        assertEquals(1, result);
//    }
//    @Test
//    public void arraysMaximumCanBeCalculatedTestOf() {
//        int[] numbers = {1, 2, 3, 4, 5};
//        int result = Kata.calculateMaximumOf(numbers);
//        assertEquals(5, result);
//    }
//    @Test
//    public void arraysAverageCanBeCalculatedTestOf() {
//        int[] numbers = {1, 2, 3, 4, 5};
//        int result = Kata.calculateAverageOf(numbers);
//        assertEquals(3.0, result);
//    }
}
