package auxp;

import auxp.ch15.AnimatedPendulum;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class MainFX extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        AnimatedPendulum pane = new AnimatedPendulum();

        Pane b = new StackPane(pane);
        b.setPadding(new Insets(10));

        Scene scene = new Scene(b);
        primaryStage.setTitle("Test");
        //primaryStage.setWidth(400);
        //primaryStage.setHeight(400);
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
