package com.lp1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class TelaPraiaController {

    @FXML
    private Button btnProx;

    @FXML
    private Button btnVerificar;

    @FXML
    private Button btnVoltar;

    @FXML
    private Label lblLoc;

    @FXML
    private Label lblNome;

    @FXML
    private Label lblRes;

    @FXML
    private Label lblTam;

    @FXML
    private TextField txtLoc;

    @FXML
    private TextField txtNome;

    @FXML
    private TextField txtTam;

    @FXML
    void onClickVerificar(ActionEvent event) {

    }

    @FXML
    void onClickProx(ActionEvent event) throws IOException {
        HelloApplication.setRoot("tela-roupa.fxml");
    }

    @FXML
    void onClickVoltar(ActionEvent event) throws IOException {
        HelloApplication.setRoot("tela-porta_objetos.fxml");
    }

}
