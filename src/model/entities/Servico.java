package model.entities;

// Feito por: Gustavo Silveira Prado e Maria Fernanda Peres Gonçalves.

public class Servico {

    public Double valorServico;
    public SituacaoServico situacaoServico;

    public Servico() {

    }

    public Servico(Double valorServico, SituacaoServico situacaoServico) {
        this.valorServico = valorServico;
        this.situacaoServico = situacaoServico;
    }

    public Double getValorServico() {
        return valorServico;
    }

    public void setValorServico(Double valorServico) {
        this.valorServico = valorServico;
    }

    public SituacaoServico getSituacaoServico() {
        return situacaoServico;
    }

    public void setSituacaoServico(SituacaoServico situacaoServico) {
        this.situacaoServico = situacaoServico;
    }

    @Override
    public String toString() {
        if (situacaoServico == SituacaoServico.CONCLUIDO) {
            return "Valor do serviço: R$ valorServico"
                    + "\n"
                    + "Situação do serviço: "
                    + situacaoServico;
        }

    }
}
