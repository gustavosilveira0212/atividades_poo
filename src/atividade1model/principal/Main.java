package atividade1model.principal;

import atividade1model.entities.Cliente;
import atividade1model.entities.Equipamento;
import atividade1model.entities.Servico;

import atividade1model.enums.SituacaoServico;

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

