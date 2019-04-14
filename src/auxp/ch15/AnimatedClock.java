package auxp.ch15;

import auxp.ch14.ClockPane;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.util.Duration;

public class AnimatedClock extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        ClockPane clock = new ClockPane();

        EventHandler<ActionEvent> eventHandler= e-> {
            clock.setCurrentTime();
        };

        clock.setDetailed(true);
        Timeline animation = new Timeline(new KeyFrame(Duration.millis(1000), eventHandler));
        animation.setCycleCount(Timeline.INDEFINITE);
        animation.play();

        Scene scene = new Scene(clock);
        primaryStage.setTitle("Clock");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
