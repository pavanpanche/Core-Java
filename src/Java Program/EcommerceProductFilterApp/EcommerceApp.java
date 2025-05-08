package JavaDemo.EcommerceProductFilterApp;

import java.util.Scanner;

public class EcommerceApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ProductManager manage = new ProductManager();
        manage.addProduct("motorola g45", "Electronics", 9999, 4.6);
        manage.addProduct("Puma Shoes", "Futwear", 23299., 4.2);
        manage.addProduct("Denim Jeans", "Clothing", 1500., 4.0);
        manage.addProduct("LG LED TV", "Electronics", 25000., 3.1);
        manage.addProduct("Apple Iphone 13", "Electronics", 78000, 4.1);



        int choice;
        do {
            System.out.print("======Welcome to Flipkart===== ");
            System.out.println("-------------------------------");
            System.out.println("\\n==== Enter Your Choice ===//");
            System.out.println("1. Add Product:  ");
            System.out.println("2. Display All Products:  ");
            System.out.println("3. Filter by Category:  ");
            System.out.println("4. Filter by Price Range:  " );
            System.out.println("5. Sort by Price:  ");
            System.out.println("6. Sort by Rating:  ");
            System.out.println("0. Exit:  ");
            System.out.println("------------------------------");
            System.out.print("Enter choice:  ");
            choice = sc.nextInt();
            sc.nextLine();  // consume new line

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter category: ");
                    String category = sc.nextLine();
                    System.out.print("Enter price: ");
                    double price = sc.nextDouble();
                    System.out.print("Enter rating: ");
                    double rating = sc.nextDouble();
                    manage.addProduct(name, category, price, rating);
                    break;

                case 2:
                    manage.displayAllProducts();
                    break;

                case 3:
                    System.out.print("Enter category to filter: ");
                    String cat = sc.nextLine();
                    manage.filterByCategory(cat);
                    break;

                case 4:
                    System.out.print("Enter min price: ");
                    double min = sc.nextDouble();
                    System.out.print("Enter max price: ");
                    double max = sc.nextDouble();
                    manage.filterByPriceRange(min, max);
                    break;

                case 5:
                    System.out.print("Sort by price (1 for asc, 0 for desc): ");
                    boolean ascPrice = sc.nextInt() == 1;
                    manage.sortByPrice(ascPrice);
                    break;

                case 6:
                    System.out.print("Sort by rating (1 for asc, 0 for desc): ");
                    boolean ascRating = sc.nextInt() == 1;
                    manage.sortByRating(ascRating);
                    break;
            }
        } while (choice != 0);

        sc.close();
    }

}
