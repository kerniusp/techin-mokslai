
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a string:");
        String stringas = scan.nextLine();

        System.out.println("Give an integer:");
        int skaiciusA = Integer.parseInt(scan.nextLine());

        System.out.println("Give a double:");
        double skaicius = Double.parseDouble(scan.nextLine());

        System.out.println("Give a boolean:");
        boolean bool = Boolean.parseBoolean(scan.nextLine());

        System.out.println("You gave the string "+stringas);
        System.out.println("You gave the integer "+skaiciusA);
        System.out.println("You gave the double "+skaicius);
        System.out.println("You gave the boolean "+bool);
    }
}
