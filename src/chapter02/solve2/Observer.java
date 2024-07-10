package chapter02.solve2;

public interface Observer {

    // 기존 push 방식에서는 int k 를 추가하면서 모든 observer 의 코드에서 수정이 발생
    void update();

}
