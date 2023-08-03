package hw9.fruits;

public class Box <T extends Fruit> {
    private final Object[] fruits;
    private int size;

    public Box() {
        this.fruits = new Object[10];
    }

    public void addFruit(T fruit) {
        fruits[size++] = fruit;
    }

    @SafeVarargs
    public final void addFruits(T... moreFruits) {
        for (T fruit : moreFruits) {
            fruits[size++] = fruit;
        }
    }

    public float getWeight() {
        if (size == 0) {
            return 0.0f;
        }
        float fruitWeight = 0.0f;
        if (fruits[0] instanceof Apple) {
            fruitWeight = 1.0f;
        } else if (fruits[0] instanceof Orange) {
            fruitWeight = 1.5f;
        }
        return fruitWeight * size;
    }

    public boolean compare(Box<?> otherBox) {
        float thisBoxWeight = this.getWeight();
        float otherBoxWeight = otherBox.getWeight();

        return thisBoxWeight == otherBoxWeight;
    }

    public void merge(Box<T> otherBox) {
        if (size == 0 || otherBox.size == 0) {
            return;
        }
        System.arraycopy(otherBox.fruits, 0, fruits, size, otherBox.size);
        size += otherBox.size;
        otherBox.size = 0;
    }
}
