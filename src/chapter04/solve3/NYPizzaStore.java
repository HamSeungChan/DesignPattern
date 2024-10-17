package chapter04.solve3;

public class NYPizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String type) {

        Pizza pizza = null;
        PizzaIngredientFactory pizzaIngredientFactory = new NYPizzaIngredientFactory();

        if (type.equals("cheese")) {
            pizza = new CheesePizza(pizzaIngredientFactory);
        } else if (type.equals("clam")) {
            pizza = new ClamPizza(pizzaIngredientFactory);
        }

        return pizza;
    }
}
