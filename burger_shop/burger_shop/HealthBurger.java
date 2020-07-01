package burger_shop;

import java.util.ArrayList;
import java.util.Arrays;

public class HealthBurger extends burger_shop.Burger {

    // healthy burger constructor. "unhealthy" toppings are excluded and shouldn't be able to be added (in theory)

    public HealthBurger (String bread, String meat) {
        super("Healthy", bread, meat, new ArrayList<String>(Arrays.asList("ketchup", "mustard", "onions", "lettuce", "tomato", "pickles")), new ArrayList<String>(), 4, 7.25);

        this.bread = bread;
        this.meat = meat;
    }

}