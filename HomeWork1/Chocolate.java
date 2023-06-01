package HomeWork1;

public class Chocolate extends Product{
    private int calories;

    public Chocolate(String name, double price, int quantity, int calories) {
        super(name, price, quantity);
        this.calories = calories;
    }

    public int getCalories() {
        return calories;
    }
}
