package chapter07.adaptor;

// 클라이언트에서 원하는 인터페이스를 구현
public class TurkeyAdapter implements Duck {

    // 기존 형식의 객체 래퍼런스
    private Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        for (int i = 0; i < 5; i++) {
            turkey.fly();
        }
    }
}
