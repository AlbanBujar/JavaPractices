package day09_Practice;

public class EmployerOrNot {
    public static void main(String[] args) {

        String name = "Alex";
        //1 = Employed
        //2= Not Employed

        char isEmployed = '2';    //1~2

        boolean x = isEmployed == 1;

        if (x) {
            System.out.println(name + " is employed");
        } else {
            System.out.println(name + " is not employed");
        }
    }
}
