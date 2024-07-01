package chapter01.solve4.quack;

public class MuteQuack implements QuackBehavior {


    @Override
    public void quack() {
        System.out.println("아무 소리 없음");
    }
}
