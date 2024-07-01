package chapter01.solve4.fly;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("저는 날지 않아요 !!");
    }
}
