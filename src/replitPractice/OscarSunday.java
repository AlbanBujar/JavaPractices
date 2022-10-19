package replitPractice;

public class OscarSunday {
    public static void main(String[] args) {

        int a = 20;
        int b = 30;
        int c = 30;

        // interview question asked, tricky

        boolean comp = a < b || b >= c; // true || true : Logical Or if the first Expression is True; it does not
        // not compile second part of OR  operator

        System.out.println("comp = "+comp);
        System.out.println("b = " + b);

        System.out.println(",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,");

        boolean comp2 = a > b || b-- >= c;// false || true : true b = 29
        System.out.println("comp2 = "+comp2);
        System.out.println("b = " + b);

        System.out.println(",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,");

        int age;
        age = 10;

        String eligibleOrNot = "";

        if (age>18){
            System.out.println("You are eligible to vote");
        } else{
            System.out.println("You not are eligible to vote");
        }

        System.out.println(",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,");


        int num1,num2,num3;

        int maxNum;

        num1 = 4; num2 = 8; num3 = 1;

        if(num1>num2 && num1>num3){
            maxNum = num1;
        }else if (num2>num1 && num2 > num3){
            maxNum = num2;
        }else {
            maxNum = num3;  // if non of the conditions above is true then there is only one solution left
        }

        System.out.println("The greatest number is: " + maxNum);

        /*
        Write Java program that will accept three numbers and return the greatest number.
        Assume that your numbers are not equal....
• Input:
Enter first number: 4
Enter second number: 8
Enter third number: 1
• Output:
The greatest number is: 8
         */






    }
}
