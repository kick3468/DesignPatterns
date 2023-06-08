package src.StrategyPattern;

import src.StrategyPattern.Ducks.Duck;
import src.StrategyPattern.Ducks.ModelDuck;
import src.StrategyPattern.behaviours.FlyRocketPowered;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
