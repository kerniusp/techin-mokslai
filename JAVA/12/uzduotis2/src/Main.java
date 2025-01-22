import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    static Integer counter = 0;

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        names.forEach((name) -> System.out.println("Name: " + name));
        //
        List<String> names2 = new ArrayList<>(Arrays.asList("Tom", "Lisa", "Eve", "Robert", "Kate"));
        names2.removeIf((name) -> name.length() < 4);
        System.out.println(names2);
        //
        List<String> names3 = new ArrayList<>(Arrays.asList("Alica", "Bob", "Charlie"));
        names3.replaceAll((name) -> name.toUpperCase());
        System.out.println(names3);
        //
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));
        numbers.removeIf((number) -> number % 2 == 0);
        System.out.println(numbers);
        //
        List<String> task = new ArrayList<>(Arrays.asList("task1", "task2", "task3"));
        task.replaceAll((tsk) -> tsk + "_done");
        System.out.println(task);
        //
        List<Integer> numbers2 = new ArrayList<>(Arrays.asList(5, 2, 8, 1, 3));
        numbers2.sort((o1, o2) -> o2 - o1);
        System.out.println(numbers2);
        //
        List<String> words = new ArrayList<>(Arrays.asList("apple", "banana", "cherry", "date", "fig"));
        words.removeIf((removing) -> removing.contains("e"));
        System.out.println(words);
        //
        List<Integer> numbers3 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        numbers3.replaceAll((numb) -> numb * numb);
        System.out.println(numbers3);
        //
        List<String> names4 = new ArrayList<>(Arrays.asList("Eve", "Alice", "Charlie", "Bob"));
        names4.sort((str1, str2) -> str1.charAt(str1.length() - 1) - str2.charAt(str2.length() - 1));
        System.out.println(names4);
        //

        List<String> fruits = Arrays.asList("apple", "orange", "apple", "banana", "apple");
        fruits.forEach((fruit) -> {
                    if (fruit.equals("apple")) {
                        count();
                    }
                }
        );
        System.out.println("The word apple appears " + counter + " times");

    }

    static void count() {
        counter++;
    }
}