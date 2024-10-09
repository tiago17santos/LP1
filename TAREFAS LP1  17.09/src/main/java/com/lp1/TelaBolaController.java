package com.lp1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class TelaBolaController {

    @FXML
    private Button btnProx;

    @FXML
    private Button btnVerificar;

    @FXML
    private Button btnVoltar;

    @FXML
    private Label lblArAtual;

    @FXML
    private Label lblCor;

    @FXML
    private Label lblRes;

    @FXML
    private Label lblTipo;

    @FXML
    private TextField txtArAtual;

    @FXML
    private TextField txtCor;

    @FXML
    private TextField txtTipo;


    @FXML
    void onClickVerificar(ActionEvent event) {

    }

    @FXML
    void onClickProx(ActionEvent event) throws IOException {
        HelloApplication.setRoot("tela-escola.fxml");
    }

    @FXML
    void onClickVoltar(ActionEvent event) throws IOException {
        HelloApplication.setRoot("tela-bicicleta.fxml");
    }

}
