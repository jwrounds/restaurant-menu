package restaurant;

public class Main {

    public static void main(String[] args) {
	    Menu newMenu = new Menu();
	    MenuItem rickMac = new MenuItem("RickMac", 8.5, "A deep fried soft shell crab sandwiched between three buns with cheese and special sauce", "Sandwiches");
	    MenuItem macAndCheese = new MenuItem("Mac and Cheese", 3.5, "Creamy, rich, three cheese mac", "Sides");
	    MenuItem greens = new MenuItem("Collard Greens", 3, "Collard greens stewed with pork", "Sides");
	    MenuItem fries = new MenuItem("Grace Fries", 2.5, "Seasoned, crinkle cut fries", "Sides");
	    MenuItem milkShake = new MenuItem("Grace Milk Shake", 5.5, "Rich, creamy milk shake in vanilla, chocolate, or strawberry", "Drinks");

	    newMenu.addMenuItem(rickMac);
	    newMenu.addMenuItem(macAndCheese);
	    newMenu.addMenuItem(greens);
	    newMenu.addMenuItem(fries);
	    newMenu.addMenuItem(milkShake);

		System.out.println(newMenu);
		newMenu.printItem("RickMac");
		newMenu.removeMenuItem(greens);
		System.out.println(newMenu);
    }
}
