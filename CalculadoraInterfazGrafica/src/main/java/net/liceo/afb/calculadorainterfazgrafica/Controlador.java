package net.liceo.afb.calculadorainterfazgrafica;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Controlador {
    @FXML
    public Label MostrarOperacion;
    @FXML
    public ImageView Logo;
    @FXML
    public Button I, II, III, IV, V, VI, VII, VIII, IX, cero, borrar, resultado, multiplicacion, division, suma, resta;


    double operando1 = 0;
    double operando2 = 0;
    double resultadoOperacion = 0;
    boolean m = false; boolean d = false; boolean s = false; boolean r = false;


    @FXML
    public void initialize() {
        Image logo = new Image(String.valueOf(getClass().getResource("botonDelete.png")));
        Logo.setImage(logo);
    }

    @FXML
    public void borrarCaracter() {
        if (!MostrarOperacion.getText().isEmpty()) {
            MostrarOperacion.setText(MostrarOperacion.getText().substring(0, MostrarOperacion.getText().length() - 1));
        }
    }

    @FXML
    public void Borrar() {
        MostrarOperacion.setText("");
    }

    @FXML
    public void MostrarResultado() {
        if(MostrarOperacion.getText().isEmpty()){
            System.out.println("NO HAY UN NUMERO INTRODUCIDO");
        }else{
            operando2 = Double.parseDouble(MostrarOperacion.getText());
            System.out.println("Operando 2: " + operando2);
            if(m){
                resultadoOperacion = operando1 * operando2;
                String resultado = String.valueOf(resultadoOperacion); //Pasar de un double a un String
                MostrarOperacion.setText(resultado);
                System.out.println("Resultado: " + resultadoOperacion);
                m = false;
            } else if (d) {
                resultadoOperacion = operando1 / operando2;
                String resultado = String.valueOf(resultadoOperacion); //Pasar de un double a un String
                MostrarOperacion.setText(resultado);
                System.out.println("Resultado: " + resultadoOperacion);
                d = false;
            } else if (s) {
                resultadoOperacion = operando1 + operando2;
                String resultado = String.valueOf(resultadoOperacion); //Pasar de un double a un String
                MostrarOperacion.setText(resultado);
                System.out.println("Resultado: " + resultadoOperacion);
                s = false;
            } else if (r) {
                resultadoOperacion = operando1 - operando2;
                String resultado = String.valueOf(resultadoOperacion); //Pasar de un double a un String
                MostrarOperacion.setText(resultado);
                System.out.println("Resultado: " + resultadoOperacion);
                r = false;
            }
        }
    }

    @FXML
    public boolean operar() {
        if(multiplicacion.isArmed()){
            operando1 = Double.parseDouble(MostrarOperacion.getText());
            System.out.println("Operando 1: " + operando1);
            MostrarOperacion.setText("");
            escribirNumero();
            return m = true;
        } else if (division.isArmed()) {
            operando1 = Double.parseDouble(MostrarOperacion.getText());
            System.out.println("Operando 1: " + operando1);
            MostrarOperacion.setText("");
            escribirNumero();
            return d = true;
        } else if (suma.isArmed()) {
            operando1 = Double.parseDouble(MostrarOperacion.getText());
            System.out.println("Operando 1: " + operando1);
            MostrarOperacion.setText("");
            escribirNumero();
            return s = true;
        } else if (resta.isArmed()) {
            operando1 = Double.parseDouble(MostrarOperacion.getText());
            System.out.println("Operando 1: " + operando1);
            MostrarOperacion.setText("");
            escribirNumero();
            return r = true;
        }
        return false;
    }

    @FXML
    public void escribirNumero() {
        if(I.isArmed()){
            MostrarOperacion.setText(MostrarOperacion.getText()+ I.getText());
        } else if (II.isArmed()) {
            MostrarOperacion.setText(MostrarOperacion.getText()+ II.getText());
        } else if (III.isArmed()) {
            MostrarOperacion.setText(MostrarOperacion.getText()+ III.getText());
        } else if (IV.isArmed()) {
            MostrarOperacion.setText(MostrarOperacion.getText()+ IV.getText());
        } else if (V.isArmed()) {
            MostrarOperacion.setText(MostrarOperacion.getText()+ V.getText());
        } else if (VI.isArmed()) {
            MostrarOperacion.setText(MostrarOperacion.getText()+ VI.getText());
        } else if (VII.isArmed()) {
            MostrarOperacion.setText(MostrarOperacion.getText()+ VII.getText());
        } else if (VIII.isArmed()) {
            MostrarOperacion.setText(MostrarOperacion.getText()+ VIII.getText());
        } else if (IX.isArmed()) {
            MostrarOperacion.setText(MostrarOperacion.getText()+ IX.getText());
        } else if (cero.isArmed()) {
            MostrarOperacion.setText(MostrarOperacion.getText()+ cero.getText());
        }
    }


}