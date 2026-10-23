import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListAPP {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        List<Object> list = new ArrayList<>();

        boolean editing = true;
        boolean building = true;

        //Building
        System.out.println("Hello! Add your first item to your list and type 'Done' when you are done:");

        while (building) {
            System.out.println("Add your next item:");
            String item = scanner.nextLine();

            if (item.equalsIgnoreCase("done")) {
                building = false;

                for (int i = 0; i < list.size(); i++) {
                    System.out.println((i + 1) + ". " + list.get(i));
                }

            } else {
                list.add(item);
            }
        }

        //Editing

        while (editing) {

            if (list.isEmpty()) {
                System.out.println("Your list is empty.");
            }

            System.out.println("Do you want to edit your list? | add | remove | quit");
            String decision = scanner.nextLine();

            if (decision.equalsIgnoreCase("add")) {
                System.out.println("Enter the item you want to add: ");
                list.add(scanner.nextLine());

            } else if (decision.equalsIgnoreCase("remove")) {
                System.out.println("Enter the item you want to remove: ");
                int index = Integer.parseInt(scanner.nextLine()) - 1;
                list.remove(index);

            } else if (decision.equalsIgnoreCase("edit")) {
                System.out.println("Enter the number to edit: ");
                int index = Integer.parseInt(scanner.nextLine()) - 1;

                System.out.println("Enter the new value:");
                list.set(index, scanner.nextLine());
            } else if (decision.equalsIgnoreCase("quit")) {
                System.out.println("Have a great day.");
                editing = false;

            } else {
                System.out.println("Invalid syntax.");
            }

            for (int i = 0; i < list.size(); i ++) {
                System.out.println((i + 1) + "." + list.get(i));
            }

        }

    }
    }
