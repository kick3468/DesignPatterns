package src.FactoryPattern.PizzaStore;

import src.FactoryPattern.Pizza.Pizza;

public abstract class PizzaStore {

    /**
     * Pizza store high level component does not depend on concrete implementation of Pizza (low level component)
     * High level component is decoupled with actual implementation of Pizza
     */
    public Pizza orderPizza(final String type) {
        Pizza pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    protected abstract Pizza createPizza(final String type);
}
