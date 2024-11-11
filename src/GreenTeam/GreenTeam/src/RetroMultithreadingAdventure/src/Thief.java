package GreenTeam.GreenTeam.src.RetroMultithreadingAdventure.src;

import java.util.Random;

public class Thief extends Thread {
     public void run() {
        System.out.println("The brave Thief sets out to return the kingdom to peace!");
        Random rand = new Random();
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Thief: Step " + i);
                Thread.sleep(rand.nextInt(1000) + 500);
            }
        } catch (InterruptedException e) {
            System.err.println("The Thief was caught by the guards!");
        }
        System.out.println("The Thief brought peace!");
    }

}
