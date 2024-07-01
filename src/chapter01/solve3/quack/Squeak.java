package chapter01.solve3.quack;

public class Squeak implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("고무소리 삑삑");
    }
}
