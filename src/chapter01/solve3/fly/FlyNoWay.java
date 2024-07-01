package chapter01.solve3.fly;

public class FlyNoWay implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("저는 날지 않아요 !!");
    }
}
