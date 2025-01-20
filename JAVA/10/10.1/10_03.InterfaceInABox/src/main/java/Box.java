import java.util.ArrayList;

public class Box implements Packable {


    private double maxCapacity;
    private ArrayList<Object> packable;
    private int counter;


    public Box(double maxCapacity) {
        this.maxCapacity = maxCapacity;
        this.packable = new ArrayList<>();

    }

    public void add(Packable item) {
        if (item.weight() <= maxCapacity) {
            packable.add(item);
            maxCapacity -= item.weight();
            weight(item.weight());
            counter++;
        }

    }

    public double weight(double input) {
        return input += input;

    }

    @Override
    public double weight() {
        return 0;
    }

    @Override
    public String toString() {
        return "Box: " + counter + " items," + " total weight  " + weight();
    }
}
