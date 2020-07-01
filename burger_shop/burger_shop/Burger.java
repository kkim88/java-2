package burger_shop;

import java.util.ArrayList;

abstract public class Burger {

    // properties

    String bread; // type of bread
    String meat; // type of meat
    String name; // name of burger (Plain, Healthy, Deluxe)
    final ArrayList<String> possibleToppings; // valid toppings for burger type
    ArrayList<String> burgerToppings; // ArrayList of current toppings for a burger
    final int maxToppings; // maximum toppings a burger can have
    final double plainPrice; // price of a plain burger without toppings
    final double basePrice; // base price for burger type
    final double toppingPrice; // total price of added toppings

    // constructor

    Burger(String name, String bread, String meat, ArrayList<String> toppings, ArrayList<String> burgerToppings,
           int maxToppings, double basePrice) {
        this.name = name;

        // bread input

        if (burger_shop.Bread.bread.contains(bread)) {
            this.bread = bread;
        }
        else {
            throw new Error(bread + " is not an option. Options are " + burger_shop.Bread.bread + ".");
        }

        // meat input

        if (burger_shop.Meat.meat.contains(meat)) {
            this.meat = meat;
        }
        else {
            throw new Error(meat + " is not an option. Options are " + burger_shop.Meat.meat + ".");
        }
        this.possibleToppings = toppings;
        this.burgerToppings = burgerToppings;
        this.maxToppings = maxToppings;
        this.basePrice = basePrice;
        this.plainPrice = 5.00;
        this.toppingPrice = 0.15;
    }

    // method to return price of a plain burger

    double plainBurgerPrice() {
        return this.plainPrice;
    }

    // method to return price per topping

    double getPerToppingPrice() {
        return this.toppingPrice;
    }

    // method to return total burger price

    double totalBurgerPrice() {
        return this.basePrice + (this.toppingPrice * this.burgerToppings.size());
    }
    void showBurger() {
        if (burgerToppings.size() > 0) {
            System.out.println(name + "burger with " + bread + " bread, a " + meat + " patty and " + burgerToppings +
                    " toppings is: $" + totalBurgerPrice() + ".");
        }
        else {
            System.out.println(name + " burger with " + bread + " bread, a " + meat + " patty and no toppings is: $"
                    + totalBurgerPrice() + ".");
        }
    }
}
