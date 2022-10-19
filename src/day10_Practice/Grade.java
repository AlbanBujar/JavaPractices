package day10_Practice;

public class Grade {
    public static void main(String[] args) {
        int s = 113;

        if ( s>=0&& s<=100){
            if (s>=90){
                System.out.println("Excellent");
            } else if (s>=80) {
                System.out.println("Great");
            } else if (s>=70) {
                System.out.println("Good");
            } else if (s>=60) {
                System.out.println("Passed");
            }else{
                System.out.println("Failed");
            }

        }else {
            System.out.println("Invalid Score");
        }
    }
}
/*
 Create a class called Grade, a char variable named grade is given. write a program to print the following messages:
            'A': excellent
            'B': great job
            'C': good
            'D': passed
            'F': failed
            other wise: invalid

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
 */