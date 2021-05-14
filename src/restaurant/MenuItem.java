package restaurant;

public class MenuItem {
    protected double price;
    private String description;
    private String category;

    public MenuItem(double price, String description, String category) {
        this.price = price;
        this.description = description;
        this.category = category;
    }

    public double getPrice() { return price; }
    public void setPrice(double aPrice) { price = aPrice; }
    public String getDescription() { return description; }
    public void setDescription(String aDescription) { description = aDescription; }
    public String getCategory() { return category; }
    public void setCategory(String aCategory) { category = aCategory; }
}
