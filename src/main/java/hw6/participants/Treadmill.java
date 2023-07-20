package hw6.participants;

public class Treadmill implements Obstacle {

    private final int distance;

    public Treadmill(int distance) {
        this.distance = distance;
    }

    @Override
    public void overcome(Participant participant) {
        if (participant.proceed()) {
            participant.run(distance);
        }
    }
}
