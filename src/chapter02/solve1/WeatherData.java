package chapter02.solve1;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {

    private int x;
    private int y;
    private int z;

    // 등록되는 옵저버 객체들을 저장하는 List
    private final List<Observer> observers;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    public void measurementsChange(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
        notifyObservers();
    }

    // 옵저버 등록
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    // 옵저버 해제
    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    // 상태 변화에 따른 알림
    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(x, y, z);
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }
}
