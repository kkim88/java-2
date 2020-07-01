package burger_shop;

import java.util.ArrayList;
import java.util.Arrays;

public class PlainBurger extends burger_shop.Burger {


    // plain burger constructor

    public PlainBurger (String bread, String meat) {
        super("Plain", bread, meat, new ArrayList<String>(Arrays.asList("ketchup", "mustard", "mayonnaise", "egg", "bacon", "cheese", "onions", "lettuce", "tomato", "pickles")), new ArrayList<String>(), 2, 5.00);

        this.bread = bread;
        this.meat = meat;

    }
}