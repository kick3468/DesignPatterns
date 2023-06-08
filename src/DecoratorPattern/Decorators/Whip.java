package src.DecoratorPattern.Decorators;

import src.DecoratorPattern.Beverage;
import src.DecoratorPattern.CondimentDecorator;

public class Whip extends CondimentDecorator {

    private final Beverage beverage;

    public Whip(final Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return 0.50 + this.beverage.cost();
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription().concat(", Whip");
    }
}
