package src.FactoryPattern.Pizza;

public class NYCheesePizza extends Pizza{
    public NYCheesePizza() {
        name = "NY Sauce and Cheese pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated Reggiano Cheese");
    }
}
