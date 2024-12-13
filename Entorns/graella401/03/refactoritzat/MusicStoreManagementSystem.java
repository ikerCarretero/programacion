package refactoritzat;
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
    private static final String TOTAL_2F_N = "Total: %.2f%n";
    private static final String FACTURA = "Factura:";
    private static final String ERROR_PRODUCTE_NO_VÀLID = "Error: Producte no vàlid!";
    private static final String NO_S_HAN_TROBAT_PRODUCTES_A_LA_FACTURA = "No s'han trobat productes a la factura.";
    private static final String NO_S_HAN_TROBAT_PRODUCTES_A_LA_FACTURA2 = NO_S_HAN_TROBAT_PRODUCTES_A_LA_FACTURA;
    private List<Product> productList;

    public Invoice() {
        this.productList = new ArrayList<>();
    }

    public void addProduct(Product product) {
        if (isProductValid(product)) {
            productList.add(product);
        } else {
            System.out.println(ERROR_PRODUCTE_NO_VÀLID);
        }
    }

    public void printInvoice() {
        System.out.println(FACTURA);
        printProducts();
        double total = calculateTotal();
        printTotal(total);
    }

    private void printProducts() {
        if (productList.isEmpty()) {
            System.out.println(NO_S_HAN_TROBAT_PRODUCTES_A_LA_FACTURA2);
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
        System.out.printf(TOTAL_2F_N, total);
    }

    private boolean isProductValid(Product product) {
        return product.getPrice() > 0; // Validem si el preu és positiu
    }
}

class MusicStore {
    private static final String VINIL_DARK_SIDE_OF_THE_MOON = "Vinil 'Dark Side of the Moon'";
    private static final String DISC_BACK_IN_BLACK = "Disc 'Back in Black'";
    private static final String ACCESSORIS_DE_GUITARRA = "Accessoris de guitarra";
    private static final String VINIL_THRILLER = "Vinil 'Thriller'";
    private static final String DISC_ABBEY_ROAD = "Disc 'Abbey Road'";
    private static final String INVENTARI_DE_LA_BOTIGA = "Inventari de la botiga:";
    private List<Product> inventory;

    public MusicStore() {
        inventory = new ArrayList<>();
        initializeInventory();
    }

    private void initializeInventory() {
        inventory.add(new Product(DISC_ABBEY_ROAD, 25.99));
        inventory.add(new Product(VINIL_THRILLER, 35.50));
        inventory.add(new Product(ACCESSORIS_DE_GUITARRA, 15.75));
        inventory.add(new Product(DISC_BACK_IN_BLACK, 26.00));
        inventory.add(new Product(VINIL_DARK_SIDE_OF_THE_MOON, 40.00));
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
        System.out.println(INVENTARI_DE_LA_BOTIGA);
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
