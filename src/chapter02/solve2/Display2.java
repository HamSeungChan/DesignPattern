package chapter02.solve2;

public class Display2 implements Observer, Display {


    private int x;
    private int z;
    private final WeatherData weatherData;

    public Display2(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("display 2입니당!");
    }

    @Override
    public void update() {
        this.x = weatherData.getX();
        this.z = weatherData.getZ();
        display();
    }

}
