package chapter03.solve2;

// Beverage 객체가 들어갈 자리에 들어갈 수 있어야 하므로 Beverage 클래스를 확장
public abstract class CondimentDecorator extends Beverage {

    // 각 데코레이터가 감쌀 음료를 나타내는 Beverage 객체를 여기서 지정
    // 어떤 음료든 갈쌀 수 있도록 Beverage 슈퍼 클래스를 유형을 사용
    Beverage beverage;

    // getDescription() 메소드를 새로 구현하도록 추상 메소드로
    public abstract String getDescription();

}
