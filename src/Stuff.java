import java.util.Scanner;

public class Stuff {
    static Scanner userinput = new Scanner(System.in);

    public static void main(String[] args)

    {

        int s;

        System.out.print("How old are you?");

        s = userinput.nextInt();

        s = s + 5;

        System.out.println("In 5 years you will be " + s + " years old.");

        System.out.println("It is " + ((s < 20) && (s > 12)) +" that you are a teenager");

        System.out.println("I am such a smart computer.");

    }
}
