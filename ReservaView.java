package view;

import models.Reserva;
import java.time.LocalDate;
import java.util.Scanner;

public class ReservaView {

    private Scanner scanner;

    public ReservaView() {
        this.scanner = new Scanner(System.in);
    }

    public Reserva getReservaDetails() {
        System.out.print("Enter ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("Enter Guest ID: ");
        int idHospede = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("Enter Room ID: ");
        int idQuarto = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("Enter Check-in Date (YYYY-MM-DD): ");
        LocalDate dataEntrada = LocalDate.parse(scanner.nextLine());

        System.out.print("Enter Check-out Date (YYYY-MM-DD): ");
        LocalDate dataSaida = LocalDate.parse(scanner.nextLine());

        System.out.print("Enter Status: ");
        String status = scanner.nextLine();

        return new Reserva(id, idHospede, idQuarto, dataEntrada, dataSaida, status);
    }

    public void displayReserva(Reserva reserva) {
        System.out.println(reserva);
    }
}


