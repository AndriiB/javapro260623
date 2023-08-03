package hw9.fruits;

public class App {
    public static void main(String[] args) {

        Apple greenApple = new Apple();
        Apple whiteApple = new Apple();
        Orange orange = new Orange();

        Box<Apple> appleBox1 = new Box<>();
        appleBox1.addFruit(greenApple);
        appleBox1.addFruit(whiteApple);

        Box<Apple> appleBox2 = new Box<>();
        appleBox2.addFruit(greenApple);

        Box<Apple> appleBox3 = new Box<>();
        appleBox3.addFruits(greenApple, whiteApple, new Apple());


        Box<Orange> orangeBox = new Box<>();
        orangeBox.addFruit(orange);

        System.out.println("Weight of appleBox1: " + appleBox1.getWeight());
        System.out.println("Weight of appleBox2: " + appleBox2.getWeight());
        System.out.println("Weight of orangeBox: " + orangeBox.getWeight());

        System.out.println("Are appleBox1 and appleBox2 the same weight? " + appleBox1.compare(appleBox2));
        System.out.println("Are appleBox1 and orangeBox the same weight? " + appleBox1.compare(orangeBox));

        appleBox1.merge(appleBox2);
        System.out.println("Weight of appleBox1 after merge: " + appleBox1.getWeight());
    }
}
