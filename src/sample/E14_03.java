package sample;

import javafx.application.Application;
import javafx.stage.Stage;

import java.lang.reflect.Array;

public class E14_03 extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Integer[] tiles = new Integer[26];
        for (int i = 1; i < tiles.length; i++) {
            tiles[i] = i;
        }


    }
}
