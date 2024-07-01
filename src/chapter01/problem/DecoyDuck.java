package chapter01.problem;

// DecoyDuck 은 날지도 소리를 내지도 못한다.
public class DecoyDuck extends Duck{

    @Override
    public void quack() {
        System.out.println("나는 소리를 내지 못하는 Duck");
    }

    @Override
    public void fly() {
        System.out.println("나는 날지 못하는 Duck"); // 중복되는 코드 발생
    }

    @Override
    public void display() {
        System.out.println("DecoyDuck의 모습");
    }
}
