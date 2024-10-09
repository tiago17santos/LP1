package com.lp1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.util.Objects;

public class TelaArvoreController {

    @FXML
    private Button btnGerar;

    @FXML
    private Button btnProx;

    @FXML
    private Button btnVoltar;

    @FXML
    private Label lblAltura;

    @FXML
    private Label lblEspecie;

    @FXML
    private Label lblEstAno;

    @FXML
    private Label lblLargura;

    @FXML
    private Label lblLocalizacao;

    @FXML
    private Label lblRes;

    @FXML
    private TextField txtAltura;

    @FXML
    private TextField txtEspecie;

    @FXML
    private TextField txtEstAno;

    @FXML
    private TextField txtLargura;

    @FXML
    private TextField txtLocalizacao;

    @FXML
    void onClickGerar(ActionEvent event) {
        String especie = txtEspecie.getText();
        String estacaoAno = txtEstAno.getText();
        String localizacao = txtLocalizacao.getText();
        double altura = Double.parseDouble(txtAltura.getText());
        double largura = Double.parseDouble(txtLargura.getText());



        if(especie.isEmpty() || estacaoAno.isEmpty() || localizacao.isEmpty() || altura < 0 || largura < 0){
            lblRes.setText("Preencha todos os campos...");
        }
        else {
            lblRes.setText("A arvore da espécie: " + especie + " e está dessa forma: " + cairFolhas(estacaoAno) + verificarFrutos(estacaoAno) + crescer(estacaoAno, altura));

        }


    }

    String cairFolhas(String estacaoAno){
        if (Objects.equals(estacaoAno, "outono") || Objects.equals(estacaoAno, "inverno")){
           return "\nNão há mais folhas, somente na próxima primavera..";
        }else {
            return "\nA árvore está repleta de folhas";
        }
    }

    String verificarFrutos(String estacaoAno){
        if (Objects.equals(estacaoAno, "primavera") || Objects.equals(estacaoAno, "verão")){
            return "\nPode iniciar sua colheita a arvore está com frutos";
        }
        else{
            return "\nA árvore não está com frutos, aguarde..";
        }
    }

    String crescer(String estacaoAno, double altura){
        if (Objects.equals(estacaoAno, "primavera") || Objects.equals(estacaoAno, "verão")){
            altura += 0.30;
            return "\nA arvore agora tem " + String.format("%.2f",altura) + " de altura..";
        }
        else{
            return "\nNo momento a árvore não está crescendo, aguarde..";
        }
    }

    @FXML
    void onClickProx(ActionEvent event) throws IOException {
        HelloApplication.setRoot("tela-bicicleta.fxml");
    }

    @FXML
    void onClickVoltar(ActionEvent event) throws IOException {
        HelloApplication.setRoot("tela-aluno.fxml");
    }



}
