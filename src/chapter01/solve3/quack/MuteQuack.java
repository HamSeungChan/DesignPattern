package chapter01.solve3.quack;

public class MuteQuack implements  QuackBehavior{


    @Override
    public void quack() {
        System.out.println("아무 소리 없음");
    }
}
