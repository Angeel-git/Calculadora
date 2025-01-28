module net.liceo.afb.calculadorainterfazgrafica {
    requires javafx.controls;
    requires javafx.fxml;


    opens net.liceo.afb.calculadorainterfazgrafica to javafx.fxml;
    exports net.liceo.afb.calculadorainterfazgrafica;
}