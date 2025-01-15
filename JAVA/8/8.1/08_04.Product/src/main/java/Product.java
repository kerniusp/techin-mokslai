public class Product {

    private double price;
    private int quantity;
    private String name;

    public Product(String initialName, double initialPrice, int inittialQuantity) {
        name = initialName;
        price = initialPrice;
        quantity = inittialQuantity;
    }

    public void printProduct() {
        System.out.println(name + ", price " + price + ", " + quantity + "pcs");
    }


}
