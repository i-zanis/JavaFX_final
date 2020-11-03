package sample;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.*;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import javax.swing.*;
import java.awt.*;

import static javafx.application.Application.launch;

public class E14_04 extends Application {



    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();
    Text[] texts = new Text[5];
    for (int i = 0; i < 5; i++) {
        texts[i] =  new Text(Math.random() * 100,Math.random() * 50,"JavaFX");
        texts[i].setRotate(Math.random() * 360);
        texts[i].setFill(new Color((int)(Math.random() * 2),(int)(Math.random() * 2),(int)(Math.random() * 2),(int)(Math.random() * 2)));
        pane.getChildren().add(texts[i]);
    }

        Scene scene = new Scene(pane,500,500);
        primaryStage.setTitle("14_04"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    }
    }


