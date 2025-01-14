
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        // implement here a program that reads user input
        // until the user enters 9999
        while (true) {
            int number = Integer.parseInt(scanner.nextLine());

            if (number == 9999) {
                break;
            }
            list.add(number);
        }
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
        int smallestNumber = list.get(0);
        

        for (int i = 1; i < list.size(); i++) {
            if (smallestNumber > list.get(i)) {
                smallestNumber = list.get(i);

            }
        }
        System.out.println("Smallest number: " + smallestNumber);

        for (int i = 1; i < list.size(); i++) {
            if (smallestNumber == list.get(i)) {
                System.out.println("Found at index: " + i);
            }
        }


    }
}
