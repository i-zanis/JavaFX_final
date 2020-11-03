
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;


public class E14_06 extends Application {

    @Override
    public void start(Stage stage) throws Exception {


        GridPane pane = new GridPane();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i % 2 == 0 && j % 2 == 0) {
                    pane.add(new Rectangle(25, 25, Color.WHITE), i, j);
                } else pane.add(new Rectangle(25, 25, Color.BLACK), i, j);
                if (i % 2 != 0 && j % 2 != 0) {
                    pane.add(new Rectangle(25, 25, Color.WHITE), i, j);
                }
            }
        }
            Scene scene = new Scene(pane, 500, 500);
            stage.setScene(scene);
            stage.setTitle("E14_06");
            stage.show();

    }
    public static void main(String[] args) {
        launch(args);
    }
}
