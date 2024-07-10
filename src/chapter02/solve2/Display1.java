package chapter02.solve2;

public class Display1 implements Display, Observer {

    private int x;
    private int y;

    // weatherData 래퍼런스를 미리 저장해 놓으면 나중에 옵저버 목록에서 탈퇴할 때 유용하게 사용이 가능하다.
    private final WeatherData weatherData;

    public Display1(WeatherData weatherData) {
        this.weatherData = weatherData;
        // 생성자를 통해서 Observer 로 등록한다.
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("display 1입니당!");
    }

    @Override
    public void update() {
        this.x = weatherData.getX();
        this.y = weatherData.getY();
        display();
    }
}
