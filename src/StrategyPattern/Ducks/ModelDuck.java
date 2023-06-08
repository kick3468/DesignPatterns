package src.StrategyPattern.Ducks;

import src.StrategyPattern.behaviours.FlyNoWay;
import src.StrategyPattern.behaviours.Quack;

public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a model Ducks.Duck!!!");
    }
}
