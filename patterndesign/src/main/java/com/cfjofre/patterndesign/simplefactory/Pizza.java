package com.cfjofre.patterndesign.simplefactory;

import com.cfjofre.patterndesign.simplefactory.ingredients.Cheese;
import com.cfjofre.patterndesign.simplefactory.ingredients.Clams;
import com.cfjofre.patterndesign.simplefactory.ingredients.Dough;
import com.cfjofre.patterndesign.simplefactory.ingredients.Pepperoni;
import com.cfjofre.patterndesign.simplefactory.ingredients.Sauce;
import com.cfjofre.patterndesign.simplefactory.ingredients.Veggies;

public abstract class Pizza {

    String name;
    Dough dough;
    Sauce sauce;
    Veggies veggies[];
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clams;

    abstract void prepare();

    void bake() {
        System.out.println("Bake for 25 minutes at 350");
    };

    void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    };

    void box() {
        System.out.println("Place pizza in official PizzaStore box");
    };

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

}