import java.util.Scanner;

public class DoubleFactorialAPP {

    public static void main(String[] args) {

        int choice;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Invalid input. Enter a number from 0-20: ");

         while(!scanner.hasNextInt()) {
            System.out.print("Invalid input. Enter a number from 0-20: ");
            scanner.next();
        }
        choice = scanner.nextInt();

         while (choice < 0 || choice > 20) {
             System.out.println("Invalid input. Enter a number from 0-20:");
             choice = scanner.nextInt();
         }

        System.out.println(computeDoubleFactorial(choice));

        scanner.close();
    }

    public static int computeDoubleFactorial(int number) {

        if (number == 1 || number == 0) {
            return 1;
        }

        return number * computeDoubleFactorial(number - 2);
    }
}
