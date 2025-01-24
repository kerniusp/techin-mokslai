import java.util.ArrayList;

public class ProductWarehouse extends Warehouse {

    private String name;


    public ProductWarehouse(String name, Double capacity) {
        super(capacity);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return getName() + ": " + super.toString();
    }
}
