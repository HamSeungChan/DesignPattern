package chapter03.solve2;

public abstract class Beverage {

    String description = "제목 없음";

    public String getDescription() {
        return description;
    }

    public abstract int cost();

}
