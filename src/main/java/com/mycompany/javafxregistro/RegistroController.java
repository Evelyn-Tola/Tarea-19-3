package com.mycompany.javafxregistro;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

public class RegistroController {

   @FXML
    private TextField apellidoField;

    @FXML
    private TextField disponibilidadField;

    @FXML
    private TextField edadField;

    @FXML
    private TextField nombreField;

    @FXML
    void Registrar(ActionEvent event) {

        String nombre = nombreField.getText();
        String apellido = apellidoField.getText();
        String edad = edadField.getText();
        String disponibilidad = disponibilidadField.getText();
        
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Datos Registrados");
        alert.setHeaderText("Información del usuario");
        alert.setContentText("Nombre: " + nombre + "\nApellido: " + apellido + "\nEdad: " + edad + "\nDisponibilidad: " + disponibilidad);
        alert.showAndWait();
        
        
    }

}

