
package atividade2model.principal;

import atividade2model.entities.Emprestimo;
import atividade2model.entities.Estudante;
import atividade2model.entities.Livro;

import atividade2model.enums.DisponibilidadeLivro;

public class Main {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();
        estudante1.setNome("Gustavo");
        estudante1.setCurso("Análise e Desenvolvimento de Sistemas");
        estudante1.setMatricula("20261012000012");

        Estudante estudante2 = new Estudante();
        estudante2.setNome("Maria Fernanda");
        estudante2.setCurso("Análise e Desenvolvimento de Sistemas");
        estudante2.setMatricula("20251012000012");

        Livro livro1 = new Livro();
        livro1.setAutor("Dostoievski");
        livro1.setCodigo("20010");
        livro1.setTitulo("Crime e Castigo");
        livro1.setDisponibilidadeLivro(DisponibilidadeLivro.EMPRESTADO);

        Livro livro2 = new Livro();
        livro2.setAutor("Dostoievski");
        livro2.setCodigo("20011");
        livro2.setTitulo("Os Irmãos Karamazóv");
        livro2.setDisponibilidadeLivro(DisponibilidadeLivro.NAO_DEVOLVIDO);

        Emprestimo emprestimo1 = new Emprestimo(estudante1, livro1, 5, 0);

        Emprestimo emprestimo2 = new Emprestimo(estudante2, livro2, 5, 2);

        System.out.println(emprestimo1);

        System.out.println();

        System.out.println(emprestimo2);
    }
}