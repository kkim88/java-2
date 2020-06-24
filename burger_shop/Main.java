package burger_shop;

public class Main {
    public static void main(String[] args) {
        //main execution of the burger shop goes here.  This is the "entry point" of your application

        // BELOW IS TEST CODE

        // Test code for plain burger + toppings

        // Create new burger

        burger_shop.Burger burger = new burger_shop.Burger("Plain", "White", "Beef", 4.50);

        // Add toppings

        burger.addBurgerTopping1("Lettuce", 0.74);
        burger.addBurgerTopping2("Mustard", 0.50);

        // Total price of plain burger + toppings

        System.out.println("Total price: $" + burger.totalBurgerPrice());

        // Test for plainBurgerPrice method

        System.out.println(burger.plainBurgerPrice());

        // Test for healthy burger + toppings

        burger_shop.HealthBurger healthBurger = new burger_shop.HealthBurger("Turkey");
        healthBurger.addBurgerTopping1("Egg", 2.00);
        healthBurger.addBurgerTopping2("Ketchup", 4.00);
        healthBurger.addHealthTopping3("Onions", 1.00);
        healthBurger.addHealthTopping4("Pickles", 0.80);

        // Test for healthy burger price

        System.out.println("Total Price: $" + healthBurger.totalBurgerPrice());

        // Test for deluxe burger + toppings

        burger_shop.DeluxeBurger deluxeBurger = new burger_shop.DeluxeBurger("Pretzel", "Steak");
        deluxeBurger.addBurgerTopping1("Mayonnaise", 0.90);
        deluxeBurger.addBurgerTopping2("Tomato", 0.75);
        deluxeBurger.addDeluxeTopping3("Butter", 0.35);
        deluxeBurger.addDeluxeTopping4("Bacon", 3.00);
        deluxeBurger.addDeluxeTopping5("Cheese", 1.50);
        deluxeBurger.addDeluxeTopping6("Avocado", 3.25);

        // Test for deluxe burger price

        System.out.println("Total Price: $" + deluxeBurger.totalBurgerPrice());
    }
}
