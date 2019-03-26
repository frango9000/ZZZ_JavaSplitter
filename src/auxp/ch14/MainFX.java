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

        Pane pane = new StopPane();
        Pane b = new StackPane();

        b.getChildren().add(pane);
        b.setPadding(new Insets(50));
        Scene scene = new Scene(b);
        primaryStage.setTitle("Test");
        primaryStage.setWidth(500);
        primaryStage.setHeight(500);
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
