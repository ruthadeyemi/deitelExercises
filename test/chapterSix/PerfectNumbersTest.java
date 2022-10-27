package chapterSix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class PerfectNumbersTest {

    @Test
    public void checkForParameter(){
        boolean number = PerfectNumbers.isPerfect(28);
        assertTrue(number);
    }
}