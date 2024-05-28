package controller;

import models.TipoDeQuarto;
import view.TipoDeQuartoView;

public class TipoDeQuartoController {

    private TipoDeQuarto model;
    private TipoDeQuartoView view;

    public TipoDeQuartoController(TipoDeQuarto model, TipoDeQuartoView view) {
        this.model = model;
        this.view = view;
    }

    public void updateView() {
        view.displayTipoDeQuarto(model);
    }

    public void setTipoDeQuarto(TipoDeQuarto model) {
        this.model = model;
    }

    public TipoDeQuarto getTipoDeQuarto() {
        return model;
    }
}


