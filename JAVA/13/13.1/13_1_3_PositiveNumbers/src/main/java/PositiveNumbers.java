import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PositiveNumbers {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>(Arrays.asList(-1, -2, 3, 4, -10, 5));


        System.out.println(positive(numbers));

    }

    public static List<Integer> positive(List<Integer> numbers) {

        List<Integer> newlist = numbers.stream()
                .filter(number -> number > 0)
                .collect(Collectors.toList());

        return newlist;
    }
}
