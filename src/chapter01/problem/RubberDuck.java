package chapter01.problem;

public class RubberDuck extends Duck{

    @Override
    public void display() {
        System.out.println("RubberDuck 모습");
    }

    // Super Class에 fly() 메소드가 추가되어 날지 못하는 RubberDuck은 메소드 오버라이드
    @Override
    public void fly() {
        System.out.println("나는 날지 못하는 Duck");
    }
}
