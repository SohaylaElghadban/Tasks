package product;
public class Nproduct implements ProductInfo {
    public static double price;
    public static int quantity;
    private int weight;
    private String marketName;

    public Nproduct() {
        this.price = 0.0;
        this.quantity = 0;
        this.weight = 0;
        this.marketName = "";
    }

    public Nproduct(double price) {
        this.price = price;
        this.quantity = 0;
        this.weight = 0;
        this.marketName = "";
    }

    public Nproduct(double price, int quantity) {
        this.price = price;
        this.quantity = quantity;
        this.weight = 0;
        this.marketName = "";
    }

    public Nproduct(double price, int quantity, int weight, String marketName) {
        this.price = price;
        this.quantity = quantity;
        this.weight = weight;
        this.marketName = marketName;
    }

    @Override
    public void getProductWeight() {
        System.out.println(weight);
    }

    @Override
    public void getProductPrice() {
        System.out.println(price);
    }

    @Override
    public void getProductMarketName() {
        System.out.println(marketName);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int Calculate(int quantity, double price) {
        double sum = quantity * price;
        System.out.println("Total Value: " + sum);
        return 0;
    }

    public static void printProductData() {
        System.out.println("Product Price: " + price);
        System.out.println("Product Quantity: " + quantity);
    }
}
