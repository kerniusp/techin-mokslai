
import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter beginning");
        int beginning = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter end");
        int end = Integer.parseInt(scanner.nextLine());

        divisibleByThreeInRange(beginning,end);
    }

    public static void divisibleByThreeInRange(int numberStart, int numberEmd){

        for(int i = numberStart; i <= numberEmd; i ++){
            if(i % 3 == 0){
                System.out.println(i);
            }
        }
    }

}
