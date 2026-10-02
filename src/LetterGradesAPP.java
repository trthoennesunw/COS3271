import java.util.Scanner;

public class LetterGradesAPP {

    static Scanner userinput = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter a test score:");

        int testscore = userinput.nextInt();

        //note that in ASCII ... A is 65, B is 66, C is 67, etc.
        //this converts from grade to ASCII value ... the higher the grade the lower the ASCII value
        int ascii = 74 - (testscore / 10);
        int lastDigit = testscore % 10;

        String percent;
        if (lastDigit <= 2 && lastDigit >= 0) {
            percent = "-";
        } else if (lastDigit >= 7) {
            percent = "+";
        } else {
            percent = "";
        }

        if (testscore > 93) {
            ascii = 65;
            percent = "";

        }

        if (ascii > 68) {ascii = 70;}
        System.out.println("Grade = " + (char)ascii + percent);
    }
}

