package HomeWork2;

public class MainClass {
    public static void main(String[] args) {
        Cat[] cats = new Cat[3];
        cats[0] = new Cat("Барсик", 5);
        cats[1] = new Cat("Мурзик", 3);
        cats[2] = new Cat("Рыжик", 7);
        
        Plate plate = new Plate(20);
        
        for (Cat cat : cats) {
            cat.eat(plate);
        }
        
        for (Cat cat : cats) {
            System.out.println("Кот " + cat.getName() + " сыт: " + cat.isFull());
        }
        plate.increaseFood(10);
    }
}
