import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Implement your program here
        List<Integer> listOfNumbers = new ArrayList<>();

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("end")) {
                break;
            }
            int number = Integer.parseInt(input);
            listOfNumbers.add(number);
        }

        System.out.println("Print the average of the negative numbers or positive numbers? (n/p)");
        char NegativeOrPositive = scanner.next().charAt(0);

        if (NegativeOrPositive == 'n') {
            List<Integer> negativeNumbers = listOfNumbers.stream()
                    .filter(numbers -> numbers < 0)
                    .collect(Collectors.toList());
            System.out.println("Average of the negative numbers: " + (double) negativeNumbers.stream().mapToInt(number -> number).sum() / negativeNumbers.size());

        } else if (NegativeOrPositive == 'p') {
            List<Integer> positiveNumbers = listOfNumbers.stream()
                    .filter(numbers -> numbers > 0)
                    .collect(Collectors.toList());
            System.out.println("Average of the positive numbers: " + (double) positiveNumbers.stream().mapToInt(number -> number).sum() / positiveNumbers.size());
        }

    }
}
