
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int suma = 0;
        int number = 0;

        while(true){
            System.out.println("Give a number:");
            number = Integer.parseInt(scanner.nextLine());

            if(number == 0) {
                break;
            }
            suma += number;


        }
        System.out.println("Sum of the numbers: "+suma);
    }
}
