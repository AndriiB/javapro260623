package hw15;

import hw14.Type;
import hw14.task6.Product;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static hw14.task6.Product.groupedProducts;

public class App {
    public static void main(String[] args) {
        List<Animal> wildAnimals = Arrays.asList(
                new Animal("Tiger", 4, "Mammal"),
                new Animal("Lion", 8, "Mammal"),
                new Animal("Duck", 4, "Bird")
        );

        List<Animal> pets = Arrays.asList(
                new Animal("Dog", 4, "Mammal"),
                new Animal("Cat", 6, "Mammal"),
                new Animal("Parrot", 4, "Bird")
        );

        List<Animal> randomAnimals = Arrays.asList(
                new Animal("Dog", 4, "Mammal"),
                new Animal("Cat", 6, "Mammal"),
                new Animal("Parrot", 4, "Bird"),
                new Animal("Dog", 4, "Mammal"),
                new Animal("Cat", 6, "Mammal"),
                new Animal("Parrot", 4, "Bird"),
                new Animal("Dog", 4, "Mammal"),
                new Animal("Cat", 6, "Mammal"),
                new Animal("Parrot", 4, "Bird"),
                new Animal("Dog", 4, "Mammal"),
                new Animal("Cat", 6, "Mammal"),
                new Animal("Parrot", 4, "Bird"),
                new Animal("Elephant", 4, "Reptiles")
        );

        // Q.3) Find the animal with the highest number of legs
        Optional<Animal> animalHasMostLegs = Stream.concat(wildAnimals.stream(), pets.stream())
                .max(Comparator.comparingInt(Animal::getLegs));

        animalHasMostLegs.ifPresent(animal -> System.out.println("Animal with the most number of legs: " + animal.getName()));


        //Q.5) Find the total number of legs
        int totalNumberLegs = randomAnimals.stream()
                .mapToInt(Animal::getLegs)
                .sum();
        System.out.println("Total number of legs: " + totalNumberLegs);

        // Q.6) Group the animals by their number of legs
        Map<Integer, List<Animal>> animalsByLegs = randomAnimals.stream()
                .collect(Collectors.groupingBy(Animal::getLegs));
        System.out.println("Grouped animals by number of legs:");
        animalsByLegs.forEach((legs, animals) -> {
                System.out.println("Legs: " + legs);
        animals.forEach(animal -> {
                System.out.println("  " + animal.getName());
            });
    });

       // Q.7) Count the number of animals in each specie
         Map<String, Long> speciesCount = randomAnimals.stream()
                        .collect(Collectors.groupingBy(Animal::getSpecies, Collectors.counting()));

                System.out.println("Number of animals in each species:");
                speciesCount.forEach((species, count) -> {
                    System.out.println(species + ": " + count);
                });


        // Q.8) Count the number of species
        long numberOfSpecies = speciesCount.size();
        System.out.println("Number of species: " + numberOfSpecies);
    }
}


