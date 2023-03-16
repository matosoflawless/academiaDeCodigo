package org.academiadecodigo.bootcamp.concurrency.bqueue;

import java.util.Random;



import java.util.Random;

public class Pizza {

    private Topping pizzaServed;

    public Pizza() {
        int random = new Random().nextInt(Topping.values().length);
        pizzaServed = Topping.values()[random];
    }

    public String getTopping() {
        return pizzaServed.name() + " pizza";
    }

    public enum Topping {
        PEPPERONI,
        MARGHERITA
    }
}