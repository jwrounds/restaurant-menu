package restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    protected ArrayList<MenuItem> menuItems = new ArrayList<>();
    private String lastUpdated;

    public void addMenuItem(MenuItem item) {
        if (!menuItems.contains(item)) {
            menuItems.add(item);
        }
        lastUpdated = new Date().toString();
    }
    public void removeMenuItem(MenuItem item) {
        menuItems.remove(item);
        lastUpdated = new Date().toString();
    }

    public String toString() {
        StringBuilder str = new StringBuilder("\n***MENU***\n");
        for (MenuItem item : menuItems) {
            str.append(item.toString()).append("\n***\n");
        }
        return str.toString();
    }

    public void printItem(String itemName) {
        for (MenuItem item : menuItems) {
            if (item.getName().equals(itemName)) {
                System.out.println(item);
            }
        }
    }

    public String getLastUpdated() { return lastUpdated; }
    public void setLastUpdated() { lastUpdated = new Date().toString(); }
}
