package controller;


import models.Reserva;
import views.ReservaView;
public class ReservaController {


    private Reserva model;
    private ReservaView view;

    public ReservaController(Reserva model, ReservaView view) {
        this.model = model;
        this.view = view;
    }

    public void updateView() {
        view.displayReserva(model);
    }

    public void setReserva(Reserva model) {
        this.model = model;
    }

    public Reserva getReserva() {
        return model;
    }
}

}
