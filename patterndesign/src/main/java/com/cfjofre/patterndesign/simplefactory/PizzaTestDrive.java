package com.cfjofre.patterndesign.simplefactory;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("juan ordered a "+ pizza.getName());

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("pedro ordered a " + pizza.getName());

    }
}
