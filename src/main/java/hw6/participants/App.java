package hw6.participants;

public class App {
    public static void main(String[] args) {
        Participant[] participants = {
                new Human("Human", 6700, 2000),
                new Cat("Cat", 100, 300),
                new Robot("Robot", 200, 5000)
        };

        Obstacle[] obstacles = {
                new Treadmill(500),
                new Wall(2),

        };


        for (Participant participant : participants) {
            for (Obstacle obstacle : obstacles) {
                obstacle.overcome(participant);
            }
        }
    }
}

