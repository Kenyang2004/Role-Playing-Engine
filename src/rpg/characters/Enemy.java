package rpg.characters;

public class Enemy extends Character {
    private int experienceReward;

    //Constructor
    public Enemy(String name, int maxHealth, int currentHealth, int attack, int defense,
            int experienceReward) {
        super(name, maxHealth, attack, defense, experienceReward);
        this.experienceReward = experienceReward;
    }

    public int getExperienceReward() {
        return experienceReward;
    }

    @Override
    public void levelUp() {
        this.level++;
        this.maxHealth += 5;
        this.currentHealth = this.maxHealth;
        this.attack += 2;
        this.defense += 1;
    }


}
