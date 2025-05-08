# 🛒 E-commerce Product Filter App using Core Java & Stream API

## 📌 Project Overview

This is a **console-based Java application** that demonstrates how to use **Java Stream API** to filter, sort, and display products in an e-commerce context. Users can filter products by category, price range, rating, brand, and more.

---

## 🛠️ Technologies Used

- Java 8+ (Core Java)
- Java Collections (`List`, `Map`, etc.)
- Java Stream API
- OOP Principles (Class, Object, Encapsulation)

---

## 🧱 Project Structure

ecommerce-product-filter/
├──src/
│ ├── Main.java
│ ├── model/
│ │ └── Product.java
│ ├── service/
│ │ └── ProductService.java
│ └── util/
│ └── ProductDataGenerator.java
├── README.md

---


---

## 📦 Features

- ✅ Display all available products
- ✅ Filter by:
    - Category
    - Brand
    - Price range
    - Minimum rating
- ✅ Sort products by:
    - Price (ascending/descending)
    - Rating
    - Name
- ✅ Modular code with `ProductService` class handling all logic using Stream API

---

## 🧾 Class Descriptions

### 📌 `Product.java` (Model)

Represents a product with attributes like:

```java
private int id;
private String name;
private String category;
private String brand;
private double price;
private double rating;
```
---
### 📌 ProductDataGenerator.java (Utility)
Generates sample product data and returns it as a List<Product>.

### 📌 ProductManager.java (Service Layer)
Contains all business logic using Java Stream API:

- filterByCategory(String category)

- filterByBrand(String brand)

- filterByPriceRange(double min, double max)

- filterByMinRating(double rating)

- sortByPrice(boolean ascending)

- sortByRating()

- sortByName()

---

### 📌 Main.java (Driver Class)
Provides a menu-driven interface to:

View products

Apply filters

Sort products

Exit the application

---

### 🖥️ How to Run
- Clone or download the repository.

- Open in any Java IDE (Eclipse, IntelliJ, VS Code).

- Compile and run Main.java.

- Follow the on-screen menu to filter or sort products.

---
### Sample Output:


**=== Product List ===**

- ID: 101 | Name: iPhone 14 | Category: Mobile | Brand: Apple | Price: 79999.0 | Rating: 4.5
- ID: 102 | Name: Samsung Galaxy | Category: Mobile | Brand: Samsung | Price: 59999.0 | Rating: 4.3
...

**=== Filter by Price (50000–80000) ===**
- ID: 101 | Name: iPhone 14 | 

**=== Sorted by Rating ===**
- ID: 104 | Name: Pixel 6 | Rating: 4.8
- ID: 101 | Name: iPhone 14 | Rating: 4.5
---

## 🚀 Stream API Benefits in this App
- Clean and concise filtering logic

- Declarative programming style

- Improved readability

- Easy to chain operations (filter → sort → collect)

---

## 📚 Java Concepts Practiced
- Classes & Objects

- Collection Framework

- Stream API

- Encapsulation & Separation of Concerns

- Lambda Expressions

- Method References

---
## 📄 License
This project is open-source and available for personal or educational use.





