package com.lp1;

import com.lp1.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class TelaPortaObjetosController {

    @FXML
    private Button btnAdcObj;

    @FXML
    private Button btnFinalizar;

    @FXML
    private Button btnProx;

    @FXML
    private Button btnVoltar;

    @FXML
    private Label lblCor;

    @FXML
    private Label lblObj;

    @FXML
    private Label lblRes;

    @FXML
    private Label lblTamanho;

    @FXML
    private TextField txtCor;

    @FXML
    private TextField txtObj;

    @FXML
    private TextField txtTam;

    @FXML
    void onClickAdcObj(ActionEvent event) {

    }

    @FXML
    void onClickFinalizar(ActionEvent event) {

    }

    @FXML
    void onClickProx(ActionEvent event) throws IOException {
        HelloApplication.setRoot("tela-praia.fxml");
    }

    @FXML
    void onClickVoltar(ActionEvent event) throws IOException {
        HelloApplication.setRoot("tela-piscina.fxml");
    }

}
