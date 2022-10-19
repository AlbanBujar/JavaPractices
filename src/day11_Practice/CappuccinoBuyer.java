package day11_Practice;

public class CappuccinoBuyer {
    public static void main(String[] args) {

        String size = "tall";
        String result= "";

        if (size=="tall") {
            result = "tall: \n price is $ 3.69  \n 90 calories";

        } else if (size=="grande") {
            result = "price is $3.99;\n 120 calories ";

        } else if (size=="venti") {
            result = "price is $4.29\n150 calories" ;

        }else
            result = "Invalid Size";

        System.out.println(result);

        System.out.println("---------------------------------------------------");

       //solution 2 use if and switch statement

        if (size=="grande" || size=="venti" || size=="tall"){
            switch (size){
                case  "grande" :
                    result = "price is $ 3.99 \n120 calories";
                    break;
                case "venti" :
                    result = "price is $ 4.29 \n150 calories";
                    break;
                case "tall" :
                    result = "tall : \n price is $ 3.69 \n90 calories";
                    break;
                default:
            }
        }else{
            result = "Invalid Size";
        }
        System.out.println(result);

        System.out.println("---------------------------------------------------");

        //solution 3 Use Switch statement

        switch (size) {
            case "grande":
                result = "price is $ 3.99 \n120 calories";
                break;
            case "tall":
                result = "tall : \nprice is $ 3.69 \n90 calories";
                break;
            case "venti":
                result = "price is $ 4.29 \n150 calories";
                break;
            default:
                result = "Invalid Size";
        }
        System.out.println( result);



    }
}
/*
1. Create a class called  CappuccinoBuyer. A variable named Size is given, write a program that can
display the price and calories of cappuccino
			Valid sizes are tall, grande, venti and their price & calories are:

						tall:
								price is $3.69
								90 calories

						grande:
								price is $3.99;
								120 calories

						venti:
								price is $4.29
								150 calories

			If the size is invalid then the output should be "Invalid Size"


			Note:
			 	Solution 1: use if statement
				Solution 2: use switch statement
				Solution 2: use if & switch statements mixed

 */