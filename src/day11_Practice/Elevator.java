package day11_Practice;

import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        int floorNum = 8;

        String result ="";

        if (floorNum > 1 && 3 <floorNum) {

            switch (floorNum) {

                case 1:
                    result = "Floor 1 selected. Companies: Lobby, Verizon, Starbucks";
                    break;

                case 2:
                    result = "Floor 2 selected. Companies: Cybertek, NASA, Intelsat";
                    break;

                case 3:
                    result = "Floor 3 selected. Companies: Lyft, BofA, Stake house";
                    break;

                default:
                    result = "Invalid floor";
                    break;
            }


            System.out.println("Invalid floor : "+ floorNum);


            System.out.println("---------------------------------------------------");


            if (floorNum == 1) {
                result = "Floor 1 selected. Companies: Lobby, Verizon, Starbucks";
            } else if (floorNum == 2) {
                result = "Floor 2 selected. Companies: Cybertek, NASA, Intelsat";

            } else if (floorNum == 3) {
                result = "Floor 3 selected. Companies: Lyft, BofA, Stake house";

            } else {
                result = "Invalid floor : " + floorNum;
            }
            System.out.println(result);
        }

        }
    }

/*
2. Create a class called Elevator. A variable named floorNumber is given, write a program that can display the floor info
			when floorNum is 1 -> print "Floor 1 selected. Companies: Lobby, Verizon, Starbucks"
			when floorNum is 2 -> print "Floor 2 selected. Companies: Cybertek, NASA, Intelsat"
			when floorNum is 3 -> print "Floor 3 selected. Companies: Lyft, BofA, Stake house"
			 anything else: print "Invalid floor - 6"

			 Note:
			 	Solution 1: use nested if statement
				Solution 2: use switch statement
				Solution 2: use if & switch statements mixed
 */