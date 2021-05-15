package restaurant;

public class MenuItem {
    private String name;
    protected double price;
    private String description;
    private String category;

    public MenuItem(String name, double price, String description, String category) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
    }

    public String toString() {
        return "Name: " + name + ", Price: $" + price + ", Category: " + category + "\nDescription: " + description;
    }

    public boolean equals(Object aComparison) {
        if (aComparison == this) {
            return true;
        }

        if (aComparison == null) {
            return false;
        }

        if (aComparison.getClass() != getClass()) {
            return false;
        }

        MenuItem aMenuItem = (MenuItem) aComparison;
        return aMenuItem.getName().equals(getName());
    }

    public String getName() { return name; }
    public void setName(String aName) { name = aName; }
    public double getPrice() { return price; }
    public void setPrice(double aPrice) { price = aPrice; }
    public String getDescription() { return description; }
    public void setDescription(String aDescription) { description = aDescription; }
    public String getCategory() { return category; }
    public void setCategory(String aCategory) { category = aCategory; }
}
