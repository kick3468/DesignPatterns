package src.StrategyPattern.Ducks;

import src.StrategyPattern.behaviours.FlyWithWings;
import src.StrategyPattern.behaviours.Quack;

public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I am real Mallard Ducks.Duck!!!");
    }
}
