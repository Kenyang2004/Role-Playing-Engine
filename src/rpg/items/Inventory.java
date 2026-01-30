package rpg.items;
import java.util.ArrayList;

public class Inventory {
    private ArrayList<Item> items;  //Data fields

    //Construtcor 
    public Inventory() {
        items = new ArrayList<>();

    }
    
    //Add type(Item) items
    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    public void listItems() {
        if (items.isEmpty()) {
            System.out.println("Your inventory is empty. ");
        }

        System.out.println("Inventory: ");
        for (int i = 0; i < items.size(); i++) {
            System.out.println((i + 1) + ": " + items.get(i).getName()); //print (i+1) and items at i position with its name
        }
    }
    
    public Item getItem(int index) {
        if (index < 0 || index >= items.size()) {
            return null;
        }
        return items.get(index);
    }

    public int getSize() {
        return items.size();
    }
}
