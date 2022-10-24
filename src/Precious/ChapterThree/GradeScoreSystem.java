package Precious.ChapterThree;

public class GradeScoreSystem {

    public String collectGradeScore(String grade) {
        return grade;
    }

    public String academicGradeScoreSystem(float score) {
        if (score >= 96 && score <= 100) {
            return "Excellent! you score  grade A+";
        } else if (score >=90 && score <= 95) {
            return "Awesome! you score grade A";
        } else if (score >=86 && score <= 89) {
         return  "Great! you score grade B+";
        } else if (score >=80 && score <= 85) {
            return "Very good! you score B";
        } else if (score >=76 && score <= 79) {
            return "You are doing well! you score C+";
        } else if (score >=70 && score <= 75) {
            return "Good! you score C";
        } else if (score >=60 && score <= 69) {
            return "Passed! you score D";
        } else if (score >=40 && score <= 59) {
            return "Failed!!! you score E";
        } else
            return "Wrong input";

    }
}
