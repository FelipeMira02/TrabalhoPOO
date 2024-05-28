package view;


import models.Quarto;
import java.util.Scanner;

public class QuartoView {


    private Scanner scanner;

    public QuartoView() {
        this.scanner = new Scanner(System.in);
    }

    public Quarto getQuartoDetails() {
        System.out.print("Enter ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("Enter Room Number: ");
        String numero = scanner.nextLine();

        System.out.print("Enter Room Type ID: ");
        int idTipoDeQuarto = scanner.nextInt();

        return new Quarto(id, numero, idTipoDeQuarto);
    }

    public void displayQuarto(Quarto quarto) {
        System.out.println(quarto);
    }
}


