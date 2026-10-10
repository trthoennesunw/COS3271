import java.util.Scanner;

public class OppishAPP {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Type a sentence:");
        String s = scanner.nextLine();

        String vowels = "aieouyAEIOUY";

        System.out.println("Oppish: ");

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            System.out.print(c);

            //Is letter filters out underscores and checks if it is not a vowel.

            if (Character.isLetter(c) && vowels.indexOf(c) < 0) {

                if (i + 1 < s.length() && vowels.indexOf(s.charAt(i + 1)) >= 0) {
                    System.out.print("opp");
                }
            }
        }
        System.out.println();
    }
}
