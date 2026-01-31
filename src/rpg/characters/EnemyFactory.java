package rpg.characters;

import java.util.Random;

public class EnemyFactory {

    private static Random random = new Random();

    public static Enemy generateRandomEnemy(int playerLevel) {
        int roll = random.nextInt(3);

        switch (roll) {
            case 0:
                return new Enemy("Goblin", 30 + playerLevel * 5, 5 + playerLevel, 2 + playerLevel, playerLevel, 20);
            case 1:
                return new Enemy("Wolf", 25 + playerLevel * 4, 6 + playerLevel, 1 + playerLevel, playerLevel, 18);
            default:
                return new Enemy("Bandit", 35 + playerLevel * 6, 7 + playerLevel, 3 + playerLevel, playerLevel, 25);
        }
    }
}
