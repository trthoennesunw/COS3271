import javax.swing.plaf.synth.SynthTableHeaderUI;
import java.util.Scanner;

public class PascalAPP {


    public static void main(String[] args) {
        int[][] pascal = new int[11][11];

        for (int i = 0; i < 11; i++) { //0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11
            for (int j = 0; j <= i; j++) {

                if (j == 0 || j == 1) {
                    pascal[i][j] = 1;

                } else {
                    pascal[i][j] = pascal[i-1][j] + pascal[i-1][j-1];

                    //2 2 = 1[2] + [1][1]
                }
            }
        }

        System.out.println("Here is the triangle:");
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(pascal[i][j] + "\t");

            }
            System.out.println();
        }
    }
}
