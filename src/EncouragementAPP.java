import java.util.Objects;
import java.util.Scanner;

public class EncouragementAPP {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int age;
        String response;
        System.out.println("How old are you?");
        age = scanner.nextInt();
        System.out.println("How are you doing today?");
        response = scanner.next();

        if (age >= 18 && response.equalsIgnoreCase("good")) {
            System.out.println("Your an adult and I am glad your day is going good!");
            
        } else if (age <= 18 && response.equalsIgnoreCase("good") ) {
            System.out.println("Your young, you will have more good days ahead of you.");
        } else if (age <= 18 && response.equalsIgnoreCase("bad")) {
            System.out.println("Sorry to hear, your young, you will have a good day soon.");
        } else if (age >= 18 && response.equalsIgnoreCase("bad")) {
            System.out.println("Adult life is busy! Keep your head high");
        } else {
            System.out.println("Invalid input. Keep on going!");
        }
    }
}
