import java.util.Scanner;

public class AdditionTableAPP {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int num;
        System.out.println("Please enter a number from 3 to 20: ");

        num = scanner.nextInt();

        System.out.print("+ ");
        //Header
        for (int i = 1; i <= num; i++) {

            System.out.print(i + " ");
        }
        System.out.println();
        //Thinking. This prints + i i i i i

    //Table row
        for (int row = 1; row <= num; row++) { // 5 rows. Moves down one at a time
            System.out.print(row + " ");
            for (int column = 1; column <= num; column++) { // 5 columns. Moves across one column at a time
                System.out.print((row + column) + " ");
            }
            System.out.println();
        }
    }
}
