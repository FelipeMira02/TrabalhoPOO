package main;

import models.Funcionario;
import models.Hospede;

public class mainHospede {

    public static void main(String[] args) {
        // Teste da classe Funcionario
        Funcionario funcionario = new Funcionario(1, "João", "Gerente", "senha123");
        System.out.println(funcionario);

        // Teste da classe Hospede
        Hospede hospede = new Hospede(1, "Maria", "123456789", "987654321");
        System.out.println(hospede);
    }
}


