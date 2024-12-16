package com.cfjofre.patterndesign.simplefactory;

public class VegiePizza extends Pizza {

    PizzaIngredientFactory ingredientFactory;

    public VegiePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    protected void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        veggies = ingredientFactory.createVeggies();

    }

}
