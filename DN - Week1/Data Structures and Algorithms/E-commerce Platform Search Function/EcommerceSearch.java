import java.util.*;

public class EcommerceSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProductCatalog catalog = new ProductCatalog();

        System.out.print("Enter keyword (name/category): ");
        String keyword = sc.nextLine();

        System.out.print("Do you want to filter by price range? (yes/no): ");
        String choice = sc.nextLine().trim().toLowerCase();

        List<Product> results;

        if (choice.equals("yes")) {
            System.out.print("Enter minimum price: Rs. ");
            double minPrice = sc.nextDouble();

            System.out.print("Enter maximum price: Rs. ");
            double maxPrice = sc.nextDouble();

            results = catalog.search(keyword, minPrice, maxPrice);
        } else {
            results = catalog.search(keyword);
        }

        System.out.println("\nSearch Results:");
        if (results.isEmpty()) {
            System.out.println("No products found matching the search.");
        } else {
            for (Product product : results) {
                System.out.println("- " + product.toString());
            }
        }

        sc.close();
    }
}
