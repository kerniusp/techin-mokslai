
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        while(true){
            System.out.println("Give a number:");
            int number = Integer.parseInt(scanner.nextLine());

            if(number == 0) {
                break;
            }else if(number < 0){
                counter += 1;
            }

        }
        System.out.println("Number of negative numbers: "+counter);
    }
}
