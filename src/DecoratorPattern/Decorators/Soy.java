package src.DecoratorPattern.Decorators;

import src.DecoratorPattern.Beverage;
import src.DecoratorPattern.CondimentDecorator;

public class Soy extends CondimentDecorator {

    private final Beverage beverage;

    public Soy(final Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return 0.66 + this.beverage.cost();
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription().concat(", Soy");
    }
}
