import java.util.ArrayList;

public class ChangeHistory {

    private ArrayList<Double> history;

    public ChangeHistory() {
        this.history = new ArrayList<>();
    }

    public void add(Double status) {
        history.add(status);
    }

    public void clear() {

    }

    @Override
    public String toString() {
        return "ChangeHistory{" +
                "history=" + history +
                '}';
    }
}
