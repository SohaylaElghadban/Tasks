package File;

import java.util.*;

public class Product {
    public static double price;
    public static int quantity;
    public Product() {
        this.price = 0.0;
        this.quantity = 0;
    }
    public Product(double price) {
        this.price = price;
        this.quantity = 0;
    }
    public Product(double price, int quantity) {
        this.price = price;
        this.quantity = quantity;
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

    public static void main(String[] args) {
        Product product1 = new Product();
        Product product2 = new Product(699);
        Product product3 = new Product(299, 10);

        product1.printProductData();
        product2.printProductData();
        product3.printProductData();

        System.out.println("Total value of product4: " + product3.Calculate(10, 699));
    }
}
