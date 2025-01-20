import java.util.ArrayList;

public class OneItemBox extends Box {

    private int capacity = 1;
    private ArrayList<Item> items;

    public OneItemBox() {
        this.capacity = capacity;
        this.items = new ArrayList<>();
    }

    @Override
    public boolean isInBox(Item item) {
        for (int i = 0; i < items.size(); i++) {
            if (item.equals(items.get(i))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void add(Item item) {
        if (capacity <= 1) {
            items.add(item);
            capacity++;
        }
    }


}
