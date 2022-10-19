package day08_Practice;

public class GradeLevelSchool {

    public static void main(String[] args) {
            int grade = 7;

         byte ElementarySschool = 1-5;
         byte MiddleSschool = 6-8;
         byte HighSschool = 9-12;
         byte College = 13-16;
         byte GradSchool = 17-18;

        boolean a = grade >= 17 && grade <= 18;
        boolean b = grade >= 13 && grade <= 16;
        boolean c = grade >= 9 && grade <= 12;
        boolean d = grade >= 6 && grade <= 8;
        boolean e = grade >= 1 && grade <= 5;

        if (a) {
            System.out.println("GradSchool");
        }
        if (b) {
            System.out.println("College");
        }
        if (c) {
            System.out.println("HighSschool");
        }
        if (d)
        {
            System.out.println("MiddleSschool");
        }
        if (e) {
            System.out.println("ElementarySschool");
        }





    }
}

/*
int score = 85;

        boolean a = score >= 90 && score <= 100;
         //               false      true
        boolean b = score >= 80 && score <= 89;
        boolean c = score >= 70 && score <= 79;
        boolean d = score >= 60 && score <= 69;
        boolean f = score >= 50 && score <= 59;

        if (a) {
            System.out.println("Excellent");
        }
        if (b) {
            System.out.println("Great");
        }
Given a number(byte) grade level determine and print which school type someone is in.
            grade level and types are:
                    1-5: Elementary school
                    6-8: Middle school
                    9-12: High school
                    13-16: College
                    17-18: Grad School

        	Assume that the given number is 1 ~ 18
 */