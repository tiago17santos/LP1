package com.lp1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class TelaPiscinaController {

    @FXML
    private Button btnProx;

    @FXML
    private Button btnVerificar;

    @FXML
    private Button btnVoltar;

    @FXML
    private Label lblComp;

    @FXML
    private Label lblLarg;

    @FXML
    private Label lblProf;

    @FXML
    private Label lblRes;

    @FXML
    private Label lblTemp;

    @FXML
    private TextField txtComp;

    @FXML
    private TextField txtLarg;

    @FXML
    private TextField txtProf;

    @FXML
    private TextField txtTemp;

     @FXML
    void onClickVerificar(ActionEvent event) {

    }

    @FXML
    void onClickProx(ActionEvent event) throws IOException {
        HelloApplication.setRoot("tela-porta_objetos.fxml");
    }

    @FXML
    void onClickVoltar(ActionEvent event) throws IOException {
        HelloApplication.setRoot("tela-moto.fxml");
    }

}
