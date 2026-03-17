# 🍽️ Restaurant System

Um sistema simples em Java para simular o funcionamento de um restaurante, utilizando conceitos de **Programação Orientada a Objetos (POO)** como encapsulamento, composição e uso de coleções.

---

## 📌 Estrutura do Projeto

O sistema é composto por três classes principais:

- **Dish (Prato)**  
  Representa um prato do restaurante, com nome e preço.

- **Order (Pedido)**  
  Contém uma lista de pratos, calcula o total da conta e organiza os pedidos.

- **Waiter (Garçom)**  
  Gerencia os pedidos atendidos, possui um identificador único e mantém histórico dos pedidos.

Além disso, há uma classe **Main** que permite interação com o usuário via entrada de dados.

---

## 🚀 Funcionalidades

- Criar pratos com nome e preço.  
- Criar pedidos e adicionar pratos.  
- Calcular o valor total de um pedido.  
- Criar garçons com ID aleatório.  
- Registrar pedidos em um garçom.  
- Listar todos os pedidos atendidos por um garçom.  
- Entrada de dados pelo teclado com confirmações em cada etapa.

---

## 🛠️ Tecnologias Utilizadas

- **Java 17+**  
- **Coleções (ArrayList)**  
- **POO (Encapsulamento, Composição, Sobrescrita de métodos)**  

---

## 📖 Exemplo de Uso

### Entrada do usuário:
Digite o nome do garçom: Carlos
Pedido criado com ID: 742
Quantos pratos deseja registrar? 2
Nome do prato 1: Pizza 
Preço do prato 1: 30
Nome do prato 2: Suco
Preço do prato 2: 8

--

### Saída esperada:

Garçom criado com sucesso:

Waiter: Carlos

ID: 123  

Pedidos atendidos: 0

Pedido criado com ID: 742

Prato registrado: 

Prato: Pizza

Preço: R$ 30.0

Prato registrado: 

Prato: Suco

Preço: R$ 8.0 

Pedido 742 registrado pelo garçom Carlos

--



Resumo do garçom: Waiter: Carlos | ID: 123 | Pedidos atendidos: 1



--

Pedidos atendidos:

Order ID: 742

Pratos:

- Prato: Pizza  Preço: R$ 30.0
- Prato: Suco  Preço: R$ 8.0 Total: R$ 38.0

## 📂 Organização das Classes


RestaurantSystem/ │ 
├── Dish.java  # Classe que representa um prato 
├── Order.java # Classe que representa um pedido 
├── Waiter.java # Classe que representa um garçom 
└── Main.java # Classe principal com entrada de dados

## 🎯 Objetivo

Esse projeto foi desenvolvido como exercício para praticar:
- Criação de classes e objetos em Java.  
- Uso de listas para armazenar dados.  
- Aplicação de boas práticas de POO.  
- Interação com o usuário via console.  

---


