package chapter04.solve2;

/*
*   새로운 상황 : 피자 지점을 늘린다 -> 시카고, 뉴욕 피자
*               시가코 피자 스타일의 치즈피자, 페퍼로피 피자
*               뉴욕 피자 스타일의 치즈피자, 페퍼로니 피자
*               ->> SimplePizzaFactory 를 대신해 새로운 팩토리 클래스를 2개 생성
* */

public class PizzaStore {

    SimplePizzaFactory factory;

    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    public Pizza orderPizza(String type) {

        Pizza pizza;

        pizza = factory.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
