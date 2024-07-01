package chapter01.solve4.duck;

import chapter01.solve4.fly.FlyNoWay;
import chapter01.solve4.quack.Squeak;

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
