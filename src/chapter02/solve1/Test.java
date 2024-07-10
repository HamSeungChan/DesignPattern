package chapter02.solve1;

public class Test {
    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData();
        Display1 display1 = new Display1(weatherData);
        Display2 display2 = new Display2(weatherData);

        weatherData.measurementsChange(1, 2, 3);
        weatherData.measurementsChange(4, 5, 6);
        weatherData.measurementsChange(1, 2, 3);

    }
}
