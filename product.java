package product;

public class product {
    public static void main(String[] args) {
        Nproduct product1 = new Nproduct();
        Nproduct product2 = new Nproduct(699);
        Nproduct product3 = new Nproduct(299, 10);
        Nproduct product4 = new Nproduct(299, 10, 500, "MarketA");

        product1.printProductData();
        product2.printProductData();
        product3.printProductData();
        product4.getProductMarketName();
        product4.getProductWeight();
    }
}