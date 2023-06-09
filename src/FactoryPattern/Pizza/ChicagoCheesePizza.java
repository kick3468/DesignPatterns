package src.FactoryPattern.Pizza;

public class ChicagoCheesePizza extends Pizza {

    /**
     * Product objects are created by Inheritance
     */

    public ChicagoCheesePizza() {
        name = "Chicago deep dish style pizza";
        dough = "Extra thick crust";
        sauce = "Plum tomato Sauce";
        toppings.add("Shredded Mozzarella Cheese");
    }

    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
