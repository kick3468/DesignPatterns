package src.DecoratorPattern;

import src.DecoratorPattern.Beverages.Espresso;
import src.DecoratorPattern.Beverages.HouseBlend;
import src.DecoratorPattern.Decorators.Mocha;
import src.DecoratorPattern.Decorators.Soy;
import src.DecoratorPattern.Decorators.Whip;

public class StarbuzzCoffee {

    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        printBeverage(beverage);

        Beverage beverage1 = new HouseBlend();
        beverage1 = new Mocha(beverage1);
        beverage1 = new Soy(beverage1);
        beverage1 = new Whip(beverage1);
        printBeverage(beverage1);
    }

    private static void printBeverage(final Beverage beverage) {
        System.out.println("Beverage: " + beverage.getDescription() + ", Cost: $" + beverage.cost());
    }

}
