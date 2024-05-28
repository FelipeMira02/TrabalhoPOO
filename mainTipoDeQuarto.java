package main;

import controller.TipoDeQuartoController;
import models.TipoDeQuarto;
import view.TipoDeQuartoView;

public class mainTipoDeQuarto {
   
    public static void main(String[] args) {
        // Criando uma instância da classe TipoDeQuarto
        TipoDeQuarto tipoDeQuarto = new TipoDeQuarto(1, "Suíte", 200.0);
        
        // Exibindo os detalhes do tipo de quarto
        System.out.println(tipoDeQuarto);

        // Atualizando os atributos do tipo de quarto
        tipoDeQuarto.setPrecoDiaria(250.0);

         // Criando a view e o controller
        TipoDeQuartoView tipoDeQuartoView = new TipoDeQuartoView();
        TipoDeQuartoController tipoDeQuartoController = new TipoDeQuartoController(tipoDeQuarto, tipoDeQuartoView);

        // Exibindo os detalhes atualizados do tipo de quarto
        System.out.println(tipoDeQuarto);
    
}

}
