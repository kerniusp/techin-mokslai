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
            counter++;
        }

    }



    @Override
    public double weight() {

        double sum = 0;
        for(int i = 0; i < packable.size(); i++){
            Packable item = (Packable) packable.get(i);
            sum += item.weight();
        }
        return sum;
    }




    @Override
    public String toString() {
        return "Box: " + counter + " items," + " total weight " +weight() + " kg";
    }
}
