package atividade5model.entities;

public class Ingresso {
    private String filme;
    private double valor;

    public Ingresso(String filme, double valor) {
        this.filme = filme;
        this.valor = valor;
    }

    // Retorna o valor sem desconto
    public double calcularValor() {
        return valor;
    }

    // Retorna o valor com desconto percentual
    public double calcularValor(double percentualDesconto) {
        return valor - (valor * percentualDesconto / 100);
    }

    // Retorna o valor com desconto fixo
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
