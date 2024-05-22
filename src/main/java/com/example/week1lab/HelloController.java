package com.example.week1lab;
// these ae the libraries used to run the fxml file and the important button to used in the code
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class HelloController {
    // Declare the TextField for INR input
    @FXML
    private TextField INRTextfield;

    // Declare the TextField for USD output
    @FXML
    private TextField USDTextfield;

    // Declare the Button for triggering the conversion
    @FXML
    private Button chnageButton;

    // This method is called after all @FXML annotated members have been injected
    @FXML
    public void initialize(){
        // Set prompt text for the TextField components
        INRTextfield.setPromptText("INR");
        USDTextfield.setPromptText("USD");

        // Set an action for the button to call the ConvterButton method when clicked
        chnageButton.setOnAction(event -> ConvterButton());
    }

    // This method is called when the button is clicked
    @FXML
    private void ConvterButton() {
        // Get the text from the INR TextField
        String INRText = INRTextfield.getText();

        // Convert the text to a double
        double INR = Double.parseDouble(INRText);

        // Convert INR to USD (assuming 1 INR = 0.012 USD)
        double USD = INR * 0.012;

        // Set the converted value in the USD TextField
        USDTextfield.setText(String.valueOf(USD));
    }
}
