package com.cfjofre.patterndesign.simplefactory;

public class SimplePizzaFactory {

    public Pizza createPizza(String type) {
        Pizza pizza = null;

        pizza = switch (type) {
            case "cheese" -> new CheesePizza();
            case "pepperoni" -> new Peperonipizza();
            case "clam" -> new ClamPizza();
            case "vegie" -> new VegiePizza();
            default -> null;
        };

        return pizza;
    }
}
