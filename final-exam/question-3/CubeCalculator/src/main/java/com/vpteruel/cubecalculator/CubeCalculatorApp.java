package com.vpteruel.cubecalculator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 * JavaFX CubeCalculatorApp
 */
public class CubeCalculatorApp extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("CubeCalculator.fxml"));
        Image icon = new Image(getClass().getResourceAsStream("cube.png"));

        stage.setTitle("Cube Calculator");
        stage.getIcons().add(icon);
        stage.setScene(new Scene(root, 300, 200));
        stage.setResizable(false);
        
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}