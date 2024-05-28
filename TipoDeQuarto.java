package models;

public class TipoDeQuarto {
    private int id;
    private String descricao;
    private double precoDiaria;

    public TipoDeQuarto(int id, String descricao, double precoDiaria) {
        this.id = id;
        this.descricao = descricao;
        this.precoDiaria = precoDiaria;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPrecoDiaria() {
        return precoDiaria;
    }

    public void setPrecoDiaria(double precoDiaria) {
        this.precoDiaria = precoDiaria;
    }

    @Override
    public String toString() {
        return "TipoDeQuarto{" +
                "id=" + id +
                ", descricao='" + descricao + '\'' +
                ", precoDiaria=" + precoDiaria +
                '}';
    }
}
