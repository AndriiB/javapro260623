package hw8.competition;
public class Cat extends Participant {
    public Cat(int maxRun, int maxJump, String name) {
        super(maxRun, maxJump, name);
    }
    @Override
    public void run() {
        System.out.println("Run: " + maxRun);
    }

    @Override
    public void jump() {
        System.out.println("Jump: " + maxJump);
    }
}
