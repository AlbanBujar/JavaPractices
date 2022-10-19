package day09_Practice;

public class YesOrNo {

    public static void main(String[] args) {

        char answer='Y';  //Y~~N     Y means yes,    N means no

        boolean isAnswer=answer=='Y';

        if(isAnswer){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

        // but here is problem when you write x also say no
    }
}
