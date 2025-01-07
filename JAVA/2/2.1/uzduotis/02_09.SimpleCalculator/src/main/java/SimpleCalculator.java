
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int firstNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("Give the second number:");
        int secondNumber = Integer.parseInt(scanner.nextLine());

        int sum = firstNumber + secondNumber;
        int subt = firstNumber - secondNumber;
        int daug = firstNumber * secondNumber;
        double div = (double)firstNumber / secondNumber;

        System.out.println(firstNumber + " + " + secondNumber + " = " + sum);
        System.out.println(firstNumber + " - " + secondNumber + " = " + subt);
        System.out.println(firstNumber + " * " + secondNumber + " = " + daug);
        System.out.println(firstNumber + " / " + secondNumber + " = " + div);
    }
}
