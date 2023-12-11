import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Catalog<Product> productCatalog = new Catalog<>();

        Product product1 = new Product("ItemA", "Piece", 100, 2.5, new Date());
        product1.addDescription("Color", "Red");
        product1.addDescription("Weight", "200g");

        Product product2 = new Product("ItemB", "Box", 50, 15.0, new Date());
        product2.addDescription("Material", "Cardboard");

        productCatalog.add(product1);
        productCatalog.add(product2);

        System.out.println("All Products:");
        productCatalog.displayItems();

        CatalogUtil.sortByName(productCatalog);
        System.out.println("\nProducts sorted by name:");
        productCatalog.displayItems();

        CatalogUtil.sortByPrice(productCatalog);
        System.out.println("\nProducts sorted by price:");
        productCatalog.displayItems();

        CatalogUtil.sortByArrivalDate(productCatalog);
        System.out.println("\nProducts sorted by arrival date:");
        productCatalog.displayItems();
    }
}
