package day09_Practice;

public class NumberToWords {
    public static void main(String[] args) {

        int n = 1; // 0 ~ 9 word

        String name;
        if (n == 1) {
            name = "One";
        } else if (n == 2) {
            name = "Two";
        } else if (n == 3){
            name = "Three";
    } else if  ( n == 4){
            name = "Five";
        } else if (n == 6) {
            name = "Six";
        } else if (n == 7) {
            name = "Seven";
        } else if (n == 8) {
            name = "Eight";
        }else name =" Nine";

        System.out.println(name);

        }

    }


/*
Create a class called NumberToWord, and write a java program that can convert numbers between 0 ~ 9 to words
			Ex:
				number = 1;

			output:
				One
 */