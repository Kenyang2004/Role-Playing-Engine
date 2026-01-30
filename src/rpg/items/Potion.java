package rpg.items;

public class Potion extends Item {
    private int healAmount;

    public Potion(String name, String description, int value, int healAmount) {
        super(name, description, value);
        this.healAmount = healAmount;
    }

    public int getHealAmount(){
        return healAmount;
    }

    @Override
    public void use() {
        System.out.println("You have drank the potion and heal " + healAmount + " HP.");
    }
}
