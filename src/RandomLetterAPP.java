import java.util.Scanner;

public class RandomLetterAPP {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        StringBuilder word = new StringBuilder();

        for (int i = 0; i < 10; i++) {
            word.append((char) ('a' + (int) (Math.random() * 26)));
        }

        System.out.println("Word #1:  " + word + "\n");


        for (int i = 0; i < 20; i++) {
            int position = (int) (Math.random() * 10);
            char newLetter = (char) ('a' + (int) (Math.random() * 26));
            word = new StringBuilder(word.substring(0, position) + newLetter + word.substring(position + 1));
            System.out.println("Word #" + i + ":  " + word + "\n");
        }

    }
}
