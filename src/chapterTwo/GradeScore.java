package chapterTwo;/*student grades
if student score 90 and above, the grade is A
if student score is 80 t0 89, then grade is B
if student score is 70 t0 79, then grade is C
if student score is 60 to 69, then grade is D
if student score from 20 to 59 then grade is F*/



import java.util.Scanner;

public class  GradeScore{
	public static void main(String[] args){

Scanner input = new Scanner(System.in);

int score;   

System.out.print("Enter score");
score =input.nextInt();


if (score > 90)
{
System.out.println(" A - excellent!");
}

if (score >= 80){
if (score <90){
System.out.println(" B - very good!");
}
}
if (score >=70){
if (score <80){
System.out.println("C-good!");
}}

if (score >=60){
if (score < 70){
System.out.println("D - passed");
}
}
if (score <60){
System.out.println("F-failed!");
}















}


















}