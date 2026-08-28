package model.entities;

public class Equipamento {

    private String tipoEquipamento;
    private String marcaEquipamento;
    private String modelo;

    public Equipamento() {

    }

    public Equipamento(String tipoEquipamento, String marcaEquipamento, String modelo) {
        this.tipoEquipamento = tipoEquipamento;
        this.marcaEquipamento = marcaEquipamento;
        this.modelo = modelo;
    }

    public String getTipoEquipamento() {
        return tipoEquipamento;
    }

    public void setTipoEquipamento(String tipoEquipamento) {
        this.tipoEquipamento = tipoEquipamento;
    }

    public String getMarcaEquipamento() {
        return marcaEquipamento;
    }

    public void setMarcaEquipamento(String marcaEquipamento) {
        this.marcaEquipamento = marcaEquipamento;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Tipo do equipamento: "
                + tipoEquipamento +
                ", marca do equipamento: "
                + marcaEquipamento
                + ", modelo: "
                + modelo;
    }
}
