package day09_Practice;

public class FemaleOrMale {

    public static void main(String[] args) {

        char gender = 'M';  // M~F  M is male , F is female

        boolean female = gender == 'F';

        if (female) {
            System.out.println("Female: " + female);
        } else {
            System.out.println("Male: " + !female);
                                   // not female (! means not)
        }
    }
}
