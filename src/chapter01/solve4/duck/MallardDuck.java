package chapter01.solve4.duck;

import chapter01.solve4.fly.FlyWithWings;
import chapter01.solve4.quack.Quack;

public class MallardDuck extends Duck {


    // 생성자를 통해 인스턴스 변수를 설정해 준다.
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("MallardDuck 만의 모양!");
    }
}
