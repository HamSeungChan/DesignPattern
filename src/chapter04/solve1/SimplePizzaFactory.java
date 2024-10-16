package chapter04.solve1;

// 팩토리 : 객체 생성을 처리하는 클래스
// 클라이언트의 요청(pizzaStore)을 받고 객체 인스턴스를 생성해서 전달해준다.
// 장점 : pizza 클래스를 생성을 요청하는 클라이언트가 많을 때, pizza의 변경이 필요할 때 팩토릴 클래스만 변경하면 된다.

public abstract class SimplePizzaFactory {

    public Pizza createPizza(String type) {

        Pizza pizza;

        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("veggie")) {
            pizza = new VeggiePizza();
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza();
        } else if (type.equals("clam")) {
            pizza = new ClamPizza();
        } else {
            pizza = new TrashPizza();
        }
        return pizza;
    }
}
