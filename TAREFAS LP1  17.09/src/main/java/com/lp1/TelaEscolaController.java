package com.lp1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class TelaEscolaController {

    @FXML
    private Button btnAdc;

    @FXML
    private Button btnVoltar;

    @FXML
    private Button btnprox;

    @FXML
    private Label lblAlunos;

    @FXML
    private Label lblNome;

    @FXML
    private Label lblRes;

    @FXML
    private TextField txtAlunos;

    @FXML
    private TextField txtNome;

    @FXML
    void onClickAdc(ActionEvent event) {

    }

    @FXML
    void onClickProx(ActionEvent event) throws IOException {
        HelloApplication.setRoot("tela-moto.fxml");
    }

    @FXML
    void onClickVoltar(ActionEvent event) throws IOException {
        HelloApplication.setRoot("tela-bola.fxml");
    }

}
