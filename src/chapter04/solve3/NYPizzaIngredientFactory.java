package chapter04.solve3;

import chapter04.solve3.ingredient.*;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory{

    @Override
    public Dough createDough() {
        System.out.println("크러스트 도우");
        return null;
    }

    @Override
    public Sauce createSauce() {
        System.out.println("마리아나 소스");
        return null;
    }

    @Override
    public Cheese createCheese() {
        System.out.println("레지아노 치즈");
        return null;
    }

    @Override
    public Veggies[] createVeggies() {
        System.out.println("마늘, 양파, 버섯, 고추");
        return new Veggies[0];
    }

    @Override
    public Pepperoni createPepperoni() {
        System.out.println("슬라이스한 페퍼로니");
        return null;
    }

    @Override
    public Clams createClam() {
        System.out.println("신선한 조개");
        return null;
    }
}
