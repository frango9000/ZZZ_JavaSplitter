package auxp.ch15;

import javafx.animation.FadeTransition;
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.util.Duration;
import lib.MyFX.ToolFX;

public class AnimatedPendulum extends Pane {

    public AnimatedPendulum() {
        Arc arc = new Arc(250, 250, 200, 200, 230, 80);
        ToolFX.setFillStroke(null, Color.BLACK, arc);
        arc.setType(ArcType.OPEN);

        Circle circle = new Circle(250, arc.getCenterY() + arc.getRadiusY(), 15, Color.GREY);

        PathTransition pt = new PathTransition(Duration.millis(1000), arc, circle);
        pt.setCycleCount(Timeline.INDEFINITE);
        pt.setAutoReverse(true);
        pt.play();

        FadeTransition ft = new FadeTransition(Duration.millis(500), circle);
        ft.setFromValue(1);
        ft.setToValue(0.1);
        ft.setCycleCount(Timeline.INDEFINITE);
        ft.setAutoReverse(true);
        ft.play();


        Line line = new Line(arc.getCenterX(), arc.getCenterY(), circle.getCenterX(), circle.getCenterY());

        circle.centerXProperty().addListener(e -> {
            line.setEndX(circle.getCenterX());
        });
        circle.centerYProperty().addListener(e -> {
            line.setEndY(circle.getCenterY());
        });//wont work? binding either


        getChildren().addAll(arc, circle);
        setMinSize(500, 500);
        setOnMousePressed(event -> {
            pt.pause();
            ft.pause();
        });
        setOnMouseReleased(event -> {
            pt.play();
            ft.play();
        });
    }
}
