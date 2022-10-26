package com.example.javafxoop;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException
    {
//        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));

        Button bigbtn = new Button("Help me find my 4 little brothers please");
        Button smolbtn1 = new Button("Little brother 1 here!");
        Button smolbtn2 = new Button("Little brother 2 here!");
        Button smolbtn3 = new Button("little brother 3 here!");
        Button smolbtn4 = new Button("little brother 4 here!");

        VBox canvas = new VBox();

        canvas.getChildren().add(bigbtn);
        bigbtn.setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent actionEvent) {
                canvas.getChildren().add(smolbtn1);
                bigbtn.setText("Oh you found one, please find the other 3");
            }
        });
        smolbtn1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                canvas.getChildren().add(smolbtn2);
                bigbtn.setText("Oh you found another, 2 more to go!");
            }
        });
        smolbtn2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                canvas.getChildren().add(smolbtn3);
                bigbtn.setText("OMG thank you, one more to go :D");
            }
        });
        smolbtn3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                canvas.getChildren().add(smolbtn4);
                bigbtn.setText("Oh my god they're all here, thank you so much! <3");
            }
        });

        Scene scene = new Scene(canvas, 320, 240);
        scene.setFill(Color.BLUEVIOLET);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}