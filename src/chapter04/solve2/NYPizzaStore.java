package chapter04.solve2;

import chapter04.solve2.ny.NYCheesePizza;
import chapter04.solve2.ny.NYClamPizza;
import chapter04.solve2.ny.NYPepperoniPizza;
import chapter04.solve2.ny.NYVeggiePizza;

public class NYPizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String type) {

        if (type.equals("cheese")) {
            return new NYCheesePizza();
        } else if (type.equals("veggie")) {
            return new NYVeggiePizza();
        } else if (type.equals("pepperoni")) {
            return new NYPepperoniPizza();
        } else if (type.equals("clam")) {
            return new NYClamPizza();
        }
        return null;
    }
}
