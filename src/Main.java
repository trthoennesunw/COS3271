import java.util.Random;
import java.util.Scanner;

public class Main {

    static Scanner userinput = new Scanner(System.in);
    public static void main(String[] args) {

        // PROJECT #1 - Week 2
        String firstName, middleName, lastName;

        System.out.println("What is your first name?");
        firstName = userinput.next();
        System.out.println("What is your middle name?");
        middleName = userinput.next();
        System.out.println("What is your last name?");
        lastName = userinput.next();

        String wholeName = firstName + " " + middleName + " " + lastName;

        char j = '⛏';

        char g = '\uD83D';

        System.out.println(g + "Hello, " + wholeName + ". You're doing better than you think you are. " + j);

        // PROJECT #2 - Week 2
        System.out.println("What is your first name?");
        firstName = userinput.next();
        System.out.println("What is your last name?");
        lastName = userinput.next();
        System.out.println("How old are you?");
        int age = userinput.nextInt();

        System.out.println("What is your average amount of sleep in hours?");
        double averageSleep = userinput.nextDouble();

        System.out.println();
        System.out.println("======================");
        System.out.println("\tProfile");
        System.out.println("======================");
        System.out.format("First Name : \n", firstName);
        System.out.format("Last Name : \n", lastName);
        System.out.format("Age\t: %d years\n", age);
        System.out.format("Average Sleep : %.1f hours\n", averageSleep);
        System.out.println("======================");
        // PROJECT #3 - Week 2
        String s;
        Random random = new Random();
        int randomNumber = random.nextInt(256);
        // decimal

        System.out.println("The random number in decimal is: " + randomNumber);
        //binary
        s = Integer.toBinaryString(randomNumber);
        System.out.println("The random number in binary is: " + s);
        //hexadecimal
        s = Integer.toHexString(randomNumber);
        System.out.println("The random number in hexadecimal is: " + s);
        //ASCII character
        char asciiChar = (char) randomNumber;
        System.out.println("The random number in ASCII is: " + asciiChar);

    }
}