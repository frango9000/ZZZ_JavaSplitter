package auxp.ch14;

import javafx.scene.Scene;
import javafx.scene.chart.*;
import javafx.scene.layout.Pane;

public class Chart1 extends Pane {

    public void paint() {
        double centerX = getWidth() / 2;
        double scaleX = getWidth() / 500;
        double centerY = getHeight() / 2;
        double scaleY = getHeight() / 500;

        CategoryAxis xAxis = new CategoryAxis();
        NumberAxis yAxis = new NumberAxis();
        BarChart<String, Number> bc = new BarChart<String, Number>(xAxis,yAxis);

        XYChart.Series series = new XYChart.Series();
        series.getData().add(new XYChart.Data<>("Apple", 20));
        series.getData().add(new XYChart.Data<>("HTC", 26));
        series.getData().add(new XYChart.Data<>("Samsung", 28));
        series.getData().add(new XYChart.Data<>("Others", 26));
        bc.getData().add(series);
        bc.getStylesheets().add("auxp/ch14/chart.css");
        bc.setLegendVisible(false);
        Pane pane = new Pane(bc);

        getChildren().clear();
        getChildren().addAll(pane);
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
