package HomeWork1;

public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();

        Chocolate chocolate = new Chocolate("Шоколадка", 50.0, 3, 200);
        vendingMachine.addProduct(chocolate);

        vendingMachine.sellProduct("Шоколадка");
        vendingMachine.sellProduct("Шоколадка");
        vendingMachine.sellProduct("Шоколадка");
        vendingMachine.sellProduct("Шоколадка");
    }
}
