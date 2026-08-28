package atividade2model.entities;

import atividade2model.enums.DisponibilidadeLivro;

public class Emprestimo {
    private Estudante estudante;
    private Livro livro;
    private int diasDisponiveis;
    private int diasAtraso;

    public Emprestimo() {

    }

    public Emprestimo(Estudante estudante, Livro livro, int diasDisponiveis, int diasAtraso) {
        this.estudante = estudante;
        this.livro = livro;
        this.diasDisponiveis = diasDisponiveis;
        this.diasAtraso = diasAtraso;
    }

    public void setDiasAtraso(int diasAtraso) {
        this.diasAtraso = diasAtraso;
    }

    public int getDiasAtraso() {
        return diasAtraso;
    }

    public void setEstudante(Estudante estudante) {
        this.estudante = estudante;
    }

    public Estudante getEstudante() {
        return estudante;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setDiasDisponiveis(int diasDisponiveis) {
        this.diasDisponiveis = diasDisponiveis;
    }

    public int getDiasDisponiveis() {
        return diasDisponiveis;
    }

    public void devolver() {
        livro.setDisponibilidadeLivro(DisponibilidadeLivro.DEVOLVIDO);
    }

    public void emprestar() {
        livro.setDisponibilidadeLivro(DisponibilidadeLivro.EMPRESTADO);
    }

    public double calcularMulta() {
        double valorMulta;
        valorMulta = diasAtraso * 0.50;
        return valorMulta;
    }

    @Override
    public String toString() {
        return estudante.toString()
                + livro.toString()
                + "Dias disponíveis: " + diasDisponiveis
                + "\n"
                + "Valor da multa: " + String.format("%.2f", calcularMulta());
    }
}
