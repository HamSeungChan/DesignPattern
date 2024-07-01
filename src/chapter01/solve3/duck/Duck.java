package chapter01.solve3.duck;

import chapter01.solve3.fly.FlyBehavior;
import chapter01.solve3.quack.QuackBehavior;

public abstract class Duck {


//   인터페이스 형식의 인스턴스 변수
//  이 변수에 특정 형식의 래퍼런스를 다형적으로 설정
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;


    public void swim() {
        System.out.println("헤엄");
    }

    public void display() {
        System.out.println("Duck의 생김새");
    }


    // 행동을 위임한다 !
    public void performQuack() {
        quackBehavior.quack();
    }

    public void performFly() {
        flyBehavior.fly();
    }

    // 기타 오리 관련 메소드

}
