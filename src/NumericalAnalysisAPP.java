import javax.swing.plaf.synth.SynthTableHeaderUI;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class NumericalAnalysisAPP {

    public static void main(String[] args) throws FileNotFoundException {

        String decimalData = "C:\\Users\\Tyler\\Desktop\\decimaldata.txt";
        File textFile = new File(decimalData);

        Scanner in = new Scanner(textFile);

        int count = 0;
        double sum = 0.0;
        double max = 0.0;
        double min = 0.0;

        while (in.hasNext()) {
            if (in.hasNextDouble()) {
                double num = in.nextDouble();

                count++;

                sum+= num;

                if (count == 1) {
                    max = num;
                    min = num;
                } else {
                    if (num > max) {
                        max = num;
                    }
                    if (num < min) {
                        min = num;
                    }
                }
            } else {
                in.next();

            }
        }
        in.close();

        System.out.println(" ");

        if (count > 0) {
            double average = sum / count;
            double range = max - min;

            System.out.println("Quantity of numbers in the file: " + count);
            System.out.printf("The mean of the data: %.1f\n", average);
            System.out.println("The largest number in the data: " + max);
            System.out.println("The smallest number in the data: " + min);
            System.out.printf("The range of the data: %.1f\n", range);
        }

    }
}
