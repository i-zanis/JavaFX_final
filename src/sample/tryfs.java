package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

public class tryfs extends Application {
    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {
        // Create a button and place it in the scene

        TextArea taNote = new TextArea("This is a text area");
        taNote.setPrefColumnCount(20);
        taNote.setPrefRowCount(5);
        taNote.setWrapText(true);
        taNote.setStyle("-fx-text-fill: red");
        taNote.setFont(Font.font("Times", 30));
        String shit = new String("Pedro will love you.");
        //TextArea textArea = new TextArea(shit);
        Scene scene = new Scene(taNote);
        System.setOut(new PrintStream(new OutputStream() {
            @Override
            public void write(int b) throws IOException {
                taNote.appendText("" + ((char) b));
            }

            @Override
            public void write(byte[] b) throws IOException {
                taNote.appendText(new String(b));
            }

            @Override
            public void write(byte[] b, int off, int len) throws IOException {
                taNote.appendText(new String(b, off, len));
            }
        }));

    primaryStage.setTitle("The adventures of AG"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
        System.out.println("THIS WILL BE WRITEN INSIDE THE TEXT AREA!");
    }

    /**
     * The main method is only needed for the IDE with limited
     * JavaFX support. Not needed for running from the command line.
     */
    public static void main(String[] args) {
        launch(args);
    }
}
