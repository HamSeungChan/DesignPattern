package chapter03.solve2;

public class Mocha extends CondimentDecorator {

    // 감싸고자 하는 음료를 저장하는 인스턴스 변수
    // 인스턴스 변수를 감싸고자 하는 객체로 설정하는 생성자
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 모카";
    }

    @Override
    public int cost() {
        return beverage.cost() + 5;
    }
}
