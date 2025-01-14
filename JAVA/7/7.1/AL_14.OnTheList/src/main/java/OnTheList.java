
import java.util.ArrayList;
import java.util.Scanner;

public class OnTheList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            list.add(input);
        }
        System.out.println("Search for?");
        String searchingFor = scanner.nextLine();

        boolean found = false;
        for (int i = 0; i < list.size(); i++) {
            if (searchingFor.equals(list.get(i))) {
                System.out.println(searchingFor + " Mary was found!");
                found = true;
            }
        }
        if (found == false) {
            System.out.println(searchingFor + " was not found!");
        }

    }
}
