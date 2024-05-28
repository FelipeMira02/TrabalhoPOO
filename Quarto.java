package models;

public class Quarto {
    private int id;
    private String numero;
    private int idTipoDeQuarto;

    public Quarto(int id, String numero, int idTipoDeQuarto) {
        this.id = id;
        this.numero = numero;
        this.idTipoDeQuarto = idTipoDeQuarto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public int getIdTipoDeQuarto() {
        return idTipoDeQuarto;
    }

    public void setIdTipoDeQuarto(int idTipoDeQuarto) {
        this.idTipoDeQuarto = idTipoDeQuarto;
    }

    @Override
    public String toString() {
        return "Quarto{" +
                "id=" + id +
                ", numero='" + numero + '\'' +
                ", idTipoDeQuarto=" + idTipoDeQuarto +
                '}';
    }
}
