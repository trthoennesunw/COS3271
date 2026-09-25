import java.util.Scanner;

public class PiecewiseAPP {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int num, total = 0;
        System.out.println("Pick a number of your choosing --->");
        num = scanner.nextInt();

        if (0 > num) {
            total = (3 * num) + 7;

        } else if (num >= 0 && num <= 10) {
            total = (int) (Math.pow(num, 2) + 8);

        } else if (num > 10) {
            total = (int) ((Math.pow(num, 3)) - 6 * Math.pow(num, 2));
        }
        System.out.println("The total is: " + total);
    }
}
