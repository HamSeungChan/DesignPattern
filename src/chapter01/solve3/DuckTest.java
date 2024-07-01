package chapter01.solve3;

import chapter01.solve3.duck.Duck;
import chapter01.solve3.duck.MallardDuck;
import chapter01.solve3.duck.RubberDuck;

public class DuckTest {
    public static void main(String[] args) {

        Duck mallardDuck = new MallardDuck();
        mallardDuck.performFly();
        mallardDuck.performQuack();

        Duck rubberDuck = new RubberDuck();
        rubberDuck.performFly();
        rubberDuck.performQuack();


    }
}
