package Precious.ChapterThree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GradeScoreSystemTest {
    GradeScoreSystem gradeSystem;
    @BeforeEach
    void setUp() {
        gradeSystem = new GradeScoreSystem();
    }
    @Test
    void youCanCollectInputTest(){
        String input = gradeSystem.collectGradeScore("Enter a grade score: ");
        assertEquals("Enter a grade score: ",input);
    }
    @Test
    void collectAndCheckForGradeScores(){
       String score = gradeSystem.academicGradeScoreSystem(41.7F);
        assertEquals("Failed!!! you score E",score);
    }

}