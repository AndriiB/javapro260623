package hw4;

public class Dog extends Animal {
    private String dogName;
    private static int dogCount = 0;

    public Dog(String dogName) {
        this.dogName = dogName;
        dogCount++;
    }

    @Override
    public void animalRun(int distance) {
        if (distance <= 500) {
            System.out.println(getDogName() + " the dog run " + distance + " м");
        } else {
            System.out.println(getDogName() + " the dog can not run distance > 500");
        }
    }

    @Override
    public void animalSwim(int distance) {
        if (distance <= 10) {
            System.out.println(getDogName() + " the dog swam " + distance + " м");
        } else {
            System.out.println(getDogName() + " the dog can not swim distance > 10");
        }
    }

    public static int getDogCount() {
        return dogCount;
    }

    public String getDogName() {
        return dogName;
    }
    public void setDogName(String dogName) {
        this.dogName = dogName;
    }

}
