package HomeWork1;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private List<Product> products;

    public VendingMachine() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void sellProduct(String productName) {
        for (Product product : products) {
            if (product.getName().equals(productName)) {
                if (product.getQuantity() > 0) {
                    System.out.println("Продукт " + product.getName() + " продан за " + product.getPrice() + " рублей.");
                    product.setQuantity(product.getQuantity() - 1);
                } else {
                    System.out.println("Продукт " + product.getName() + " отсутствует в наличии.");
                }
                return;
            }
        }
        System.out.println("Продукт " + productName + " не найден.");
    }
}


