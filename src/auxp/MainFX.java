package auxp;

import auxp.ch15.MovableRectanglePane;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class MainFX extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        MovableRectanglePane pane = new MovableRectanglePane();

        Pane b = new StackPane(pane);
        b.setPadding(new Insets(0));

        Scene scene = new Scene(b);
        primaryStage.setTitle("Test");
        //primaryStage.setWidth(400);
        //primaryStage.setHeight(400);
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
