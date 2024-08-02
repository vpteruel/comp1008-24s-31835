package com.vpteruel.fxcalculator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 * JavaFX CalculatorApp
 */
public class CalculatorApp extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("calculator.fxml"));
        Image icon = new Image(getClass().getResourceAsStream("calculator.png"));
        
        primaryStage.setTitle("Calculator");
        primaryStage.getIcons().add(icon);
        primaryStage.setScene(new Scene(root, 300, 400));
        primaryStage.setResizable(false);
        
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}