package view;

import models.TipoDeQuarto;
import java.util.Scanner;

public class TipoDeQuartoView {

    private Scanner scanner;

    public TipoDeQuartoView() {
        this.scanner = new Scanner(System.in);
    }

    public TipoDeQuarto getTipoDeQuartoDetails() {
        System.out.print("Enter ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("Enter Description: ");
        String descricao = scanner.nextLine();

        System.out.print("Enter Daily Price: ");
        double precoDiaria = scanner.nextDouble();

        return new TipoDeQuarto(id, descricao, precoDiaria);
    }

    public void displayTipoDeQuarto(TipoDeQuarto tipoDeQuarto) {
        System.out.println(tipoDeQuarto);
    }
}


