package hw8.competition;

public record Wall(int height) implements Obstacle {

    @Override
    public boolean overcome(Participant participant) {
        return participant.getMaxJump() > this.height;
    }

    @Override
    public String toString() {
        return " Wall height = " + height + ". " ;
    }
}
