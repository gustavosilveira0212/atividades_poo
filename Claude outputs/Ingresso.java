package atividade5model.entities;

public class Ingresso {
    private String filme;
    private double valor;

    public Ingresso(String filme, double valor) {
        this.filme = filme;
        this.valor = valor;
    }

    // Método 1: Retorna o valor sem desconto
    public double calcularValor() {
        return valor;
    }

    // Método 2: Retorna o valor com desconto percentual
    public double calcularValor(double percentualDesconto) {
        return valor - (valor * percentualDesconto / 100);
    }

    // Método 3: Retorna o valor com desconto fixo
    public double calcularValor(double desconto, boolean descontoFixo) {
        if (descontoFixo) {
            return valor - desconto;
        }
        return valor;
    }

    public String getFilme() {
        return filme;
    }

    public double getValor() {
        return valor;
    }
}
