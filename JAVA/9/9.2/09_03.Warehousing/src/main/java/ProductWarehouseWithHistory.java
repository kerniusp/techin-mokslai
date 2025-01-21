import java.util.ArrayList;

public class ProductWarehouseWithHistory extends ProductWarehouse{

    ChangeHistory history;

    public ProductWarehouseWithHistory(String productName, double capacity){
        super(productName,capacity);

    }

    public ProductWarehouseWithHistory(String productName, double capacity, double intialBalance){
        super(productName,capacity);
        intialBalance = getBalance();

    }

    public String history(){

        return history.toString();
    }


}
