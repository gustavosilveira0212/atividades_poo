package atividade5model.entities;

public class Cliente {
    private String nome;
    private String cpf;
    private Endereco endereco;

    public Cliente(
        String nome,
        String cpf,
        Endereco endereco) {

        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String nome() {
        return nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String cpf() {
        return cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + '\n'
        + "CPF: " + cpf + '\n'
        + "Endereco: " + endereco.toString()
        + '\n';
    }
}
