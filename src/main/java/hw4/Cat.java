package hw4;

public class Cat extends Animal {

    private String catName;
    private static int catCount = 0;

    public Cat(String catName) {
        this.catName = catName;
        catCount++;
    }

    @Override
    public void animalRun(int distance) {
        if (distance <= 200) {
            System.out.println(getCatName() + " the cat run " + distance + " м");
        } else {
            System.out.println(getCatName() + " the cat can not run distance > 200");
        }
    }

    @Override
    public void animalSwim(int distance) {
        System.out.println(getCatName() + " the cat can not swim");
    }

    public static int getCatCount() {
        return catCount;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }
}
