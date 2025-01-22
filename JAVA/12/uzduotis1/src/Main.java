import java.util.ArrayList;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {


        Function<Integer, String> intToString = (number) -> Integer.toString(number);
        System.out.println(intToString.apply(5));
        //

        Predicate<Integer> isEven = number -> number % 2 == 0;
        System.out.println(isEven.test(4));
        System.out.println(isEven.test(7));

        //
        Consumer<String> printMessage = (word) -> System.out.println(word + " is awesome!");
        printMessage.accept("Java");

        Supplier<String> randomGreeting = () -> {
            String[] greeting = {"Hello", "Hi", "Hey"};
            Random rand = new Random();
            int n = rand.nextInt(3);
            return greeting[n];
        };
        System.out.println(randomGreeting.get());

    }
}