package hw15;
public class Animal {
    private String name;
    private int legs;
    private String species;

    public Animal(String name, int legs, String species) {
        this.name = name;
        this.legs = legs;
        this.species = species;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }
}
