import java.util.Scanner;

public class DiceAPP {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        int diceOne, diceTwo, sum;
        String end;

        end = "";
        while (!end.equalsIgnoreCase("stop")) {

        System.out.println("Rolling the first dice...");
        diceOne = (int) (6* Math.random()) + 1;
        System.out.println(diceOne);
        System.out.println(" ");
        System.out.println("Rolling the second dice...");
        diceTwo = (int) (6 * Math.random()) + 1;
        System.out.println(diceTwo);
        sum = diceOne + diceTwo;
        System.out.println("You rolled a " + diceOne + " and a " + diceTwo + ". The sum adds up to: " + sum +"\n");

        System.out.println("Do you want to continue playing? Type Stop if you want to end the game.");
        end = scanner.next();

        }
        //While loop ends
        System.out.println("You have ended the game.");
    }
}
