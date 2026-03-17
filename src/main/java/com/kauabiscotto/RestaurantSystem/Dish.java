package com.kauabiscotto.RestaurantSystem;

public class Dish {

    private String name;
    private Double price;

    public Dish(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Prato: " + name + " | Preço: R$ " + price;
    }
}
