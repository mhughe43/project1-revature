package kingdom;

import java.util.Random;
import java.util.Scanner;

public class Battle {

    public static void view() {
        KingdomPlayer kingdomPlayer = new KingdomPlayer();
        KingdomPlayer.newPlayer();
        EnemyKingdom enemyKingdom = new EnemyKingdom();
        Random random = new Random();
        int damage = random.nextInt(0, 100);
        Scanner sc = new Scanner(System.in);

        System.out.println("This is the BATTLEFIELD");
        System.out.println("1) CHARGE!!!!!");
        System.out.println("2) Draft more soldiers");
        System.out.println("0) RETREAT!");
        String input = sc.nextLine(); //what the user puts in the console

        switch (input) {
            case "1":
                int damageTaken = kingdomPlayer.health - damage;
                int damageGiven = enemyKingdom.health - damage;
                System.out.println();
                System.out.println();
                break;
            case "2":
                System.out.println();
                break;
            case "0":
                //running = false;
                break;
            default:
                System.out.println("INVALID INPUT");
                break;


        }
    }
}
