package com.kauabiscotto.RestaurantSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Criando o garçom
        System.out.print("Digite o nome do garçom: ");
        String nomeGarcom = sc.nextLine();
        Waiter garcom = new Waiter(nomeGarcom);
        System.out.println("Garçom criado com sucesso: " + garcom);

        // Criando um pedido
        Order pedido = new Order();
        System.out.println("Pedido criado com ID: " + pedido.getIdOrder());

        // Adicionando pratos ao pedido
        System.out.print("Quantos pratos deseja registrar? ");
        int qtdPratos = sc.nextInt();
        sc.nextLine(); // consumir quebra de linha

        for (int i = 0; i < qtdPratos; i++) {
            System.out.print("Nome do prato " + (i+1) + ": ");
            String nomePrato = sc.nextLine();
            System.out.print("Preço do prato " + (i+1) + ": ");
            double precoPrato = sc.nextDouble();
            sc.nextLine(); // consumir quebra de linha

            Dish prato = new Dish(nomePrato, precoPrato);
            pedido.adicionarPrato(prato);
            System.out.println("Prato registrado: " + prato);
        }

        // Registrando pedido no garçom
        garcom.registrarPedido(pedido);
        System.out.println("Pedido " + pedido.getIdOrder() + " registrado pelo garçom " + garcom.getName());

        // Exibindo resumo
        System.out.println("\nResumo do garçom:");
        System.out.println(garcom);
        System.out.println("\nPedidos atendidos:");
        garcom.listarPedidos();

        sc.close();
    }
}