import java.util.HashMap;

public class IOU {

    private HashMap<String, Double> owner;

    public IOU() {
        this.owner = new HashMap<>();
    }

    public void setSum(String toWhom, double amount) {
        owner.put(toWhom, amount);
    }

    public double howMuchDoIOweTo(String toWhom) {

        for (String name : owner.keySet()) {
            if (name.equals(toWhom)) {
                return owner.get(toWhom);
            }
        }
        return 0;
    }
}
