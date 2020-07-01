package burger_shop;

import java.util.ArrayList;
import java.util.Arrays;

public class Meal {

    // properties

    String name;
    String drink;
    String side;
    static ArrayList<String> mealSides;
    String burger;

    // constructor

    public Meal (String name, String drink, String side, String burger) {
        this.name = name;
        this.drink = drink;
        this.side = side;
        this.burger = burger;

        // ArrayList of possible drinks
        // No requirement for drinks to have a price. Free drinks, free refills.

        final ArrayList<String> possibleDrinks = new ArrayList(Arrays.asList("water", "soda", "diet soda", "root beer", "juice"));

        if (possibleDrinks.contains(drink)) {
            this.drink = drink;
        }
        else {
            throw new Error(drink + " is not available. Options are " + possibleDrinks + ".");
        }

        // prevent sides from exceeding 3

        if (mealSides.size() < 3) {
            mealSides.add(side);
        }
        else {
            throw new Error("Number of sides for a single meal cannot exceed 3.");
        }

        // default side to fries if no sides inputted

        if (side == null) {
            mealSides.add("fries");
        }

        // default to plain burger if no burger is inputted

        if (burger == null) {
            burger = "Plain";
        }

    }
}
