import java.util.Scanner;

public class FullNameAPP {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        String firstName, middleName, lastName;

        System.out.println("What is your first name?");
        firstName = scanner.next();
        System.out.println("What is your middle name?");
        middleName = scanner.next();
        System.out.println("What is your last name?");
        lastName = scanner.next();

        String fullName = firstName + " " + middleName + " " + lastName;

        System.out.println(fullName);

    }
}
