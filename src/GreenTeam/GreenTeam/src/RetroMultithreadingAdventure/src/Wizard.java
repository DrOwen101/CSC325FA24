package GreenTeam.GreenTeam.src.RetroMultithreadingAdventure.src;

import java.util.Random;

public class Wizard extends Thread {
     public void run() {
        System.out.println("The knowledgeable Wizard sets out on a quest to find the magic!");
        Random rand = new Random();
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Wizard: Step " + i);
                Thread.sleep(rand.nextInt(1000) + 500);
            }
        } catch (InterruptedException e) {
            System.err.println("The Wizard's adventure was interrupted!");
        }
        System.out.println("The Wizard found it!");
    }

}
