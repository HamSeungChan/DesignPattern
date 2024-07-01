package chapter01.solve4;

import chapter01.solve4.duck.Duck;
import chapter01.solve4.duck.ModelDuck;
import chapter01.solve4.fly.FlyRocketPowered;

public class DuckTest {
    public static void main(String[] args) {

        Duck modelDuck = new ModelDuck();

        modelDuck.performFly();
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.performFly();

    }
}
