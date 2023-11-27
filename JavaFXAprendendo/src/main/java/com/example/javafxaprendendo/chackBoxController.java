package com.example.javafxaprendendo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;

public class chackBoxController {
    @FXML
    private CheckBox cbjava;

    @FXML
    private CheckBox cdphp;

    @FXML
    void pegarValores() {
        System.out.println(cbjava.selectedProperty().getValue());
        System.out.println(cdphp.selectedProperty().getValue());
    }
}
