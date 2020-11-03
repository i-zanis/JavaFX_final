package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class E14_07 extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        GridPane pane = new GridPane();

        for (int i = 0; i < 10; i ++) {
            for (int j = 0; j < 10; j++) {
                pane.add(((int)(Math.random() * 2) == 0 ? new TextField("1") : new TextField("0")),i,j);
            }
        }
        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.setTitle("E14_7");
        stage.show();
    }
}
