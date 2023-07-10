package hw3;

public class Burger {

    private String bun;
    private String meat;
    private String cheese;
    private String veggies;
    private String mayo;

    public Burger(String bun, String meat, String cheese, String veggies, String mayo) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.veggies = veggies;
        this.mayo = mayo;
        printBurger();
    }


    public Burger(String bun, String meat, String cheese, String veggies) {
        this(bun, meat, cheese, veggies, "no mayo");
    }

    public Burger(String bun, String meat, String cheese, String veggies, String mayo, boolean doubleMeat) {
        this(bun, doubleMeat ? "double meat" : meat, cheese, veggies, mayo);

    }

    public String getBun() {
        return bun;
    }

    public String getMeat() {
        return meat;
    }

    public String getCheese() {
        return cheese;
    }

    public String getVeggies() {
        return veggies;
    }

    public String getMayo() {
        return mayo;
    }

    public void setBun(String bun) {
        this.bun = bun;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public void setCheese(String cheese) {
        this.cheese = cheese;
    }

    public void setVeggies(String veggies) {
        this.veggies = veggies;
    }

    public void setMayo(String mayo) {
        this.mayo = mayo;
    }

    private void printBurger() {
        System.out.printf("The burger is - %s, %s, %s, %s, %s %n", ("Bun: " + getBun()), ("Meat: " + getMeat()), ("Cheese: " + getCheese()), ("Veggies: " + getVeggies()), ("Mayo: " + getMayo()));
    }
}
