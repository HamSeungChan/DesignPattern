package chapter01.solve4.duck;

import chapter01.solve4.fly.FlyNoWay;
import chapter01.solve4.quack.Quack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }
}
