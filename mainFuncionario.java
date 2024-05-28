package main;

import models.Funcionario;

public class mainFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario(1, "João", "Gerente", "senha123");
        System.out.println(funcionario);

    }
}
