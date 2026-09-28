> Questão 1:

1.1 R: A melhor escolha é a segunda modelagem, pois reaproveita os atributos de um objeto já existente. Ou seja, não é necessário reescrever os atributos, visto que é herdado da classe Endereço.

1.2 R: A variável Endereco é do tipo referência, pois seus objetos são alocados na memória do tipo stack, que armazena o endereço da memória onde os objetos da variável estão alocados. Os objetos estão alocados em outra porção de memória chamada heap, que é utilizada durante a execução da aplicação.

1.3: O conceito TEM-UM é aplicado no relacionamento pois é associado um objeto da classe Endereco à classe Cliente.

1.4:
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
}

1.5:
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

  @Override
    public String toString() {
        return "Nome: " + nome + '\n'
        + "CPF: " + cpf + '\n'
        + "Endereco: " + endereco.toString()
        + '\n';
    }

       @Override
    public String toString() {
        return "Rua: " +
        rua + '\n'
        + "Número: " + numero + 'n'
        + "Cidade: " + cidade
        + '\n';
    }

1.6 R: Como dito anteriormente, a variável Endereco é do tipo referência, pois seus objetos são alocados na memória do tipo stack, que armazena o endereço da memória onde os objetos da variável estão alocados. Os objetos estão alocados em outra porção de memória chamada heap, que é utilizada durante a execução da aplicação.

1.7 R: Nesse caso, estamos apontando que a variável do tipo referência não irá armazenar nenhum endereço de objeto, ou seja, ela vai ficar null, sem que nenhum valor de endereçamento seja atribuído a ela.

1.8 R: Não é vantajoso copiar as informações do endereço para várias classes diferentes pois gera retrabalho e a criação de códigos obsoletos. 

1.9 R: Com a adição de um novo atributo, seguindo a primeira proposta de modelagem apresentada na questão, o atributo precisaria ser adicionado nas duas Classes: Cliente e Endereço. Entretanto, se seguirmos a segunda proposta de modelagem, o atributo seria alterado somente na classe Endereço, e o relacionamento TEM-UM seguiria na classe Cliente, sem que nenhum atributo seja perdido ou desnecessário.