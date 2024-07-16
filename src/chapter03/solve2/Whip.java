package chapter03.solve2;

public class Whip extends CondimentDecorator {

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.description + ", 휘핑";
    }

    @Override
    public int cost() {
        return beverage.cost() + 3;
    }
}
