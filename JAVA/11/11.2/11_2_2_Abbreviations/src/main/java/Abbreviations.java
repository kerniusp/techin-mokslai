import java.util.HashMap;
import java.util.Map;

public class Abbreviations {

    Map<String, String> abbrev;

    public Abbreviations() {
        this.abbrev = new HashMap<>();
    }

    public void addAbbreviation(String abbrevation, String explanation) {
        abbrev.put(abbrevation, explanation);

    }

    public boolean hasAbbreviation(String abbrevation) {

        return abbrev.containsKey(abbrevation);

    }

    public String findExplanationFor(String abbrevation) {

        if (abbrev.containsKey(abbrevation)) {
            String value = abbrev.get(abbrevation);
            return value;
        }
        return null;
    }


}
