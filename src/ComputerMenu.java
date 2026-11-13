import java.util.Scanner;

public class ComputerMenu {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {;
            System.out.println("Please make a selection below:");
            System.out.println("1. Display App");
            System.out.println("2. Text Art APP");
            System.out.println("3. Calculator APP");
            System.out.println("4. Binary Calculator APP");
            System.out.println("5. Encouragement APP");
            System.out.println("6. Dice APP");
            System.out.println("7. Oppish APP");
            System.out.println("8. Fibonacci APP");
            System.out.println("9. Double Factorial APP");
            System.out.println("0. Exit.");
            System.out.print("Enter your choice: ");

            while (!scanner.hasNextInt()) {
                System.out.print("Invalid input. Enter a number from 0-9: ");
                scanner.next();
            }

         choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    displayApp();
                    break;
                case 2:
                    textArtAPP();
                    break;
                case 3:
                    calculatorAPP();
                    break;
                case 4:
                    binaryCalculatorAPP();
                    break;
                case 5:
                    encouragementAPP();
                    break;
                case 6:
                    diceAPP();
                    break;
                case 7:
                    oppishAPP();
                    break;
                case 8:
                    fibonacciAPP();
                    break;
                case 9:
                    doubleFactorialAPP();
                    break;
                case 0:
                    System.out.println("Exited.");
                    break;
                default:
                    System.out.println("Please choose a number between 0 and 9.");

            }
        } while (choice != 0);

        scanner.close();
    }

    public static void displayApp() {

    }

    public static void textArtAPP() {

    }

    public static void calculatorAPP() {

    }
    public static void binaryCalculatorAPP() {

    }
    public static void encouragementAPP() {

    }
    public static void diceAPP() {

    }
    public static void oppishAPP() {

    }
    public static void fibonacciAPP() {

    }
    public static void doubleFactorialAPP() {

    }

}
