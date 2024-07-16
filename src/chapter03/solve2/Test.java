package chapter03.solve2;

public class Test {
    public static void main(String[] args) {

        Beverage newBeverage = new Mocha(new Whip(new DarkRoast()));
        System.out.println(newBeverage.getDescription());
        System.out.println(newBeverage.cost());

    }
}
