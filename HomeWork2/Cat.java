package HomeWork2;

public class Cat {
    private String name;
    private int appetite;
    private boolean fullness;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.fullness = false;
    }
    public void eat(Plate plate) {
        if (plate.getFood() >= appetite){
            plate.decreaseFood(appetite);
            this.fullness = true;
        } else {
            System.out.println("Кот " + name + " не может покушать, в тарелке недостаточно еды!");
        }
     }

     public boolean isFull() {
        return fullness;
     }
    public String getName() {
        return null;
    }
}
