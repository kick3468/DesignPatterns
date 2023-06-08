package src.StrategyPattern.behaviours;

public class Quack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("src.StrategyPattern.behaviours.Quack!!!");
    }
}
