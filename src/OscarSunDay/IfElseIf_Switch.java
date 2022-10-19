package OscarSunDay;

import java.util.Scanner;

public class IfElseIf_Switch {//AdaireApartmans
    public static void main(String[] args) {
        int floornumber;  // Declaaring my variable no value

        Scanner input = new Scanner(System.in);
        // ask the user for which floor the user is living
        System.out.println("which floor are you living");

        floornumber = input.nextInt();

        // with if else statements

        if (floornumber == 1) { //condition
            System.out.println("You are living at first floor");
        } else if (floornumber == 2){
            System.out.println("You are living at second floor");
    }else if (floornumber==3){
            System.out.println("You are living at third floor");
        }else {
            System.err.println("There is NO such floor");

        }

        System.out.println("Which switch statements");
        // Switch statement

        switch (floornumber){

            case 1:
                System.out.println("You are living at first floor");
                break;

            case 2:
                System.out.println("You are living at second floor");
                break;

            case 3:
                System.out.println("You are living at third floor");
                break;
            default:
                System.err.println("There is NO such floor");

        }



        input.close();
    }
}
