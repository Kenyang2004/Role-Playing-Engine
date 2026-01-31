package rpg.combat;

import rpg.characters.Enemy;
import rpg.characters.Player;

public class CombatEngine {
    
    public static void startBattle(Player player, Enemy enemy) {
        System.out.println("A wild " + enemy.getName() + " spawned!");

        while (player.isAlive() && enemy.isAlive()) {
            playerTurn(player, enemy);
            if (!enemy.isAlive()) {
                System.out.println("You have defeated " + enemy.getName() + "!");
                player.gainExperience(enemy.getExperienceReward());
                break;
            }

            enemyTurn(player, enemy);
            if (!player.isAlive()) {
                System.out.println("You have been defeated...");
                break;
            }

        }
    }
    

    private static void playerTurn(Player player, Enemy enemy) {
        System.out.println("You attack the " + enemy.getName() + "!");
        enemy.takeDamage(player.getAttack()); //Enemy take damage of player's attack value
    }
    
    private static void enemyTurn(Player player, Enemy enemy) {
        System.out.println(enemy.getName() + " attacked you!");
        player.takeDamage(enemy.getAttack());
    }
}
