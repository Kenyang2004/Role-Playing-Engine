package rpg.characters;

public abstract class Character {
    protected String name;
    protected int maxHealth;
    protected int currentHealth;
    protected int attack;
    protected int defense;
    protected int level;


    //Constructor
    public Character(String name, int maxHealth, int attack, int defense, int level) {
        this.name = name;
        this.maxHealth = maxHealth;
        this.currentHealth = maxHealth;
        this.attack = attack;
        this.defense = defense;
        this.level = level;

    }

    //Method
    public boolean isAlive() {
        return currentHealth > 0;
    }

    public void takeDamage(int amount) {
        currentHealth -= amount;
        if (currentHealth < 0) {
            currentHealth = 0; //Reset to 0 
        }
    }
    
    public String getName() {
        return name;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public int getCurrentHealth() {
        return currentHealth;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }

    public int getLevel() {
        return level;
    }

    public abstract void levelUp();
    


}