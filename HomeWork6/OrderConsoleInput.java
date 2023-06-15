package HomeWork6;

import java.util.Scanner;

public class OrderConsoleInput {
    public Order inputOrder() {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Client name: ");
            String clientName = in.nextLine();
            System.out.print("Product: ");
            String product = in.nextLine();
            System.out.print("Quantity: ");
            int qnt = in.nextInt();
            System.out.print("Price: ");
            int price = in.nextInt();
            return new Order(clientName, product, qnt, price);
        }
    }

}
