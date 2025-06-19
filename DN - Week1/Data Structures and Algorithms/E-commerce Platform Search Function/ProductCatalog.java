import java.util.*;

public class ProductCatalog {
    private List<Product> products;

    public ProductCatalog() {
        products = new ArrayList<>();

        // Electronics
        products.add(new Product("Laptop", "Electronics", 55000));
        products.add(new Product("Smartphone", "Electronics", 25000));
        products.add(new Product("Smartwatch", "Electronics", 8000));
        products.add(new Product("Bluetooth Speaker", "Electronics", 3000));
        products.add(new Product("Headphones", "Electronics", 2000));
        products.add(new Product("Gaming Console", "Electronics", 45000));

        // Home Appliances
        products.add(new Product("Refrigerator", "Home Appliances", 30000));
        products.add(new Product("Washing Machine", "Home Appliances", 22000));
        products.add(new Product("Microwave Oven", "Home Appliances", 12000));
        products.add(new Product("Vacuum Cleaner", "Home Appliances", 7000));

        // Furniture
        products.add(new Product("Office Chair", "Furniture", 4000));
        products.add(new Product("Study Table", "Furniture", 5500));
        products.add(new Product("Bookshelf", "Furniture", 3500));

        // Clothing
        products.add(new Product("T-Shirt", "Clothing", 500));
        products.add(new Product("Jeans", "Clothing", 1200));
        products.add(new Product("Sneakers", "Clothing", 2500));
    }

    public List<Product> search(String keyword) {
        List<Product> results = new ArrayList<>();
        keyword = keyword.toLowerCase();

        for (Product product : products) {
            if (product.getName().toLowerCase().contains(keyword) ||
                product.getCategory().toLowerCase().contains(keyword)) {
                results.add(product);
            }
        }
        return results;
    }

    public List<Product> search(String keyword, double minPrice, double maxPrice) {
        List<Product> results = new ArrayList<>();
        keyword = keyword.toLowerCase();

        for (Product product : products) {
            if ((product.getName().toLowerCase().contains(keyword) ||
                 product.getCategory().toLowerCase().contains(keyword)) &&
                product.getPrice() >= minPrice &&
                product.getPrice() <= maxPrice) {
                results.add(product);
            }
        }
        return results;
    }
}
