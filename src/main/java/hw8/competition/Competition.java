package hw8.competition;

import java.util.Arrays;

public class Competition {
public static void compete(Participant[] participants, Obstacle... obstacles) {
    for (Participant participant : participants) {
        boolean hasWon = true;
        int nextObstacle = 0;

        for (Obstacle obstacle : obstacles) {
            if (obstacle.overcome(participant)) {
                System.out.println("Participant " + participant.getName() + " has overcome" + obstacle + participant.getName() + " goes to the next obstacle >>>");
                System.out.println("__________________________________");
            } else {
                System.out.println("Participant " + participant.getName() + " couldn't overcome" + obstacle + " Obstacle has won.");
                break;
            }

            nextObstacle++;
            if (nextObstacle < obstacles.length) {
                System.out.println("Next obstacle: " + obstacles[nextObstacle]);
           }
       }
        System.out.println("End of competition for " + participant.getName());
        System.out.println("**********************************");
    }

   }

}