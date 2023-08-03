package hw9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToList {

    public static <T> List<T> toList(T[] array) {
        List<T> list = new ArrayList<>();
        for (T item : array) {
            list.add(item);
        }
        return list;
    }

    /*Option #2*/
    public static <T> List<T> toList2(T[] array) {
        return new ArrayList<>(Arrays.asList(array));
    }
}





