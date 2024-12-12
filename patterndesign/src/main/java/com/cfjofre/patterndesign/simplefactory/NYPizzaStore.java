package com.cfjofre.patterndesign.simplefactory;

public class NYPizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String type) {

        Pizza pizza = null;

        pizza = switch (type) {
            case "cheese" -> new NYStyleCheesePizza();
            case "pepperoni" -> new NYStylePeperoniPizza();
            case "clam" -> new NYStyleClamPizza();
            case "vegie" -> new NYStyleVegiePizza();
            default -> null;
        };

        return pizza;

    }

}
