package com.cfjofre.patterndesign.simplefactory;

public class CaliforniaPizzaStore  extends PizzaStore{

    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;

        pizza = switch (type) {
            case "cheese" -> new CaliforniaStyleCheesePizza();
            case "pepperoni" -> new CaliforniaStylePeperoniPizza();
            case "clam" -> new CaliforniaStyleClamPizza();
            case "vegie" -> new CaliforniaStyleVegiePizza();
            default -> null;
        };

        return pizza;
    }
    
}
