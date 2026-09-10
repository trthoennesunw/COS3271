import java.util.Scanner;

public class Main {

    static Scanner userinput = new Scanner(System.in);
    public static void main(String[] args) {

        String firstName, middleName, lastName;


        System.out.println("What is your first name?");
        firstName = userinput.next();

        System.out.println("What is your middle name?");
        middleName = userinput.next();

        System.out.println("What is your last name?");
        lastName = userinput.next();

        String wholeName = firstName + " " +  middleName + " " + lastName;

        char j = '⛏';

        char g = '\uD83D';
        System.out.println( g + "Hello, " + wholeName + ". You're doing better than you think you are. " + j);




    }
}