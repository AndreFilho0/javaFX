package com.example.javafxaprendendo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

public class HelloController {
    @FXML
    private Label textoExibicao;

    @FXML
    protected void acaoButton() {
        textoExibicao.setText("bem vindo!, sua mensagem é: "+TexteFilder.getText());
    }
    @FXML
    private TextField TexteFilder;

    @FXML
    private ProgressBar progresso;



}