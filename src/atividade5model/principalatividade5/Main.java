package atividade5model.principalatividade5;

import atividade5model.entities.Endereco;
import atividade5model.entities.Cliente;

public class Main {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("Rua das flores", 100, "Goiânia");

        Cliente cliente = new Cliente("Gustavo", "123.456.789-00", endereco);

        System.out.print(cliente);

    }
}