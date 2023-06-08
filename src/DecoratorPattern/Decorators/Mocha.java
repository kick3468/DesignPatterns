package src.DecoratorPattern.Decorators;

import src.DecoratorPattern.Beverage;
import src.DecoratorPattern.CondimentDecorator;

public class Mocha extends CondimentDecorator {

    private Beverage beverage;

    public Mocha(final Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return 0.20 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription().concat(", Mocha");
    }
}
