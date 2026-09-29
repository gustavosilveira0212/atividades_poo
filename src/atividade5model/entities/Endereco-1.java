package atividade5model.entities;

public class Endereco {
    private String rua;
    private int numero;
    private String cidade;

    public Endereco(
        String rua,
        int numero,
        String cidade) {
        this.rua = rua;
        this.numero = numero;
        this.cidade = cidade;
    }

    // public void setRua(String rua) {
    //     this.rua = rua;
    // }

    public String getRua() {
        return rua;
    }

    // public void setNumero(int numero) {
    //     this.numero = numero;
    // }

    public int getNumero() {
        return numero;
    }

    // public void setCidade(String cidade) {
    //     this.cidade = cidade;
    // }

    public String cidade() {
        return cidade;
    }

    @Override
    public String toString() {
        return "Rua: " + rua + '\n'
        + "Número: " + numero + '\n'
        + "Cidade: " + cidade + '\n';
    }
}
