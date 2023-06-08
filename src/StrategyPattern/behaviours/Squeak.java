package src.StrategyPattern.behaviours;

public class Squeak implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("src.StrategyPattern.behaviours.Squeak");
    }
}
