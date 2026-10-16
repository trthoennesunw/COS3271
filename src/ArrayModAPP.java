import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayModAPP {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int number = 0;

            System.out.println("How many numbers would you want to add?");

            number = scanner.nextInt();

            int [] numbers = new int[number];

            System.out.println("Please enter your " + number + " integers:");
            for (int i = 0; i < number; i++) {
                System.out.print("Number " + (i + 1) + ":");
                numbers[i] = scanner.nextInt();
            }
            boolean editing = true;

            while (editing) {

                System.out.println("Current values:");
                for (int i = 0; i < number; i++) {
                    System.out.print(numbers[i] + " ");

                }

                System.out.println("Would you like to edit a number? (yes, no)");
                String choice = scanner.next();

                if (choice.equalsIgnoreCase("yes")) {
                    System.out.println("You want to edit. Please enter the index of the number to change (0 to " + (number-1) + ")");
                    int index = scanner.nextInt();

                    if (index >= 0 && index < number) {
                        System.out.print("Enter the new value:");
                        int newValue = scanner.nextInt();

                        numbers[index] = newValue;
                        System.out.println("Updated Completed!");
                    }
                } else if (choice.equalsIgnoreCase("no")) {
                    editing = false;

                }

            }

        Arrays.sort(numbers);
            for (int i = 0; i < number; i++) {
                System.out.print(numbers[i]);
                if (i < number - 1) {
                    System.out.print(",");
                }
            }

            scanner.close();

    }
}
