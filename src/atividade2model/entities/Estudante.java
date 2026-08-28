package atividade2model.entities;

public class Estudante {
    private String nome;
    private String matricula;
    private String curso;

    public Estudante() {

    }

    public Estudante(String nome, String matricula, String curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    @Override
    public String toString() {
        return "Nome do aluno: " + nome
                + "\n"
                + "Matrícula: " + matricula
                + "\n"
                + "Curso: " + curso
                + "\n";
    }
}
