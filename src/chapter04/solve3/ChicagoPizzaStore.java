package chapter04.solve3;

import chapter04.solve3.chicago.ChicagoCheesePizza;
import chapter04.solve3.chicago.ChicagoClamPizza;
import chapter04.solve3.chicago.ChicagoPepperoniPizza;
import chapter04.solve3.chicago.ChicagoVeggiePizza;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String type) {

        if (type.equals("cheese")) {
            return new ChicagoCheesePizza();
        } else if (type.equals("veggie")) {
            return new ChicagoVeggiePizza();
        } else if (type.equals("pepperoni")) {
            return new ChicagoPepperoniPizza();
        } else if (type.equals("clam")) {
            return new ChicagoClamPizza();
        }
        return null;
    }
}
