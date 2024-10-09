package com.lp1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class TelaBicicletaController {

    @FXML
    private Button btnGerar;

    @FXML
    private Button btnProx;

    @FXML
    private Button btnVoltar;

    @FXML
    private Label lblCor;

    @FXML
    private Label lblMarca;

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
    private TextField txtPreco;

    @FXML
    private TextField txtVelo;

    @FXML
    void onClickGerar(ActionEvent event) {
        String cor = txtCor.getText();
        String marca = txtMarca.getText();
        double preco = Double.parseDouble(txtPreco.getText());
        double velo = Double.parseDouble(txtVelo.getText());

        //fazer botao pedalar e bota freiar

        if(cor.isEmpty() || marca.isEmpty() || preco < 0 || velo < 0){
            lblRes.setText("Preencha todos os campos...");
        }
        else {
            lblRes.setText("A arvore da espécie: " + especie + " e está dessa forma: " + cairFolhas(estacaoAno) + verificarFrutos(estacaoAno) + crescer(estacaoAno, altura));

        }

    }

    String pedalar(double velocidade){
        velocidade += 5;
        return "\nVocê pedalou. A bicicleta está agora a " + velocidade + " km/h.";
    }

    String freiar(double velocidade){
        velocidade -= 3;
        return "\nVocê freiou. A bicicleta está agora a " + velocidade + " km/h.";
    }

    @FXML
    void onClickProx(ActionEvent event) throws IOException {
        HelloApplication.setRoot("tela-bola.fxml");
    }

    @FXML
    void onClickVoltar(ActionEvent event) throws IOException {
        HelloApplication.setRoot("tela-arvore.fxml");
    }

}
