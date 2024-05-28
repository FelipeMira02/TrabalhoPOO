package models;

import java.time.LocalDate;

public class Reserva {
    private int id;
    private int idHospede;
    private int idQuarto;
    private LocalDate dataEntrada;
    private LocalDate dataSaida;
    private String status;

    public Reserva(int id, int idHospede, int idQuarto, LocalDate dataEntrada, LocalDate dataSaida, String status) {
        this.id = id;
        this.idHospede = idHospede;
        this.idQuarto = idQuarto;
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdHospede() {
        return idHospede;
    }

    public void setIdHospede(int idHospede) {
        this.idHospede = idHospede;
    }

    public int getIdQuarto() {
        return idQuarto;
    }

    public void setIdQuarto(int idQuarto) {
        this.idQuarto = idQuarto;
    }

    public LocalDate getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(LocalDate dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public LocalDate getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(LocalDate dataSaida) {
        this.dataSaida = dataSaida;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "id=" + id +
                ", idHospede=" + idHospede +
                ", idQuarto=" + idQuarto +
                ", dataEntrada=" + dataEntrada +
                ", dataSaida=" + dataSaida +
                ", status='" + status + '\'' +
                '}';
    }
}
