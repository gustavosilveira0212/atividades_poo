package atividade2model.entities;

import atividade2model.enums.DisponibilidadeLivro;

public class Livro {
    private String titulo;
    private String autor;
    private String codigo;
    private DisponibilidadeLivro disponibilidadeLivro;

    public Livro() {

    }

    public Livro(String titulo, String autor, String codigo, DisponibilidadeLivro disponibilidadeLivro) {
        this.titulo = titulo;
        this.autor = autor;
        this.codigo = codigo;
        this.disponibilidadeLivro = disponibilidadeLivro;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setDisponibilidadeLivro (DisponibilidadeLivro disponibilidadeLivro) {
        this.disponibilidadeLivro = disponibilidadeLivro;
    }

    public DisponibilidadeLivro getDisponibilidadeLivro() {
        return disponibilidadeLivro;
    }

    @Override
    public String toString() {
        return "Título do livro: " + titulo
                + "\n"
                + "Autor: " + autor
                + "\n"
                + "Código: " + codigo
                + "\n"
                + "Disponibilidade: " + disponibilidadeLivro
                + "\n";
    }
}
