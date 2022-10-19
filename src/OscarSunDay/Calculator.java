package OscarSunDay;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        double num1, num2, result;
        char operator;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two double type number :");

        num1 = scanner.nextDouble(); // CTRL+D copy paste that line
        num2 = scanner.nextDouble();

        /*
        To auto format your code in Intellij we use
        Windows: CTRL +ALT +L
        Mac: CMND+oPTINAL + L
         */

        System.out.println("Enter arithmetic operation you want (+,-,/,%,*) : ");
        operator = scanner.next().charAt(0);

        System.out.println("Is first number biger than second number");
        boolean answer = scanner.nextBoolean();

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                if (answer) {
                    result = num1 - num2;
                    break;
                } else {

                    result = num2 - num1;

                }
                break;

            case '/':
                if (answer && num2 != 0) {
                    result = num1 / num2;
                    break;
                } else {
                    if (num1 != 0) {
                        result = num2 / num1;
                    } else {
                        System.err.println("Unwanted Number");
                    }
                }
                break;


        }
    }
}
