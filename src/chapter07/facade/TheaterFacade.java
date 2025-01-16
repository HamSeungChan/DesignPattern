package chapter07.facade;

public class TheaterFacade {

    private Amp amp;
    private Food food;
    private Light light;
    private Projector projector;
    private Screen screen;
    private Tuner tuner;


    public TheaterFacade(Amp amp, Food food, Light light, Projector projector, Screen screen, Tuner tuner) {
        this.amp = amp;
        this.food = food;
        this.light = light;
        this.projector = projector;
        this.screen = screen;
        this.tuner = tuner;
    }

    public void watchMovie(String movie) {

        System.out.println("영화 볼 준비 중");
        amp.method1();
        light.method3();
        projector.method2();
        tuner.method1();
        screen.method2();

    }


}
