package chapter03.solve2;

public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "최고급 DarkRoast";
    }

    @Override
    public int cost() {
        return 100;
    }
}
