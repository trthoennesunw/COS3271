import java.util.Scanner;

public class FibonacciSequenceAPP {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int numbers;


        System.out.println("What number do you want to choose from 1 to 32: ");
        numbers = scanner.nextInt();

        int[] fibonacci = new int[numbers];

        for (int i = 0; i < numbers; i++) {
            if (i == 0 || i == 1) {
                fibonacci[i] = 1;
            } else {

                fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
            }

        }
        for (int i = 0; i < numbers; i++) {
            System.out.print(fibonacci[i]);


            if (i < numbers - 1) {
                System.out.print(",");
            }
        }

    }
}
