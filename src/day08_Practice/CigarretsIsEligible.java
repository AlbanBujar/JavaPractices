package day08_Practice;

public class CigarretsIsEligible {

    public static void main(String[] args) {
        byte age = 21;
        boolean isEligible = age >= 18;

        if(isEligible) { // true Eligible

            System.out.println("Eligible");
        }
    }
}

/*
 Given a number (byte) age, write a program that can check if the person is eligible to buy Cigarettes
 boolean isEligible = age >= 21 && citizien == "USA"; // True

        //Eligible
        if(isEligible) { // True
            System.out.println("Eligible");
        }

 */