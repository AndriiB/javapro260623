package hw5;

public class SpaceShip {
    private final NameType name;
    private final DestinationType destination;
    private final int crew;

    private SpaceShip(NameType name, DestinationType destination, int crew) {
        this.name = name;
        this.destination = destination;
        this.crew = crew;
    }

    public static SpaceShipBuilder builder() {
        return new SpaceShipBuilder();
    }

    public NameType getName() {
        return name;
    }

    public DestinationType getDestination() {
        return destination;
    }

    public int getCrew() {
        return crew;
    }
    @Override
    public String toString() {
        return "SpaceShip{" +
                "name=" + name +
                ", destination=" + destination +
                ", crew=" + crew +
                '}';
    }

    public static class SpaceShipBuilder {
    private NameType name;
    private DestinationType destination;
    private int crew = 2;

    public SpaceShip build() {
        return new SpaceShip(this.name, this.destination, this.crew);
    }

    private SpaceShipBuilder(){

    }

    public SpaceShipBuilder name(NameType name) {
        this.name = name;
        return this;
    }

    public SpaceShipBuilder destination(DestinationType destination) {
        this.destination = destination;
        return this;
    }

        public SpaceShipBuilder crew(int crew) {
            this.crew = crew;
            return this;
        }
}

public enum NameType {
    ORBITER, SURVEYOR
}

public enum DestinationType {
    MARS, JUPITER
   }
}
