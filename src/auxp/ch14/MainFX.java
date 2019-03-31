package auxp.ch14;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class MainFX extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        Pane pane = new RandArrow();

        Pane b = new StackPane(pane);
        b.setPadding(new Insets(0));

        Scene scene = new Scene(b);
        primaryStage.setTitle("Test");
        primaryStage.setWidth(800);
        primaryStage.setHeight(400);
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
