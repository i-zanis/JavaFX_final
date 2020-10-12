package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.lang.reflect.Array;
import javafx.scene.layout.GridPane;
public class E14_03 extends Application {
    GridPane gridPane = new GridPane();
    @Override
    public void start(Stage primaryStage) throws Exception {
      for (int i = 0; i < 4; i++) {
          for (int j = 0; j < 4; j++) {
              int random = (int)(Math.random() * 54);
              gridPane.add(new ImageView(new Image("image\\card\\" + random + ".png")),i,j);
          }
            GridPane gridPane = new GridPane();

        }
      
        Scene scene = new Scene(gridPane, 500, 400);
        primaryStage.setTitle("E14_03");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

        public static void main(String[] args) {
            Application.launch(args);
        }
}
