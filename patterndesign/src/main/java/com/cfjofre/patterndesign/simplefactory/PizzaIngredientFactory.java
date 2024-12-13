package com.cfjofre.patterndesign.simplefactory;

import com.cfjofre.patterndesign.simplefactory.ingredients.Cheese;
import com.cfjofre.patterndesign.simplefactory.ingredients.Clams;
import com.cfjofre.patterndesign.simplefactory.ingredients.Dough;
import com.cfjofre.patterndesign.simplefactory.ingredients.Pepperoni;
import com.cfjofre.patterndesign.simplefactory.ingredients.Sauce;
import com.cfjofre.patterndesign.simplefactory.ingredients.Veggies;

public interface PizzaIngredientFactory {

    public Dough createDough();

    public Sauce createSauce();

    public Cheese createCheese();

    public Veggies[] createVeggies();

    public Pepperoni createPepperoni();

    public Clams createClams();

}
