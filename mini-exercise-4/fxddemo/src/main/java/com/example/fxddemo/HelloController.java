package com.example.fxddemo;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {
    @FXML
    private TextField nameField;

    @FXML
    private Label errorName;

    @FXML
    private TextField contactField;

    @FXML
    private Label errorContact;

    @FXML
    private ComboBox<String> countryComboBox;

    @FXML
    private Label errorCountry;

    @FXML
    private RadioButton maleRadio;

    @FXML
    private RadioButton femaleRadio;

    @FXML
    private ToggleGroup gender;

    @FXML
    private Label errorGender;

    @FXML
    private void handleSubmitButtonAction() {
        String name = nameField.getText();
        String contact = contactField.getText();
        String country = countryComboBox.getValue();
        RadioButton selectedRadioButton = (RadioButton) gender.getSelectedToggle();
        String genderText;

        if (name == null || name.isEmpty()) {
            errorName.setText("Name must not be null.");
            nameField.requestFocus();
            return;
        } else if (!name.matches("[a-zA-Z ]+")) {
            errorName.setText("Name must contain letters only.");
            nameField.requestFocus();
            return;
        } else {
            errorName.setText("");
        }

        if (contact == null || contact.isEmpty()) {
            errorContact.setText("Contact Number must not be null.");
            contactField.requestFocus();
            return;
        } else if (!contact.matches("\\d+")) {
            errorContact.setText("Contact Number must contain numbers only.");
            contactField.requestFocus();
            return;
        } else if (contact.length() < 10) {
            errorContact.setText("Contact Number must be at least 10 characters long.");
            contactField.requestFocus();
            return;
        } else {
            errorContact.setText("");
        }

        if (countryComboBox.getSelectionModel().isEmpty()) {
            errorCountry.setText("Country must not be null.");
            return;
        } else {
            errorCountry.setText("");
        }

        if (selectedRadioButton != null) {
            genderText = selectedRadioButton.getText();
        } else {
            genderText = null;
        }

        if (genderText == null || genderText.isEmpty()) {
            errorGender.setText("Gender must not be null.");
            return;
        } else {
            errorGender.setText("");
        }

        // calling method to Open new window with welcome message
        // openWelcomeWindow(name, contact, country, genderText);

        //MVC
        UserModel user = new UserModel(name, contact, country, genderText);
        openWelcomeWindow(user);
    }

    //Method to open 2nd window
    private void openWelcomeWindow(String name, String contact, String country, String gender) {
        try {
            //Loading .fxml of 2nd window
            FXMLLoader loader = new FXMLLoader(getClass().getResource("welcome.fxml"));
            Parent parent = loader.load();

            //Getting controller of 2nd window and creating object of 2nd window controller class
            WelcomeController controller = loader.getController();

            //With 2nd window object calling method to pass all fields' values to 2nd window
            controller.initData(name, contact, country, gender);

            Scene scene = new Scene(parent, 380, 300, true);

            //Displaying 2nd window by setting the title of 2nd window
            Stage stage = new Stage();
            stage.setResizable(true);
            stage.setTitle("Welcome");
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    //MVC
    private void openWelcomeWindow(UserModel user) {
        try {
            //Loading .fxml of 2nd window
            FXMLLoader loader = new FXMLLoader(getClass().getResource("welcome.fxml"));
            Parent parent = loader.load();

            //Getting controller of 2nd window and creating object of 2nd window controller class
            WelcomeController controller = loader.getController();

            //With 2nd window object calling method to pass all fields' values to 2nd window
            controller.initData(user);

            Scene scene = new Scene(parent, 380, 300, true);

            //Displaying 2nd window by setting the title of 2nd window
            Stage stage = new Stage();
            stage.setResizable(true);
            stage.setTitle("Welcome");
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}