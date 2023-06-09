package src.FactoryPattern.PizzaStore;

import src.FactoryPattern.Pizza.NYCheesePizza;
import src.FactoryPattern.Pizza.Pizza;

public class NYPizzaStore extends PizzaStore {

    /**
     *  Individual Pizza stores takes care of object creation.
     *  For adding a new store, all we have to do is implement new store and create crazy new pizzas.
     */
    @Override
    protected Pizza createPizza(String type) {
        if(type.equals("Cheese")) {
            return new NYCheesePizza();
        }
        else {
            return null;
        }
    }
}
