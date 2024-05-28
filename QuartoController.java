package controller;


import models.Quarto;
import view.QuartoView;

public class QuartoController {
  

    private Quarto model;
    private QuartoView view;

    public QuartoController(Quarto models, QuartoView view) {
        this.model = model;
        this.view = view;
    }

    public void updateView() {
        view.displayQuarto(model);
    }

    public void setQuarto(Quarto model) {
        this.model = model;
    }

    public Quarto getQuarto() {
        return model;
    }
}


