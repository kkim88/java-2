package burger_shop;

public class DeluxeBurger extends burger_shop.Burger {

    // deluxe toppings properties

    private String deluxeTopping3Name;
    private Double deluxeTopping3Price;

    private String deluxeTopping4Name;
    private Double deluxeTopping4Price;

    private String deluxeTopping5Name;
    private Double deluxeTopping5Price;

    private String deluxeTopping6Name;
    private Double deluxeTopping6Price;

    // deluxe burger constructor

    public DeluxeBurger (String bread, String meat) {
        super("Deluxe", bread, meat, 7.75);
    }

    // methods to add deluxe burger toppings

    public void addDeluxeTopping3 (String name, double price) {
        this.deluxeTopping3Name = name;
        this.deluxeTopping3Price = price;
    }

    public void addDeluxeTopping4 (String name, double price) {
        this.deluxeTopping4Name = name;
        this.deluxeTopping4Price = price;
    }

    public void addDeluxeTopping5 (String name, double price) {
        this.deluxeTopping5Name = name;
        this.deluxeTopping5Price = price;
    }

    public void addDeluxeTopping6 (String name, double price) {
        this.deluxeTopping6Name = name;
        this.deluxeTopping6Price = price;
    }

    // override for total price method

    @Override
    public double totalBurgerPrice() {
        double burgerPrice = super.totalBurgerPrice();
        if (this.deluxeTopping3Name != null) {
            burgerPrice += this.deluxeTopping3Price;
            System.out.println("Plus " + this.deluxeTopping3Name + " + $" + deluxeTopping4Price);
        }
        if (this.deluxeTopping4Name != null) {
            burgerPrice += this.deluxeTopping4Price;
            System.out.println("Plus " + this.deluxeTopping4Name + " + $" + deluxeTopping4Price);
        }
        if (this.deluxeTopping5Name != null) {
            burgerPrice += this.deluxeTopping3Price;
            System.out.println("Plus " + this.deluxeTopping5Name + " + $" + deluxeTopping5Price);
        }
        if (this.deluxeTopping6Name != null) {
            burgerPrice += this.deluxeTopping6Price;
            System.out.println("Plus " + this.deluxeTopping6Name + " + $" + deluxeTopping6Price);
        }

        return burgerPrice;

    }
}
