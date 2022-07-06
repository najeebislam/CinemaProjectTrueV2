package com.example.cinemaprojecttrue;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {
    @FXML
    private Label welcomeText;

//these labels and fields are for loginscreen.fxml
    @FXML
    private Label WrongDetails;

    @FXML
    private TextField Username;

    @FXML
    private PasswordField Password;

//the above labels and fields are for loginscreen.fxml

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }


    @FXML
    Button Register,Return,Login,ReturnToOptions,ConfirmLoginButton;


    public void handleRegister() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("registerscreen.fxml"));
            //root = FXMLLoader.load(getClass().getResource("registerscreen.fxml"));

            Stage window = (Stage) Register.getScene().getWindow();
            window.setScene(new Scene(fxmlLoader.load(), 600, 450));
        }catch (Exception e) {
            System.out.println(e);
        }


    }


    public void handleLogin() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("loginscreen.fxml"));
            //root = FXMLLoader.load(getClass().getResource("registerscreen.fxml"));

            Stage window = (Stage) Login.getScene().getWindow();
            window.setScene(new Scene(fxmlLoader.load(), 600, 450));
        }catch (Exception e) {
            System.out.println(e);
        }


    }



    public void handleReturn() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("openscreen.fxml"));
            //root = FXMLLoader.load(getClass().getResource("registerscreen.fxml"));

            Stage window = (Stage) Return.getScene().getWindow();
            window.setScene(new Scene(fxmlLoader.load(), 600, 450));
        }catch (Exception e) {
            System.out.println(e);
        }


    }



    public void handleReturnToOptions() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("openscreen.fxml"));
            //root = FXMLLoader.load(getClass().getResource("registerscreen.fxml"));

            Stage window = (Stage) ReturnToOptions.getScene().getWindow();
            window.setScene(new Scene(fxmlLoader.load(), 600, 450));
        }catch (Exception e) {
            System.out.println(e);
        }


    }

    public void handleLoginButton(ActionEvent event) throws IOException {
        SQLHandling.SQLTest();
        /*if(Username.getText().toString().equals("javacoding") && Password.getText().toString().equals("123"))  {
            WrongDetails.setText("Success!");
        }*/
        if(SQLHandling.UserDetails.contains(Username.getText().toString() +","+  Password.getText().toString()))  {
            WrongDetails.setText("Correct");
        }
        else {
            WrongDetails.setText("Wrong details!");
        }
    }


}