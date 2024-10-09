package com.lp1;



import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.io.IOException;

public class HelloController {
    @FXML
    private Label lblBemVindo;

    @FXML
    private Label welcomeText;

    @FXML
    protected void btnClickProx(ActionEvent event) throws IOException {
        //welcomeText.setText("Welcome to JavaFX Application!");
        HelloApplication.setRoot("tela-aluno.fxml");
    }
}