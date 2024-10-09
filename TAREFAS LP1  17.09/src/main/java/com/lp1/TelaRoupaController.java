package com.lp1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class TelaRoupaController {

    @FXML
    private Button btnProx;

    @FXML
    private Button btnVerificar;

    @FXML
    private Button btnVoltar;

    @FXML
    private Label lblApertada;

    @FXML
    private Label lblCor;

    @FXML
    private Label lblPreco;

    @FXML
    private Label lblRes;

    @FXML
    private Label lblTam;

    @FXML
    private TextField txtCor;

    @FXML
    private TextField txtPreco;

    @FXML
    private TextField txtTam;

    @FXML
    void onClickVerificar(ActionEvent event) {

    }

    @FXML
    void onClickProx(ActionEvent event) throws IOException {
        HelloApplication.setRoot("hello-view.fxml");
    }

    @FXML
    void onClickVoltar(ActionEvent event) throws IOException {
        HelloApplication.setRoot("tela-praia.fxml");
    }

}
