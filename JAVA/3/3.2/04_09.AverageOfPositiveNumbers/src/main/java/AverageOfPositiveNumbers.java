
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int positiveCounter = 0;
        int number = 0;
        int sum = 0;

        while(true){
            number = Integer.parseInt(scanner.nextLine());

            if(number == 0){
                break;
            }else if(number > 0){
                positiveCounter++;
                sum +=number;
            }
        }

        if(positiveCounter > 0){
            System.out.println((double)sum / positiveCounter);
        }else{
            System.out.println("Cannot calculate the average");
        }
    }
}
