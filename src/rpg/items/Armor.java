package rpg.items;

public class Armor extends Item {
    private int defenseBonus;

    //Constructor
    public Armor(String name, String description, int value, int defenseBonus) {
        super(name, description, value);
        this.defenseBonus = defenseBonus;

    }

    public int getDefenseBonus() {
        return defenseBonus;
    }

    @Override
    public void use() {
        System.out.println("You have equipped " + name);
    }
}
