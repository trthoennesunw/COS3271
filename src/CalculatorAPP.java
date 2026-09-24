import java.util.Scanner;

public class CalculatorAPP {
    static Scanner userinput = new Scanner(System.in);
    public static void main(String[] args) {
        double x, y;

        System.out.println("Enter the first decimal: ---> (This will not be the base)");
        x = userinput.nextDouble();
        System.out.println("Enter the last decimal: ---> (This will be the base)");
        y = userinput.nextDouble();

        System.out.format(x + "+" + y + " = " + "%.3f\n", x + y);
        System.out.format(x + "*" + y + " = " + "%.3f\n", x * y);
        System.out.format(x + "/" + y + " = " + "%.3f\n", x / y);
        System.out.format(x + "^" + y + " = " + "%.3f\n", Math.pow(x,y));
        System.out.format("Log " + y +"(" + x + ")" + " = " + "%.3f\n", Math.log(x)/Math.log(y));
    }
}
