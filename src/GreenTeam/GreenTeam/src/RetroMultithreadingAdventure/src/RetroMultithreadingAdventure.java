package GreenTeam.GreenTeam.src.RetroMultithreadingAdventure.src;

public class RetroMultithreadingAdventure {
    //this class is where you write the main for the rest of the project
    public static void main(String[] args) {
        Knight knight = new Knight();
        Wizard wizard = new Wizard();
        Thief thief = new Thief();

        knight.start();
        wizard.start();
        thief.start();

        try {
            knight.join();
            wizard.join();
            thief.join();
        } catch (InterruptedException e) {
            System.err.println("The adventure was interrupted!");
        }

        System.out.println("All characters have completed their adventures!");
    }

    
}
