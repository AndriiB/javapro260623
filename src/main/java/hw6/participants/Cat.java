package hw6.participants;

public class Cat implements Participant {
    private String name;
    private int maxRun;
    private int maxJump;


    public Cat(String name, int maxRun, int maxJump) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }

    @Override
    public void run(int distance) {

        if (distance <= maxRun) {
            System.out.println("Participant " + getName() + " passed obstacle treadmill of " + distance + " meters.");
        } else {
            System.out.println("Participant " + getName() + " could not pass treadmill obstacle of " + distance + " meters.");

        }
    }

    @Override
    public void jump(int height) {

        if (height <= maxJump) {
            System.out.println("Participant " + getName() + " passed a wall obstacle of " + height + " meters.");
        } else {
            System.out.println("Participant " + getName() + " could not passed a wall obstacle of " + height + " meters.");

        }
    }

    public String getName() {
        return name;
    }

    public int getMaxRun() {
        return maxRun;
    }

    public int getMaxJump() {
        return maxJump;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMaxRun(int maxRun) {
        this.maxRun = maxRun;
    }

    public void setMaxJump(int maxJump) {
        this.maxJump = maxJump;
    }
}
