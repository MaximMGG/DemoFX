package com.example.demofx;

import javafx.fxml.FXML;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class SampleController {

    public javafx.scene.control.Label welcome;
    @FXML
    private Label text;

    @FXML
    protected void onAction() {
        welcome.setText("Welcome to javafx");
    }
}
