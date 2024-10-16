package chapter04.solve2;

/*
 *   새로운 상황 : 피자 지점을 늘린다 -> 시카고, 뉴욕 피자
 *               시가코 피자 스타일의 치즈피자, 페퍼로피 피자
 *               뉴욕 피자 스타일의 치즈피자, 페퍼로니 피자
 *               ->> SimplePizzaFactory 를 대신해 새로운 팩토리 클래스를 2개 생성
 * */


// pizza store 를 추상클래스로 변경
public abstract class PizzaStore {

    public Pizza orderPizza(String type) {

        Pizza pizza;

        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    // 추상 메소드 형식으로 팩토리 메소드 사용
    abstract Pizza createPizza(String type);

}
