package day08_Practice;

public class MaximumNumbers {
    public static void main(String[] args) {

        int n1 = 100;
        int n2 = 200;

        boolean n1IsMax = n1 > n2;
        boolean n2IsMax = n2 > n1;
        boolean equal = n1 == n2;


        if (n1IsMax) {
            System.out.println(n1IsMax + " is the maximum number");
        }
        if (n2IsMax) {
            System.out.println(n2 + " is the maximum number");
        }

        if (equal) {
            System.out.println("Equal");

        }
    }
}


/*
Write a program that can print the maximum number between two numbers, if both are equal then print Equal
 Ex:
				n1= 100, n2 = 200;

			output:
				200 is maximum number*/

