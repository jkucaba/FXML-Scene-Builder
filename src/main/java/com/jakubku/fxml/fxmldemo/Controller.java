package com.jakubku.fxml.fxmldemo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

public class Controller {
    @FXML
    private Label text;

    public void mouseClicked(MouseEvent event) {
        text.setText("Hello World[FXML]");
    }
}
