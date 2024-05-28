package main;

import models.Quarto;

public class mainQuarto {
    
    public static void main(String[] args) {
        // Criando uma instância da classe Quarto
        Quarto quarto = new Quarto(1, "101", 2);
        
        // Exibindo os detalhes do quarto
        System.out.println(quarto);

        // Atualizando os atributos do quarto
        quarto.setNumero("102");
        quarto.setIdTipoDeQuarto(3);
        
        // Exibindo os detalhes atualizados do quarto
        System.out.println(quarto);
    }
}


