import java.util.Scanner;

public class BinaryCalculatorAPP {
    static Scanner userinput = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print ("Enter a Binary (x)-->");
        String strX =userinput.nextLine();
        System.out.print ("Enter a Binary (y)-->");
        String strY =userinput.nextLine();

        int x = Integer.parseInt(strX, 2);
        int y = Integer.parseInt(strY, 2);

        int addition = x + y;
        int sub = x - y;
        int multiply = x * y;

        System.out.println("x + y = " + Integer.toBinaryString(addition));
        System.out.println("x - y = " + Integer.toBinaryString(sub));
        System.out.println("x * y = " + Integer.toBinaryString(multiply));

        if (y != 0) {
            int quot = x / y;
            System.out.println("x / y = " + Integer.toBinaryString(quot));
        } else {
            System.out.println("x / y = Undefined (Division by zero)");
        }


    }
}
