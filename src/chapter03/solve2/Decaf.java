package chapter03.solve2;

public class Decaf extends Beverage {

    public Decaf() {
        description = "디카페인";
    }

    @Override
    public int cost() {
        return 0;
    }
}
