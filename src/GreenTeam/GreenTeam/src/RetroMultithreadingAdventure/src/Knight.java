package GreenTeam.GreenTeam.src.RetroMultithreadingAdventure.src;

import java.util.Random;

public class Knight extends Thread {
    //override the run method. It will define the characters actions during the game
    //create unique storyline for each character
    //use thread.sleep to introduce delays between actions 
     public void run() {
        System.out.println("The brave Knight sets out on a quest to slay the dragon!");
        Random rand = new Random();
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Knight: Step " + i);
                Thread.sleep(rand.nextInt(1000) + 500);
            }
        } catch (InterruptedException e) {
            System.err.println("Knight's adventure was interrupted!");
        }
        System.out.println("The Knight returns victorious!");
    }

}
