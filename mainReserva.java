package main;

import models.Reserva;
import java.time.LocalDate;

public class mainReserva {
    public static void main(String[] args) {
        // Criando uma instância da classe Reserva
        LocalDate dataEntrada = LocalDate.of(2024, 6, 1);
        LocalDate dataSaida = LocalDate.of(2024, 6, 10);
        Reserva reserva = new Reserva(1, 1, 101, dataEntrada, dataSaida, "Confirmada");
        
        // Exibindo os detalhes da reserva
        System.out.println(reserva);

        // Atualizando os atributos da reserva
        reserva.setDataEntrada(LocalDate.of(2024, 6, 2));
        reserva.setDataSaida(LocalDate.of(2024, 6, 11));
        reserva.setStatus("Check-in");

        // Exibindo os detalhes atualizados da reserva
        System.out.println(reserva);
    }
}


