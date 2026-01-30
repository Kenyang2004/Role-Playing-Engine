package rpg.characters;

import rpg.items.Inventory;

public abstract class Player extends Character {
    protected int experience;
    protected Inventory inventory;

    public Player(String name, int maxHealth, int currentHealth, int attack, int defense, int level) {
        super(name, maxHealth, attack, defense, level);
        this.experience = 0;
        this.inventory = new Inventory();
  }

    
  protected void gainExperience(int amount) {
      experience += amount;
      if (experience >= experienceToLevelUp()) {
          experience -= experienceToLevelUp();
          levelUp();
      }

  }

  protected int experienceToLevelUp() {
      return level * 100;
  }

  public Inventory getInventory() {
      return inventory;
  }

  public int getExperience() {
      return experience;
  }

  @Override
  public abstract void levelUp();
  
  
  


}
