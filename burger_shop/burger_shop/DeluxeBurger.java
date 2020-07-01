package burger_shop;

import java.util.ArrayList;
import java.util.Arrays;

public class DeluxeBurger extends burger_shop.Burger {


    // deluxe burger constructor

    public DeluxeBurger (String bread, String meat) {
        super("Deluxe", bread, meat, new ArrayList<String>(Arrays.asList("ketchup", "mustard", "mayonnaise", "egg", "bacon", "cheese", "onions", "lettuce", "tomato", "pickles")), new ArrayList<String>(), 6, 6.50);

        this.bread = bread;
        this.meat = meat;

        }
}
