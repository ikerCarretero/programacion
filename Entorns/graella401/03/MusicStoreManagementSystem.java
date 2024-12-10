import java.util.ArrayList;
import java.util.List;

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

class Invoice {
    private List<Product> productList;

    public Invoice() {
        this.productList = new ArrayList<>();
    }

    public void addProduct(Product product) {
        if (isProductValid(product)) {
            productList.add(product);
        } else {
            System.out.println("Error: Producte no vàlid!");
        }
    }

    public void printInvoice() {
        System.out.println("Factura:");
        printProducts();
        double total = calculateTotal();
        printTotal(total);
    }

    private void printProducts() {
        if (productList.isEmpty()) {
            System.out.println("No s'han trobat productes a la factura.");
            return;
        }
        for (Product product : productList) {
            printProductDetails(product);
        }
    }

    private void printProductDetails(Product product) {
        System.out.printf("%s: %.2f%n", product.getName(), product.getPrice());
    }

    private double calculateTotal() {
        double total = 0;
        for (Product product : productList) {
            total += product.getPrice();
        }
        return total;
    }

    private void printTotal(double total) {
        System.out.printf("Total: %.2f%n", total);
    }

    private boolean isProductValid(Product product) {
        return product.getPrice() > 0; // Validem si el preu és positiu
    }
}

class MusicStore {
    private List<Product> inventory;

    public MusicStore() {
        inventory = new ArrayList<>();
        initializeInventory();
    }

    private void initializeInventory() {
        inventory.add(new Product("Disc 'Abbey Road'", 25.99));
        inventory.add(new Product("Vinil 'Thriller'", 35.50));
        inventory.add(new Product("Accessoris de guitarra", 15.75));
        inventory.add(new Product("Disc 'Back in Black'", 26.00));
        inventory.add(new Product("Vinil 'Dark Side of the Moon'", 40.00));
    }

    public List<Product> getInventory() {
        return inventory;
    }

    public Product searchProduct(String productName) {
        for (Product product : inventory) {
            if (product.getName().equalsIgnoreCase(productName)) {
                return product;
            }
        }
        return null; // Retornem null si no trobem el producte
    }

    public void listInventory() {
        System.out.println("Inventari de la botiga:");
        for (Product product : inventory) {
            System.out.printf("%s: %.2f%n", product.getName(), product.getPrice());
        }
    }
}

public class MusicStoreManagementSystem {
    public static void main(String[] args) {
        MusicStore store = new MusicStore();
        Invoice invoice = new Invoice();

        // Mostrar inventari disponible
        store.listInventory();

        // Simular la selecció de productes
        Product selectedProduct1 = store.searchProduct("Disc 'Abbey Road'");
        if (selectedProduct1 != null) {
            invoice.addProduct(selectedProduct1);
        }

        Product selectedProduct2 = store.searchProduct("Vinil 'Thriller'");
        if (selectedProduct2 != null) {
            invoice.addProduct(selectedProduct2);
        }

        Product selectedProduct3 = store.searchProduct("Accessoris de guitarra");
        if (selectedProduct3 != null) {
            invoice.addProduct(selectedProduct3);
        }

        // Imprimir la factura
        invoice.printInvoice();
    }
}
