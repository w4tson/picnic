package com.picnic.foo;


import de.felixroske.jfxsupport.FXMLController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

@FXMLController
public class MainController {

    @FXML
    private void hello(ActionEvent event) {
        System.out.println("Hello, world!");
    }

}
