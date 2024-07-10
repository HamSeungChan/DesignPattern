package chapter02.solve2;

public interface Subject {

    // observer 등록
    void registerObserver(Observer o);

    // observer 제거
    void removeObserver(Observer o);

    // 상태 변경 시 모든 옵저버에게 변경 내용을 알리기 위해 호출
    void notifyObservers();

}
