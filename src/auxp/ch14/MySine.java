package auxp.ch14;

import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polyline;
import javafx.scene.text.Text;

public class MySine extends Pane {

    private double width;
    private double height;
    public void paint(){
        width = getWidth();
        height = getHeight();

        getChildren().clear();
        getChildren().addAll(base(1260), sin(1260), cos(1260), tan(1260));
    }
    private Pane base(int bound){
        Pane pane = new Pane();

        Line y = new Line(width/2, 0, width/2, height);
        Line x = new Line(0, height/2,width,height/2);

        Text textX = new Text(x.getEndX() - 10, x.getEndY() - 20, "X");
        Text textY = new Text(y.getEndX() + 20, y.getEndY() - 10, "Y");
        pane.setPadding(new Insets(10));

        double hBound = (width/bound);
        Text pi,pi2,npi,npi2,zero,oneP,oneN;
        zero = new Text(width/2, height/2, "0");
        pi = new Text((width/2)+(180.0*(hBound)), height/2, ""+'\u03c0');
        pi2 = new Text((width/2)+(360*(hBound)), height/2, "2"+'\u03c0');
        npi = new Text((width/2)-(180.0*(hBound)), height/2, "-"+'\u03c0');
        npi2 = new Text((width/2)-(360*(hBound)), height/2, "-2"+'\u03c0');

        oneP = new Text((width/2)+10, (height/2)-(height/3), "1");
        oneN = new Text((width/2)+10, (height/2)+(height/3), "-1");
        pane.getChildren().clear();
        pane.getChildren().addAll(x,y,textX,textY,pi,pi2,npi,npi2,zero,oneP,oneN);
        return pane;
    }
    private Pane sin(int bound){
        Pane pane = new Pane();
        Polyline polyline = new Polyline();
        ObservableList<Double> list = polyline.getPoints();
        for (int x = -(bound/2); x <= bound/2; x++) {
            list.add((x+(bound/2))*(width/bound));
            list.add(height/2 - height/3 * Math.sin(Math.toRadians(x)));
        }
        polyline.setStroke(Color.BLUE);
        pane.getChildren().add(polyline);
        return pane;
    }

    private Pane cos(int bound){
        Pane pane = new Pane();
        Polyline polyline = new Polyline();
        ObservableList<Double> list = polyline.getPoints();
        for (int x = -(bound/2); x <= bound/2; x++) {
            list.add((x+(bound/2))*(width/bound));
            list.add(height/2 - height/3 * Math.cos(Math.toRadians(x)));
        }
        polyline.setStroke(Color.RED);
        pane.getChildren().add(polyline);
        return pane;
    }

    private Pane tan(int bound){
        Pane pane = new Pane();
        Polyline polyline = new Polyline();
        ObservableList<Double> list = polyline.getPoints();
        for (int x = -(bound/2); x <= bound/2; x++) {
            list.add((x+(bound/2))*(width/bound));
            list.add(height/2 - height/3 * Math.tan(Math.toRadians(x)));
        }
        polyline.setStroke(Color.YELLOW);
        pane.getChildren().add(polyline);
        return pane;
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
