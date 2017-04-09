package com.picnic.controller;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println("Initialized");
    }

    @FXML
    private void hello(ActionEvent event) {
        System.out.println("Hello, world!");
    }

}
