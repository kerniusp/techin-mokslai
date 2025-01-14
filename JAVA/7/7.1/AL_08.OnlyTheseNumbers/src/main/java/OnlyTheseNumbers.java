
import java.util.ArrayList;
import java.util.Scanner;

public class OnlyTheseNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                System.out.println("From where? ");
                int startNumber = Integer.parseInt(scanner.nextLine());

                System.out.println("To where? ");
                int endNumber = Integer.parseInt(scanner.nextLine());


                for (int i = 0; i < numbers.size(); i++) {
                    if (i >= startNumber && i <= endNumber) {
                        System.out.println(numbers.get(i));

                    }
                }
                break;
            }

            numbers.add(number);
        }

    }
}
