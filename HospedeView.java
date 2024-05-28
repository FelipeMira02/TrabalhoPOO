package view;

import models.Hospede;
import java.util.Scanner;

public class HospedeView {

    private Scanner scanner;

    public HospedeView() {
        this.scanner = new Scanner(System.in);
    }

    public Hospede getHospedeDetails() {
        System.out.print("Enter ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("Enter Name: ");
        String nome = scanner.nextLine();

        System.out.print("Enter Documento: ");
        String documento = scanner.nextLine();

        System.out.print("Enter Telefone: ");
        String telefone = scanner.nextLine();

        return new Hospede(id, nome, documento, telefone);
    }

    public void displayHospede(Hospede hospede) {
        System.out.println(hospede);
    }
}

