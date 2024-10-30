package chapter06;

// Light 객체를 조정하는 LightOnCommand 클래스
// 메소드는 Execute 하나이다.
public class LightOnCommand implements Command {

    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    // execute 를 호출하면
    // light 인스턴스의 on()이 실행된다.
    // 작업을 요청하는 쪽과 처리하는 곳을 분리할 수 있다!!
    @Override
    public void execute() {
        light.on();
    }
}
