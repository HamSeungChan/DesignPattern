package chapter04.solve1;

public class PizzaStore {

    SimplePizzaFactory factory;

    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    public Pizza orderPizza(String type) {

        // 문제 상황 : 추상이 아닌 특정 클래스를 new 연산자를 통해 인스턴스를 직접 생성하고 있다.
        // 문제점 : 새로운 피자가 생성되거나, 기존 피자가 제거 되는 순간 코드 수정이 불가피하다
        //         OCP 즉 변경에는 닫혀있고, 확장에는 열려있어야 하는 규칙을 지기키 못함.
        // 해결방법 : 바뀌는 부분과 바뀌지 않는 부분을 찾아 분리시킨다.

        Pizza pizza;

//        객체를 생성하는 코드를 분리!!

//        if (type.equals("cheese")) {
//            pizza = new CheesePizza();
//        } else if (type.equals("veggie")) {
//            pizza = new VeggiePizza();
//        } else if (type.equals("pepperoni")) {
//            pizza = new PepperoniPizza();
//        } else if (type.equals("clam")) {
//            pizza = new ClamPizza();
//        } else {
//            pizza = new TrashPizza();
//        }

        pizza = factory.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
