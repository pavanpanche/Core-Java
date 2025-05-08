package JavaDemo.EcommerceProductFilterApp;

public class Product {
    private String name;
    private String category;
    private double price;
    private double rating;


    public Product(String name, String category, double price, double rating) {

        this.name = name;
        this.category = category;
        this.price = price;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }


    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }
    public double getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return String.format("Product [category=%s, name=%s, price=%s, rating=%s]", category, name, price, rating);
    }


}
