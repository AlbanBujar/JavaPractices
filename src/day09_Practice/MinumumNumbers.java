package day09_Practice;

public class MinumumNumbers {
    public static void main(String[] args) {


    int n1 = 37;
    int n2 = 158;

    boolean minumumNumber = n1 <= n2 && n2 >= n1;

        if(minumumNumber){
        System.out.println(n1+" is minumum number");
    } else {
        System.out.println(n2+" is minumum number");
    }
}
}