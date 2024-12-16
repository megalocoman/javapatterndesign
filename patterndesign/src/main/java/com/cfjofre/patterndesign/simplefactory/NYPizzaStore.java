package com.cfjofre.patterndesign.simplefactory;

import com.cfjofre.patterndesign.simplefactory.ingredients.NYPizzaIngredientFactory;

public class NYPizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String type) {

        Pizza pizza = null;

        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        switch (type) {
            case "cheese": {
                pizza = new CheesePizza(ingredientFactory);
                pizza.setName("New York City cheese Pizza");
            } ;
            case "pepperoni": {
                pizza = new Peperonipizza();
                pizza.setName("New York City pepperoni Pizza");

            } ;
            case "clam" : {
                pizza = new ClamPizza(ingredientFactory);
                pizza.setName("New York City clam Pizza");
            };
            case "veggie" : {
                pizza = new VegiePizza(ingredientFactory);
                pizza.setName("New York City veggie Pizza");
            };
            default : pizza = null;
        }
        ;

        return pizza;

    }

}
