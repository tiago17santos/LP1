package com.lp1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class TelaAlunoController {

    @FXML
    private AnchorPane anchorTelaFundo;

    @FXML
    private Button btnCadastrar;

    @FXML
    private Button btnProx;

    @FXML
    private Button btnVoltar;

    @FXML
    private Label lblNome;

    @FXML
    private Label lblResultado;

    @FXML
    private TextField tfCpf;

    @FXML
    private TextField tfEmail;

    @FXML
    private TextField tfIdade;

    @FXML
    private TextField tfNome;



    @FXML
    void btnClickCadastrar(ActionEvent event) {
        String cpf = tfCpf.getText();
        tfCpf.clear();
        String nome = tfNome.getText();
        tfNome.clear();
        String email = tfEmail.getText();
        tfEmail.clear();
        String idade = tfIdade.getText();
        tfIdade.clear();

        if (cpf.isEmpty() || nome.isEmpty() || email.isEmpty() || idade.isEmpty()) {
            lblResultado.setText("Preencha todos os campos...");
        }
        else {
            lblResultado.setText("Nome: " + nome + ", Idade: " + idade + " anos, CPF: " + cpf + ", Email: " + email + "\n\nOlá " + nome + "!  Seja bem vindo");
        }
    }

    @FXML
    void btnClickProx(ActionEvent event) throws IOException {

        btnCadastrar.setDisable(true);
        HelloApplication.setRoot("tela-arvore.fxml");
    }

    @FXML
    void onClickVoltar(ActionEvent event) throws IOException {
        HelloApplication.setRoot("hello-view.fxml");
    }

}
