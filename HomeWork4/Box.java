package HomeWork4;

import java.util.ArrayList;

public class Box <F extends Fruit> {

    private ArrayList<F> fruits;

    public Box() {
        this.fruits = new ArrayList<>();
    }

    public float getWeight() {
        float weight = 0.0f;
        for (F fruit : fruits) {
            weight += fruit.getWeight();
        }
        return weight;
    }

    public void add(F fruit) {
        fruits.add(fruit);
    }

    public boolean compare(Box<?> otherBox) {
        return Math.abs(getWeight() - otherBox.getWeight()) < 0.0001;
    }

    public void transfer(Box<F> otherBox) {
        if (otherBox == this) {
            return;
        }
        for (F fruit : new ArrayList<>(fruits)) {
            otherBox.add(fruit);
            fruits.remove(fruit);
        }
    }
}
