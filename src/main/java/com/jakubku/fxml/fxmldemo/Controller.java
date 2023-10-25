package com.jakubku.fxml.fxmldemo;


import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;


public class Controller implements Initializable {
    public Label message_lbl;
    public Button message_btn;
    private final String message;
    public Controller(String message){
        this.message = message;
    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        message_btn.setOnAction(event -> message_lbl.setText("Message: " + message));
    }
}
