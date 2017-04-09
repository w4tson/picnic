package com.picnic;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Picnic extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    private static final SpringFxmlLoader loader = new SpringFxmlLoader();

    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent root = (Parent) loader.load("/main.fxml");

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}