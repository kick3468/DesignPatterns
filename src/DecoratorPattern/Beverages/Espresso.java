package src.DecoratorPattern.Beverages;

import src.DecoratorPattern.Beverage;

public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
