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

    public String getLastUpdated() { return lastUpdated; }
    public void setLastUpdated() { lastUpdated = new Date().toString(); }
}
