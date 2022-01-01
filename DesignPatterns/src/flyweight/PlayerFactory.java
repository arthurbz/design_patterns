package flyweight;

import java.util.HashMap;

/*
 * This class returns the player (Player object)
 * If one of them already exists, it returns that one
 * Otherwise, it creates a new one
 */

public class PlayerFactory {
	/* The HashMap stores the instances of player (CT or T) */
    private static HashMap <String, Player> hm = new HashMap<String, Player>();

    public static Player getPlayer(String type) {
        Player player = null;

        /* If CT or T already has been created it returns that one */
        if (hm.containsKey(type)) {
            player = hm.get(type);
        } else {
        	/* Create CT or T object */
            switch(type) {

            case "Terrorist":
                System.out.println("\nT Created");
                player = new Terrorist();
                break;

            case "CounterTerrorist":
                System.out.println("\nCT Created");
                player = new CounterTerrorist();
                break;

            default:
                System.out.println("Not defined");
            }
  
            /* Add to HashMap after creating */
            hm.put(type, player);
        }

        return player;
    }
}
