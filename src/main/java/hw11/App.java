package hw11;

import java.util.Arrays;
import java.util.List;

import static hw11.CollectionsPractice.*;

public class App {
    public static void main(String[] args) {

         // task 1
        List<String> stringList = List.of("Java", "JavaScript", "React", "NodeJS", "Java");
        String anyString = "Java";

        int occurancy = countOccurance(stringList, anyString);

        System.out.println("String \"" + anyString + "\" matches " + occurancy + " time/s.");

         // task 2
        Integer[] intArray = {1, 2, 3};
        List<Integer> intList = toList(intArray);

        System.out.println("Was Array: " + Arrays.toString(intArray));
        System.out.println("Becomes ArrayList: " + intList);

         // task 3
        List<Integer> anyNumbers = List.of(1, 1, 2, 3, 2, 4, 5, 1, 1);
        List<Integer> uniqueNumbers = findUnique(anyNumbers);

        System.out.println("Numbers: " + anyNumbers);
        System.out.println("Unique numbers: " + uniqueNumbers);


        // task 4
        List<String> inputList = List.of("bird", "cat", "cat", "bird", "bird", "cat",  "fox", "fox");
        calcOccurance(inputList);


         // task 4 ***

        List<String> inputWords = List.of("bird", "bird", "bird", "bird", "fox", "fox", "fox", "fox", "fox", "cat", "cat", "cat", "cat", "cat");
        List<Occurrence> result = findOccurance(inputWords);

        for (Occurrence occurrence : result) {
            System.out.println(occurrence);
        }
    }
}
