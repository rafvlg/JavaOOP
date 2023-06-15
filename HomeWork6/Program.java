package HomeWork6;

public class Program {

public static void main(String[] args) {
    System.out.println("Введите заказ:");
    OrderConsoleInput input = new OrderConsoleInput();
    Order order = input.inputOrder();
    OrderJsonWriter writer = new OrderJsonWriter();
    writer.writeToJson(order);
    }   



}
