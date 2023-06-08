package src.StrategyPattern.Ducks;

import src.StrategyPattern.behaviours.FlyBehavior;
import src.StrategyPattern.behaviours.QuackBehaviour;

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehaviour quackBehavior;

    public Duck() {

    }

    public void setFlyBehavior(FlyBehavior fb) {
        this.flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehaviour qb) {
        this.quackBehavior = qb;
    }

    public abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void swin() {
        System.out.println("All dicks float, even decoys!!!");
    }
}
