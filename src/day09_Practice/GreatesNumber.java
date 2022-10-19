package day09_Practice;

public class GreatesNumber {
    public static void main(String[] args) {

        int firstNr = 4,
                secondNr = 8,
                thirdNr = 1;

        if (firstNr> secondNr && firstNr > thirdNr){
            System.out.println("The greatest number is: "+firstNr);
        } else if (secondNr>firstNr&&secondNr>thirdNr) {
            System.out.println("The greatest number is: "+secondNr);
        }else {
            System.out.println("The greatest number is: "+thirdNr);
        }


    }
}
