package com.example.feira;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class FeiraController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}
