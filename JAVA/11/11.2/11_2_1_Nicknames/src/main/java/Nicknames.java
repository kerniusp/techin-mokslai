import java.util.HashMap;
import java.util.Map;

public class Nicknames {

    public static void main(String[] args) {
        // Do the operations required here!

        Map<String, String> names = new HashMap<>();
        names.put("matthew's", "matt");
        names.put("michael's", "mix");
        names.put("arthur's", "artie");

        names.forEach((name, nickname) -> System.out.println(name + " nickname is " + nickname));

    }

}
