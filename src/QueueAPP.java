import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class QueueAPP {


    public static void main(String[] args) {

        Queue<String> lineOne = new LinkedList<>();
        Queue<String> lineTwo = new LinkedList<>();

        int personCount = 1;

        Random random = new Random();

        //Initial add
        lineOne.add("AAA");

        //Run for ten seconds
       int totalTimeSteps = 12;

       for (int time = 1; time < totalTimeSteps; time++) {
           System.out.println("Time: " + time);

           //70% of a new person

           if (random.nextDouble() < .7) {

               // Generate Names
               char currentLet = (char) ('A' + (personCount  % 26));
               String person = "" + currentLet + currentLet + currentLet;

               personCount++;

               if (lineOne.size() < lineTwo.size()) {
                   lineOne.add(person);
                   System.out.println("New arrival: " + person + " has joined the first line.");

               } else {
                   lineTwo.add(person);
                   System.out.println("New arrival: " + person + " has joined the second line.");
               }

           } else {
               // No arrival
               System.out.println("No person added.");
           }
       }
       System.out.println("Line one has a total of: " + lineOne.size());

       System.out.println("Line two has a total of: " + lineTwo.size());
    }
}
