import java.util.ArrayList;
import java.util.List;

class Product {

    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void applyDiscount(double discount) {
        price -= discount;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

class ShoppingCart {

    private List<Product> products;

    public ShoppingCart() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void checkout() {
        for (Product product : products) {
            product.applyDiscount(10.0);
        }
    }

    public void showDetails() {
        for (Product product : products) {
            System.out.println("Produto: " + product.getName());
            System.out.println("Preço: " + product.getPrice());
            System.out.println("-------------------");
        }
    }
}

public class Main {

    public static void main(String[] args) {

        Product product1 = new Product("Laptop", 1500.00);
        Product product2 = new Product("Smartphone", 1200.00);

        ShoppingCart cart = new ShoppingCart();

        cart.addProduct(product1);
        cart.addProduct(product2);

        cart.checkout();
        cart.showDetails();
    }
}