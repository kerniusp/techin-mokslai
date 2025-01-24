import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Program {

    public static void main(String[] args) {
        HashMap<String, String> hashmap = new HashMap<>();
        hashmap.put("f.e", "for example");
        hashmap.put("etc.", "and so on");
        hashmap.put("i.e", "more precisely");

        printKeys(hashmap);
        System.out.println("---");
        printKeysWhere(hashmap, "i");
        printValuesOfKeysWhere(hashmap, ".e");


    }

    public static void printKeys(HashMap<String, String> hashMap) {
        hashMap.forEach((keys, values) -> System.out.println(keys));
    }

    public static void printKeysWhere(HashMap<String, String> hashMap, String text) {

        for (String key : hashMap.keySet()) {
            if (key.contains(text)) {
                System.out.println(key);
            }
        }
    }

    public static void printValuesOfKeysWhere(HashMap<String, String> hashMap, String text) {

        hashMap.forEach((key, value) -> {
            if (key.contains(text)) {
                System.out.println(value);
            }
        });
    }

}
