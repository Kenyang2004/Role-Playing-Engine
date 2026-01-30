package rpg.items;

public class Weapon extends Item {
    private int damageBonus;
    
    //Constructor
    public Weapon(String name, String description, int value, int damageBonus) {
        super(name, description, value);
        this.damageBonus = damageBonus;
    }

    public int getDamageBonus() {
        return damageBonus;
    }

    @Override
    public void use() {
        System.out.println("You have equipped the weapon " + name);
    }
    
}
