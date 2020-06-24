package burger_shop;

public class Burger {

    // properties

    private String name;
    private String bread;
    private String meat;
    private double price;

    private String topping1Name;
    private Double topping1Price;

    private String topping2Name;
    private Double topping2Price;

    // constructor

    public Burger(String name, String bread, String meat, double price) {
        this.name = name;
        this.bread = bread;
        this.meat = meat;
        this.price = price;
    }

    // toppings methods

    public void addBurgerTopping1(String name, double price) {
        this.topping1Name = name;
        this.topping1Price = price;
    }

    public void addBurgerTopping2(String name, double price) {
        this.topping2Name = name;
        this.topping2Price = price;
    }

    // total price method

    public double totalBurgerPrice() {
        double burgerPrice = this.price;
        System.out.println(this.name + " burger on a " + this.bread + " roll and " +this.meat + " patty is: $" + this.price);
        if (this.topping1Name != null) {
            burgerPrice += this.topping1Price;
            System.out.println("Plus " + this.topping1Name + " + $" + this.topping1Price);
        }

        if (this.topping2Name != null) {
            burgerPrice += this.topping2Price;
            System.out.println("Plus " + this.topping2Name + ": + $" + this.topping2Price);
        }

        return burgerPrice;
    }

    // method to return plain burger with no toppings

    public double plainBurgerPrice() {
        return this.price;
    }
}
