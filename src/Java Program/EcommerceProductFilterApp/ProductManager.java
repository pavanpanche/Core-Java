package JavaDemo.EcommerceProductFilterApp;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProductManager {
    private List<Product> products = new ArrayList<>();

    public void addProduct(String name, String category, double price, double rating) {
        products.add(new Product(name, category, price, rating));
    }

    public void displayAllProducts() {
        products.forEach(System.out::println);
    }

    public void filterByCategory(String category) {
        List<Product> filtered = products.stream().filter(p -> p.getCategory().equalsIgnoreCase(category)).collect(Collectors.toList());

        filtered.forEach(System.out::println);
    }

    public void filterByPriceRange(double min, double max ) {
        List<Product> filtered = products.stream().filter(p -> p.getPrice() >= min && p.getPrice()<=max).collect(Collectors.toList());

        filtered.forEach(System.out::println);

    }
    public void sortByPrice(boolean ascending) {
        List<Product> sorted = products.stream()
                .sorted((p1, p2) -> ascending
                        ? Double.compare(p1.getPrice(), p2.getPrice())
                        : Double.compare(p2.getPrice(), p1.getPrice()))
                .collect(Collectors.toList());

        sorted.forEach(System.out::println);
    }
    public void sortByRating(boolean ascending) {
        List<Product> sorted = products.stream()
                .sorted((p1, p2) -> ascending
                        ? Double.compare(p1.getRating(), p2.getRating())
                        : Double.compare(p2.getRating(), p1.getRating()))
                .collect(Collectors.toList());

        sorted.forEach(System.out::println);
    }


}
