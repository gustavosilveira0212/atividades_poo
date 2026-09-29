package atividade1model.entities;

// Feito por: Gustavo Silveira Prado e Maria Fernanda Peres Gonçalves.

import atividade1model.enums.SituacaoServico;

public class Servico {

    private Cliente cliente;
    private Equipamento equipamento;
    private Double valorServico;
    private String descricaoServico;
    private SituacaoServico situacaoServico;
    private Double precoPeca;

    public Servico() {

    }

    public Servico(Cliente cliente, Equipamento equipamento, Double valorServico, String descricaoServico, SituacaoServico situacaoServico, Double precoPeca) {
        this.cliente = cliente;
        this.equipamento = equipamento;
        this.valorServico = valorServico;
        this.descricaoServico = descricaoServico;
        this.situacaoServico = situacaoServico;
        this.precoPeca = precoPeca;
    }

    public void setDescricaoServico(String descricaoServico) {
        this.descricaoServico = descricaoServico;
    }

    public String getDescricaoServico() {
        return descricaoServico;
    }

    public void setPrecoPeca(Double precoPeca) {
        this.precoPeca = precoPeca;
    }

    public Double getPrecoPeca() {
        return precoPeca;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setEquipamento(Equipamento equipamento) {
        this.equipamento = equipamento;
    }

    public Equipamento getEquipamento() {
        return equipamento;
    }

    public void setValorServico(Double valorServico) {
        this.valorServico = valorServico;
    }

    public SituacaoServico getValorServico() {
        return situacaoServico;
    }

    public void finalizarServico() {
        this.situacaoServico = SituacaoServico.CONCLUIDO;
    }

    public double calcularValorFinal() {
        double valorFinal;
        valorFinal = valorServico + precoPeca;
        return valorFinal;
    }

    @Override
    public String  toString() {
        return "Informações gerais do serviço: \n"
                + cliente.toString()
                + equipamento.toString()
                + "valor do serviço: R$ "
                + String.format("%.2f", valorServico)
                + "\n"
                + "Descrição: " + descricaoServico
                + "\n"
                + "Situação do serviço: " + situacaoServico
                + "\n"
                + "Preço da peça adicional: " + String.format("%.2f", precoPeca)
                + "\n"
                + "Valor final do serviço: R$ " + String.format("%.2f", calcularValorFinal());
    }

}
