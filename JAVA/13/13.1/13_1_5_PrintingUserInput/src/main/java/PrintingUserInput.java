import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> listOfInputedWords = new ArrayList<>();


        while (true) {
            String input = scanner.nextLine();

            if (input.isEmpty()) {
                break;
            }
            listOfInputedWords.add(input);
        }

        listOfInputedWords.forEach(System.out::println);
    }
}
