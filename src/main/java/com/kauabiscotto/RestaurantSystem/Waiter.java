package com.kauabiscotto.RestaurantSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Waiter {

    private String name;
    private int idWaiter;
    private List<Order> orderList;

    public Waiter(String name) {
        this.name = name;
        this.idWaiter = new Random().nextInt(1000);
        this.orderList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getIdWaiter() {
        return idWaiter;
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void registrarPedido(Order order) {
        orderList.add(order);
    }

    public void listarPedidos() {
        for (Order order : orderList) {
            System.out.println(order.toString());
        }
    }

    @Override
    public String toString() {
        return "Waiter: " + name +
                " | ID: " + idWaiter +
                " | Pedidos atendidos: " + orderList.size();
    }
}