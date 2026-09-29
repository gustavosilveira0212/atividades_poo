package atividade5model.principal;

import atividade5model.entities.Ingresso;

public class Main {
    public static void main(String[] args) {
        Ingresso ingresso = new Ingresso("Homem Aranha", 50.00);

        // Sem desconto
        System.out.println("Filme: " + ingresso.getFilme());
        System.out.println("Valor normal: R$ " + ingresso.calcularValor());

        // Com desconto percentual (10%)
        System.out.println("Valor com 10% de desconto: R$ " + ingresso.calcularValor(10));

        // Com desconto fixo
        System.out.println("Valor com desconto fixo de R$ 15: R$ " + ingresso.calcularValor(15, true));
    }
}
