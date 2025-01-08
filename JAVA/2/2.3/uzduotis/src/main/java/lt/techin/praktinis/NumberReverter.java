package lt.techin.praktinis;

public class NumberReverter {
    public void revert(int number) {
        // Write your program here

        int j = 0;
        for(int i = 1; i <= 3; i++){
            j = number % 10;
            number /= 10;
            System.out.print(j);
            j = 0;

        }
        System.out.println();

    }
}
