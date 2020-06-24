package burger_shop;

public class HealthBurger extends burger_shop.Burger {

    private String healthTopping3Name;
    private Double healthTopping3Price;

    private String healthTopping4Name;
    private Double healthTopping4Price;

    // Healthy burger constructor

    public HealthBurger (String meat) {
        super("Healthy", "Rye", meat, 6.25);
    }

    // methods to add Healthy burger toppings

    public void addHealthTopping3 (String name, double price) {
        this.healthTopping3Name = name;
        this.healthTopping3Price = price;

        // exception to prevent unhealthy toppings

        try {
            boolean isHealthy = true;
        }
        catch(Exception e) {
            System.out.println("This topping is not allowed for healthy burgers.");
        }
    }

    public void addHealthTopping4 (String name, double price) {
        this.healthTopping4Name = name;
        this.healthTopping4Price = price;

        // exception to prevent unhealthy toppings

        try {
            boolean isHealthy = true;
        }
        catch(Exception e) {
            System.out.println("This topping is not allowed for healthy burgers.");
        }
    }

    // override for total price method

    @Override
    public double totalBurgerPrice() {
        double burgerPrice = super.totalBurgerPrice();
        if (this.healthTopping3Name != null) {
            burgerPrice += this.healthTopping3Price;
            System.out.println("Plus " + this.healthTopping3Name + " + $" + healthTopping3Price);
        }
        if (this.healthTopping4Name != null) {
            burgerPrice += this.healthTopping4Price;
            System.out.println("Plus " + this.healthTopping4Name + " + $" + healthTopping4Price);
        }

        return burgerPrice;

    }
}
