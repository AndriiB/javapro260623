package hw4;

public class AnimalMain {
    public static void main(String[] args) {
        Dog dogBobik = new Dog("Bobik");
        dogBobik.animalRun(501);
        dogBobik.animalSwim(11);

        Dog dogPatron = new Dog("Patron");
        dogPatron.animalRun(499);
        dogPatron.animalSwim(9);

        Cat catMursik = new Cat("Mursik");
        catMursik.animalRun(201);
        catMursik.animalSwim(11);

        System.out.println("Total created dogs: " + Dog.getDogCount());
        System.out.println("Total created cats: " + Cat.getCatCount());
        System.out.println("Total created animals: " + (Dog.getDogCount() + Cat.getCatCount()));
    }
}
