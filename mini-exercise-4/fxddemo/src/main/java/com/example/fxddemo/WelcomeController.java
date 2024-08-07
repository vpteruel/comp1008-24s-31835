package com.example.fxddemo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class WelcomeController {
    @FXML
    private Label welcomeLabel;

    public void initData(String name, String contact, String country, String gender) {
        //Appending all values in one string variable to set on Label
        String welcomeMessage = "Welcome, " + name + "!\n";
        welcomeMessage += "Contact Number: " + contact + "\n";
        welcomeMessage += "Country: " + country + "\n";
        welcomeMessage += "Gender: " + gender;

        //Set final text to label
        welcomeLabel.setText(welcomeMessage);
    }

    //MVC
    public void initData(UserModel user) {
        String welcomeMessage = "Welcome, " + user.getName() + "!\n";
        welcomeMessage += "Contact Number: " + user.getContact() + "\n";
        welcomeMessage += "Country: " + user.getCountry() + "\n";
        welcomeMessage += "Gender: " + user.getGender();

        welcomeLabel.setText(welcomeMessage);
    }
}

