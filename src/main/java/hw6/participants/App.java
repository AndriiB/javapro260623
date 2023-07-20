package hw6.participants;

public class App {
    public static void main(String[] args) {
        Participant[] participants = {
                new Human("Human", 600, 20),
                new Cat("Cat", 10000, 1),
                new Robot("Robot", 20000, 50)
        };

        Obstacle[] obstacles = {
                new Treadmill(500),
                new Wall(2),
                new Treadmill(5000),
                new Wall(2000),

        };


        for (Participant participant : participants) {
            for (Obstacle obstacle : obstacles) {
                obstacle.overcome(participant);
                if (!participant.proceed()) break;
            }
        }
    }
}

