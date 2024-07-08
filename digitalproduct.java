package product;
public class digitalproduct implements ProductInfo {
    public static double price;

    public int weight;
    public String marketName;

    public digitalproduct() {
        this.price = 0.0;
        this.weight = 0;
        this.marketName = "";
    }

    public digitalproduct(double price) {
        this.price = price;
        this.weight = 0;
        this.marketName = "DigitalProduct";
    }
    public digitalproduct(double price, int weight, String name) {
        this.price = price;
        this.weight = weight;
        this.marketName = name ;
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
    public void print() {
        System.out.println(price);
        System.out.println(weight);
        System.out.println(marketName);
    }






}
