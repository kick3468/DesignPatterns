package src.FactoryPattern.PizzaStore;

import src.FactoryPattern.Pizza.ChicagoCheesePizza;
import src.FactoryPattern.Pizza.Pizza;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        if(type.equals("Cheese")) {
            return new ChicagoCheesePizza();
        }
        return null;
    }
}
