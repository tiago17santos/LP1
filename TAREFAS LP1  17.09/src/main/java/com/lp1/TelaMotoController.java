package com.lp1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

import java.io.IOException;

public class TelaMotoController {

    @FXML
    private RadioButton RadNao;

    @FXML
    private RadioButton RadSim;

    @FXML
    private Button btnProx;

    @FXML
    private Button btnVerificar;

    @FXML
    private Button btnVoltar;

    @FXML
    private Label lblCor;

    @FXML
    private Label lblLig;

    @FXML
    private Label lblMarca;

    @FXML
    private Label lblPot;

    @FXML
    private Label lblPreco;

    @FXML
    private Label lblRes;

    @FXML
    private Label lblVelo;

    @FXML
    private TextField txtCor;

    @FXML
    private TextField txtMarca;

    @FXML
    private TextField txtPot;

    @FXML
    private TextField txtPreco;

    @FXML
    private TextField txtVelo;


    @FXML
    void onClickVerificar(ActionEvent event) {
        if(RadNao.isSelected()){

        }else{

        };
    }

    @FXML
    void onClickProx(ActionEvent event) throws IOException {
        HelloApplication.setRoot("tela-piscina.fxml");
    }

    @FXML
    void onClickVoltar(ActionEvent event) throws IOException {
        HelloApplication.setRoot("tela-escola.fxml");
    }

}
