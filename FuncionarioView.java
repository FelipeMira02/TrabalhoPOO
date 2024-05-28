package view;

import models.Funcionario;
import java.util.Scanner;

public class FuncionarioView {

    private Scanner scanner;

    public FuncionarioView() {
        this.scanner = new Scanner(System.in);
    }

    public Funcionario getFuncionarioDetails() {
        System.out.print("Enter ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("Enter Name: ");
        String nome = scanner.nextLine();

        System.out.print("Enter Cargo: ");
        String cargo = scanner.nextLine();

        System.out.print("Enter Senha: ");
        String senha = scanner.nextLine();

        return new Funcionario(id, nome, cargo, senha);
    }

    public void displayFuncionario(Funcionario funcionario) {
        System.out.println(funcionario);
    }
}

