package burger_shop;

import java.util.ArrayList;

public class Order {

    String burger;
    String drink;
    String side;
    String name;
    ArrayList<String> burgerToppings;

    // first order constructor (burger, bread, meat)
    // this variation of order contains only a burger


    public Order (String name, String bread, String meat) {

        burger = name;

        // set to lowercase to cover proper capitalization, lowercase, all caps, and any number of "creative" capitalization.
        // is the same as addBurger() below

        burger.toLowerCase();

        if (burger == "plain") {

            burger_shop.PlainBurger burger = new burger_shop.PlainBurger(meat, bread);
        }
        else if (burger == "deluxe") {
            burger_shop.DeluxeBurger burger = new burger_shop.DeluxeBurger(meat, bread);
        }
        else if (burger == "healthy") {
            burger_shop.HealthBurger burger = new burger_shop.HealthBurger(meat, bread);
        }
        else {
            throw new Error("Invalid burger choice. Available burgers are Plain, Deluxe, or Healthy.");
        }

    }

    // second order constructor (meal)
    // this variation of order contains a meal (burger + drink + side)

    public Order (String meal, String drink, String side, String burger) {

        this.name = meal;
        this.drink = drink;
        this.side = side;
        this.burger = burger;

        new burger_shop.Meal(name, drink, side, burger);

    }

    // add toppings. accepts variable number of toppings.

    public void addToppings(String... toppings) {

        // must not exceed max topping size
        // include topping limit
        // can only accept valid toppings

        if (this.burger.isEmpty()) {
            System.out.println("Error: No burger exists.");
        }
        else {
            Burger burger = this.burger.get((burgerToppings.size() == 1 ? 0 : selectBurger(toppings))); // example code for testing, does not work because it needs selectBurger etc. don't want to copy
            if (burger.burgerToppings.size() + toppings.length > burger.maxToppings) {
                System.out.println("You can only put " + burger.maxToppings + " toppings on your " + burger.name + ".");
            }
            else {
                for (String topping : toppings) {
                    if (!burger.possibleToppings.contains(topping)) {
                        System.out.println(topping + " is not a valid topping. Valid toppings are: " + burger.possibleToppings);
                    }
                    else {
                        burger.burgerToppings.add(topping);
                        System.out.println(topping + " has been added to your " + burger.name + ".");
                    }
                }
            }
            System.out.println("Your " + burger.name + " has the following toppings: " + burger.burgerToppings);
        }
    }

    }
    public void addSides(String input) {

        side = input;

        if (burger_shop.Side.side.contains(side)) {
            burger_shop.Meal.mealSides.add(side);
        }
        else {
            throw new Error(side + " is not an available side. Available sides are: " + burger_shop.Side.side);
        }

    }

    public void addBurger(String name, String bread, String meat, ArrayList<String> toppings) {

        burger = name;


        // set to lowercase to cover proper capitalization, lowercase, all caps, and any number of "creative" capitalization.

        burger.toLowerCase();

        if (burger == "plain") {

            burger_shop.PlainBurger burger = new burger_shop.PlainBurger(meat, bread);
        }
        else if (burger == "deluxe") {
            burger_shop.DeluxeBurger burger = new burger_shop.DeluxeBurger(meat, bread);
        }
        else if (burger == "healthy") {
            burger_shop.HealthBurger burger = new burger_shop.HealthBurger(meat, bread);
        }
        else {
            throw new Error("Invalid burger choice. Available burgers are Plain, Deluxe, or Healthy.");
        }

    }

    // method to complete purchase (in spirit)

    public void purchaseOrder() {

        System.out.println("Order purchased!");
    }
}
