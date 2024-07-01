package chapter01.solve3.duck;

import chapter01.solve3.fly.FlyNoWay;
import chapter01.solve3.quack.Squeak;

public class RubberDuck extends Duck {


    public RubberDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
    }

    @Override
    public void display() {
        System.out.println("RubberDuck 모습");
    }

}
