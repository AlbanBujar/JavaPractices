package day05_Practice;

public class PhoneNumber {

    public static void main(String[] args) {
        String countryCode = "1";
        String areaCode =  "703";
        String localNumber = "4512625";

        String cellNumber = "+" +countryCode + " " + "("+areaCode+ ")"+
                " "+ "-"+ localNumber;

        System.out.println(cellNumber);

    }
}
