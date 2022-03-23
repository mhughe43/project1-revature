package kingdom;

import java.util.Scanner;

public class KingdomPlayer {
    Boolean king = true;
    Boolean queen = true;
    int numOfKnights = 50;
    int citizens = 500;
    int health = 750;

    public static void newPlayer() {
        KingdomPlayer kingdomPlayer = new KingdomPlayer();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of your Kingdom: ");
        String kingdomName = sc.nextLine();

        System.out.println("Welcome to " + kingdomName + "!");

        System.out.println("Kingdom Stats:");
        System.out.println("Has a King " + kingdomPlayer.king);
        System.out.println("Has a Queen " + kingdomPlayer.queen);
        System.out.println("Number of Knights " + kingdomPlayer.numOfKnights);
        System.out.println("Number of Citizens " + kingdomPlayer.citizens);
        System.out.println("Kingdom " + kingdomName.toUpperCase() + "overall health " + kingdomPlayer.health);
    }

}

