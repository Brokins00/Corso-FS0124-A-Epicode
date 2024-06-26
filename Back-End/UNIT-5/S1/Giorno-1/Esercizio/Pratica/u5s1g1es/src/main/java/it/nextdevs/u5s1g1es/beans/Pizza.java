package it.nextdevs.u5s1g1es.beans;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Pizza extends Product {
    private String name;
    private double price;
    private List<Topping> toppings;

    public Pizza(String name, double price, int calories, List<Topping> toppings) {
        super(calories, price);
        this.name = name;
        this.toppings = toppings;
    }

    public Pizza() {
    }
}
