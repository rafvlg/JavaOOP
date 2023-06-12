package HomeWork4;

public class Program {
    public static void main(String[] args) {

        Box<Apple> appleBox1 = new Box<>();
        appleBox1.add(new Apple());
        appleBox1.add(new Apple());
        appleBox1.add(new Apple());

        Box<Orange> orangeBox1 = new Box<>();
        orangeBox1.add(new Orange());
        orangeBox1.add(new Orange());

        Box<Apple> appleBox2 = new Box<>();
        appleBox2.add(new Apple());
        appleBox2.add(new Apple());

        System.out.println("appleBox1 weight: " + appleBox1.getWeight());
        System.out.println("orangeBox1 weight: " + orangeBox1.getWeight());
        System.out.println("appleBox2 weight: " + appleBox2.getWeight());

        System.out.println("appleBox1 equals orangeBox1: " + appleBox1.compare(orangeBox1));
        System.out.println("appleBox1 equals appleBox2: " + appleBox1.compare(appleBox2));

        appleBox1.transfer(appleBox2);

        System.out.println("appleBox1 weight: " + appleBox1.getWeight());
        System.out.println("appleBox2 weight: " + appleBox2.getWeight());

    }

}