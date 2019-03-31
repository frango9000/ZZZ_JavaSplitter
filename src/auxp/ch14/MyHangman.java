package auxp.ch14;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Shape;
import lib.Geometry.Point;

public class MyHangman extends Pane {
    Point node1, node2, node3;
    Point hang1, hang2;
    public void paint(){

        node1 = new Point(100, 33);
        node2 = new Point(100, 400);
        node3 = new Point(300,33);

        hang1 = new Point(300,100);
        hang2 = new Point(300, 250);

        Line frame1, frame2, frame3;
        frame1 = new Line(node1.x, node1.y, node2.x, node2.y);
        frame2 = new Line(node1.x, node1.y, node3.x, node3.y);
        frame3 = new Line(node3.x, node3.y, hang1.x, hang1.y);
        Arc arc = new Arc(node2.x, node2.y+1, 75, 50, 0, 180);

        Circle head = new Circle(hang1.x, hang1.y, 30);
        Line body,lArm, rArm, lLeg, rLeg;
        body = new Line(hang1.x,hang1.y,hang2.x,hang2.y);
        lArm = new Line(hang1.x, hang1.y, hang1.x-75, hang1.y+75);
        rArm = new Line(hang1.x, hang1.y, hang1.x+75, hang1.y+75);
        lLeg = new Line(hang2.x, hang2.y, hang2.x-50, hang2.y+50);
        rLeg = new Line(hang2.x, hang2.y, hang2.x+50, hang2.y+50);


        setFillStroke(Color.WHITE, Color.BLACK, arc,head);
        getChildren().addAll(frame1,frame2,frame3,arc,body,lArm,rArm,lLeg,rLeg,head);

    }

    public void setFillStroke(Paint fill, Paint stroke, Shape... shapes){
        for (int i = 0; i < shapes.length; i++) {
            shapes[i].setFill(fill);
            shapes[i].setStroke(stroke);
        }
    }

    @Override
    protected void setWidth(double value) {
        super.setWidth(value);
        paint();
    }

    @Override
    protected void setHeight(double value) {
        super.setHeight(value);
        paint();
    }
}
