package hw11;

import java.util.*;

public class CollectionsPractice {
    public static int countOccurance(List<String> stringList, String anyString) {
        int count = 0;
        for (String s : stringList) {
            if(s.equals(anyString)) {
                count++;
            }
        }
        return count;
    }

    //task 2
    public static <T> List<T> toList(T[] array) {

        return new ArrayList<>(Arrays.asList(array));
    }

    //task 3
    public static List<Integer> findUnique(List<Integer> anyNumbers) {
        Set<Integer> uniqueNumbersSet = new HashSet<>(anyNumbers);

        return new ArrayList<>(uniqueNumbersSet);
    }

    //task 4

    public static void calcOccurance(List<String> words) {
        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            int count = wordCount.getOrDefault(word, 0);
            wordCount.put(word, count + 1);
        }

        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    //task 4 ***

    static class Occurrence {
        private final String name;
        private final int occurrence;

        public Occurrence(String name, int occurrence) {
            this.name = name;
            this.occurrence = occurrence;
        }

        @Override
        public String toString() {
            return "{name: \"" + name + "\", occurrence: " + occurrence + "}";
        }
    }

    public static List<Occurrence> findOccurance(List<String> words) {
        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            int count = wordCount.getOrDefault(word, 0);
            wordCount.put(word, count + 1);
        }

        List<Occurrence> result = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            result.add(new Occurrence(entry.getKey(), entry.getValue()));
        }
        return result;
    }

}
