package day09_Practice;

public class FieldTrip {
    public static void main(String[] args) {
            int grade = 3;

        String location;
        int numberOfGroup;
        String teacher;

        if (grade == 1) {
            location = "Apple Orchard";
            numberOfGroup = 3;
            teacher = "Ms.Smith";
            System.out.println("grade = "+grade+"\nLocation = "+location+"\nNumber of Group = "+
                    numberOfGroup+"\nTeacher in charge = "+teacher);
        }else if (grade==2) {
            location="Zoo";
            numberOfGroup=7;
            teacher="Mr.Lee";
            System.out.println("grade = " + grade+"\nLocation ="+location+"\nNumber of Group ="+numberOfGroup+"\nTeacher in charge ="+teacher);
        } else if (grade==3) {
            location="Aquarium";
            numberOfGroup=5;
            teacher="Ms.Wilson";
            System.out.println("grade = " + grade+"\nLocation ="+location+"\nNumber of Group ="+numberOfGroup+"\nTeacher in charge ="+teacher);
        } else if (grade==4) {
            location="Movie theater";
            numberOfGroup=2;
            teacher="Ms.Reyes";
            System.out.println("grade = " + grade+"\nLocation ="+location+"\nNumber of Group ="+numberOfGroup+"\nTeacher in charge ="+teacher);
        } else if (grade==5) {
            location="Museum";
            numberOfGroup=5;
            teacher="Ms.Lela";
            System.out.println("grade = " + grade+"\nLocation ="+location+"\nNumber of Group ="+numberOfGroup+"\nTeacher in charge ="+teacher);
        } else if (grade==6) {
            location = "Six Flags";
            numberOfGroup = 8;
            teacher = "Mr.Watt";
            System.out.println("grade = " + grade + "\nLocation =" + location + "\nNumber of Group =" + numberOfGroup + "\nTeacher in charge =" + teacher);
        }else {
            System.out.println(); // other than 1-6, system printout nothing
        }
    }
}

/*
        grade - 1
        location -  Apple orchard
        number of groups - 3
        teacher in charge - Ms. Smith
 */