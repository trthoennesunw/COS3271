import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FacialRecognitionAPP {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner userInput = new Scanner(System.in);

        double[][] measure;
        //36
        //6 people, 6 measurements for each
        measure = new double[6][6];
        String[] names = new String[6];

        double[][] ratio;
        //90
        //6 people, 15 ratios
        ratio = new double[6][15];


        //Getting the data from the file
        String fileName = "C:\\Users\\Tyler\\Desktop\\facialrecog.txt";
        File textFile = new File(fileName);
        Scanner fileScanner = new Scanner(textFile);



        for (int person = 0; person <5; person++) {
            if (fileScanner.hasNext()) {
                names[person] = fileScanner.next();
               for (int m = 0; m < 6; m++) {
                   measure[person][m] = fileScanner.nextDouble();
               }

            }

        }
        fileScanner.close();
        names[5] = "Mystery Person";

        //Inputting the measurements from the file
        System.out.println("Enter Measurements for the Mystery Person");
        System.out.println("0 = A, 1 = B, 2 = C, 3 = D, 4 = E, 5 = F");
        for (int m = 0; m < 6; m++) {
            System.out.print("Enter measurement #" + m + ": ");
            measure[5][m] = userInput.nextDouble();
        }
        userInput.close();

        for (int person = 0; person <=5; person++) {

            ratio[person][0] = measure[person][0]/measure[person][1]; // A / B
            System.out.println(ratio[person][0]);
            ratio[person][1] = measure[person][0]/measure[person][2]; //2
            ratio[person][2] = measure[person][0]/measure[person][3]; //3
            ratio[person][3] = measure[person][0]/measure[person][4]; //4
            ratio[person][4] = measure[person][0]/measure[person][5]; //5

            ratio[person][5] = measure[person][1]/measure[person][2]; //6
            ratio[person][6] = measure[person][1]/measure[person][3]; //7
            ratio[person][7] = measure[person][1]/measure[person][4]; //8
            ratio[person][8] = measure[person][1]/measure[person][5]; //9

            ratio[person][9] = measure[person][2]/measure[person][3]; //10
            ratio[person][10] = measure[person][2]/measure[person][4]; //11
            ratio[person][11] = measure[person][2]/measure[person][5]; //12

            ratio[person][12] = measure[person][3]/measure[person][4]; //13
            ratio[person][13] = measure[person][3]/measure[person][5]; //14

            ratio[person][14] = measure[person][4]/measure[person][5];//15
        }

        double bestScore = Double.MAX_VALUE;
        int bestMatchIndex = -1;

        System.out.println("Results:");
        for (int person = 0; person < 5; person++) {
            double sum = 0.0;

            for (int r = 0; r < 15; r++) {
                double originalRatio = ratio[person][r];
                double mysteryRatio = ratio[5][r];

                if (originalRatio != 0) {
                    double percent = (mysteryRatio - originalRatio) / originalRatio;
                    sum += Math.pow(percent, 2);

                }

            }
            System.out.printf("Sum of squares difference for %s: %.4f\n", names[person], sum);

            if (sum < bestScore) {
                bestScore = sum;
                bestMatchIndex = person;
            }
        }
        System.out.println("The mystery picture is most like: " + names[bestMatchIndex]);
    }
}
