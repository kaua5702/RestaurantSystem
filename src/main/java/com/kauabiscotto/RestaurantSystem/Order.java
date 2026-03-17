package com.kauabiscotto.RestaurantSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Order {

    private List<Dish> dishList;
    private int idOrder;

    public Order () {
        this.dishList = new ArrayList<>();
        this.idOrder = new Random().nextInt(1000);
    }

    public List<Dish> getDishList() {
        return dishList;
    }

    public int getIdOrder() {
        return idOrder;
    }

    public void adicionarPrato(Dish dish) {
        dishList.add(dish);
    }

    public double calcularTotal() {
        double total = 0;
        for (Dish dish : dishList) {
            total += dish.getPrice();
        }
        return total;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order ID: ").append(idOrder).append("\n");
        sb.append("Pratos:\n");
        for (Dish dish : dishList) {
            sb.append(" - ").append(dish.toString()).append("\n");
        }
        sb.append("Total: R$ ").append(calcularTotal());
        return sb.toString();
    }

}
