package hw6.participants;

public class Wall implements Obstacle {

    private final int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public void overcome(Participant participant) {
        if (participant.proceed()) {
            participant.jump(height);
        }
    }
}
