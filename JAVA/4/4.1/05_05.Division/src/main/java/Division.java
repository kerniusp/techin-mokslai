import java.util.Scanner;

public class Division {

    public static void main(String[] args) {
        
        // Once you have implemented the division method, you can
        // try it out here. Fopr example division(3,5);
        // should print "0.6"
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a numerator");
        int numerator = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter a denominator");
        int denominator = Integer.parseInt(scanner.nextLine());
        // division(3, 5);
        division(numerator,denominator);

    }

    // implement the method here
    public static void division(int numb1, int numb2){

        System.out.println((double)numb1 / numb2);

    }
}
