import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TextualAnalysisAPP {


    public static void main(String[] args) throws FileNotFoundException {

        String fileName = "C:\\Users\\Tyler\\Desktop\\textfile.txt";
        File textFile = new File(fileName);

        Scanner in = new Scanner(textFile);

        String s;
        int j;
        int words = 0;
        int letters = 0;
        int sentences = 0;
        double averageLettersPerWord = 0.0;
        double averageWordsInSentence = 0.0;

        System.out.println("\n");
        while (in.hasNextLine()) {

            s = in.nextLine();
            s = s.trim();
            if (s.isEmpty()) {
                continue;
            }

            words++;
            System.out.println(s);

            for (j = 0; j < s.length();j++) {

                char c = s.charAt(j);
                if (Character.isLetter(c)) {
                    letters++;
                }
                if (c == '.' || c == '!' || c == '?') {
                    sentences++;

                }
                if (j > 0 && c == ' ' && (s.charAt(j - 1) != ' ')) {
                    words++;
                }
            }

        }
        //Calculate Averages
        if (words > 0) {
            averageLettersPerWord = (double) letters / words;

        }
        if (sentences > 0) {
            averageWordsInSentence = (double) words / sentences;
        }


        System.out.println("\n");
        System.out.println("There are " + letters + " letters in this document.");
        System.out.println("There are " + words + " words in this document.");
        System.out.println("There are " + sentences + " sentences in this document.");
        System.out.printf("There are %.1f letters per word.\n",  averageLettersPerWord);
        System.out.printf("There are %.1f words per sentence.\n",  averageWordsInSentence);

        in.close();

    }

}
