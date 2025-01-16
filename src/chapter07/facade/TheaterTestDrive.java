package chapter07.facade;

public class TheaterTestDrive {
    public static void main(String[] args) {

        Amp amp = new Amp();
        Light light = new Light();
        Projector projector = new Projector();
        Screen screen = new Screen();
        Food food = new Food();
        Tuner tuner = new Tuner();

        TheaterFacade theaterFacade = new TheaterFacade(amp, food, light, projector, screen, tuner);

        theaterFacade.watchMovie("재미있는 영화");

    }
}
