package src.StrategyPattern.behaviours;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I am Fly with wings!!!");
    }
}
