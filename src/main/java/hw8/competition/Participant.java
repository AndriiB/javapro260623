package hw8.competition;

public abstract class Participant {
    protected final int maxRun;
    protected final int maxJump;
    protected final String name;

    public Participant(int maxRun, int maxJump, String name) {
        this.maxRun = maxRun;
        this.maxJump = maxJump;
        this.name = name;
    }

    public abstract void run();
    public abstract void jump();

    public int getMaxRun() {
        return maxRun;
    }

    public int getMaxJump() {
        return maxJump;
    }

    public String getName() {
        return name;
    }
}
