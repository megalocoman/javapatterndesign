package com.cfjofre.patterndesign.simplefactory;

public class ChicagoPizzaStore extends PizzaStore{

    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;

        pizza = switch (type) {
            case "cheese" -> new ChicagoStyleCheesePizza();
            case "pepperoni" -> new ChicagoStylePeperoniPizza();
            case "clam" -> new ChicagoStyleClamPizza();
            case "vegie" -> new ChicagoStyleVegiePizza();
            default -> null;
        };

        return pizza;
    }
    
}
