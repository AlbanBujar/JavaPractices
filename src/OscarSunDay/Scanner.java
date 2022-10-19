package OscarSunDay;

public class Scanner {
    public static void main(String[] args) {


            int x =5;

            java.util.Scanner scan = new java.util.Scanner(System.in);
            System.out.println("Ententer an Integer number");

            int y = scan.nextInt();

            int sun = x + y;

            System.out.println("sun = "+sun);

            scan.close();

        }
    }

