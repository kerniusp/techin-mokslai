import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write your program here
        List<Integer> listOfInts = new ArrayList<>();

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("end")) {
                break;
            }
            int number = Integer.parseInt(input);
            listOfInts.add(number);
        }

        double total = listOfInts.stream()
                .mapToDouble((number) -> number)
                .sum();

        System.out.println("average of the numbers : " + total / listOfInts.size());


    }

}