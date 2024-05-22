package com.example.week1lab;
//these are the libraries to use in the code and excess the fxml file
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class HelloApplication extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        // Load the FXML file for the GUI layout
        Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));

        // Set the scene and the title of the window
        primaryStage.setTitle("Currency Conveter");
        primaryStage.setScene(new Scene(root, 600, 450));

        // Show the window
        primaryStage.show();
    }

    public static void main(String[] args) {
        // Launch the application
        launch(args);
    }
}
