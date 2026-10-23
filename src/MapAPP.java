import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapAPP {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        HashMap<String, String> accounts = new HashMap<>();

        accounts.put("alexander21", "wehheeee");
        accounts.put("angryman", "hello2223");
        accounts.put("joyfuldog", "dasdsf");
        accounts.put("icecreams2", "lookat!");
        accounts.put("childish234", "GodIsAmazing");

        HashMap<String, String> messages = new HashMap<>();

        messages.put("alexander21", "How are you doing today?");
        messages.put("angryman", "Why am I so angry?");
        messages.put("joyfuldog", "When do you want to go to the dog park?");
        messages.put("icecreams2", "When is it time for icecream?");
        messages.put("childish234", "What time is church?");

        String username;
        String password;

        System.out.println("What is your username?");
        username = scanner.nextLine();
        System.out.println("What is your password?");
        password = scanner.nextLine();

        String attempt = accounts.get(username);

        if (attempt.equalsIgnoreCase(password)) {
            System.out.println(messages.get(username));
        }



    }
}
