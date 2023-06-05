package HomeWork2;

public class Plate {
    private int food;
    
    public Plate(int food) {
        this.food = food;
    }
    
    public void info() {
        System.out.println("В тарелке " + food + " еды");
    }
    
    public void decreaseFood(int amount) {
        if (food >= amount) {
            food -= amount;
        }
    }
    
    public void increaseFood(int amount) {
        food += amount;
    }
    
    public int getFood(){
        return food;
    }
}
