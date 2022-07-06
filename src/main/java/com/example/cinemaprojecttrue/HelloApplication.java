package com.example.cinemaprojecttrue;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("openscreen.fxml"));
            //Parent root = FXMLLoader.load(getClass().getResource("openscreen.fxml"));
            //Scene scene = new Scene(fxmlLoader.load(), 320, 240);
            stage.setTitle("Cineworld");
            stage.setScene(new Scene(fxmlLoader.load(), 600, 450));
            stage.show();
        }catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        launch();
    }
}