package hw8.competition;

public class App {
    public static void main(String[] args) {
        Obstacle[] obstacles = new Obstacle[10];
        int start = 10;
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0)
                obstacles[i] = new Wall(start);
            else
                obstacles[i] = new Run(start);
            start += 10;
        }

        Participant[] participants = {
                new Cat(100, 50, "Cat"),
                new Robot(120, 60, "Robot")
        };
        Competition.compete(participants, obstacles);
    }
}
