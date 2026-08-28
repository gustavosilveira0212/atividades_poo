/*package model.principal;

import model.entities.Cliente;
import model.entities.Equipamento;
import model.entities.Servico;

import model.enums.SituacaoServico;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();
        cliente1.setNome("Gustavo");
        cliente1.setTelefone("62981503338");

        Cliente cliente2 = new Cliente();
        cliente2.setNome("Aline");
        cliente2.setTelefone("21052395395");


        Equipamento equipamento1 = new Equipamento();
        equipamento1.setMarcaEquipamento("Dell");
        equipamento1.setModelo("LXPGSQL");
        equipamento1.setTipoEquipamento("Notebook");

        Equipamento equipamento2 = new Equipamento();
        equipamento2.setTipoEquipamento("Computador");
        equipamento2.setModelo("Desktop");
        equipamento2.setMarcaEquipamento("Pichau");

        Servico ordemServico1 = new Servico(cliente1, equipamento1, 250.00, "Não liga. Tem que comprar uma peça de HD",
                SituacaoServico.ABERTO, 300.0 );

        Servico ordemServico2 = new Servico(cliente2, equipamento2, 300.0, "Problema na placa de vídeo",
                SituacaoServico.PENDENTE, 2500.0);

        System.out.println(ordemServico1);
        System.out.println();

        System.out.println(ordemServico2);

    }
}

 */

package model.principal;

import model.entities.Emprestimo;
import model.entities.Estudante;
import model.entities.Livro;

import model.enums.DisponibilidadeLivro;

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
