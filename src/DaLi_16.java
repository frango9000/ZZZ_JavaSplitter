import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import lib.Math.NumberConverter;
import lib.Math.Scales;
import lib.MyFX.ToolFX;

public class DaLi_16 extends Application{

    private static Stage stage;

    @Override
    public void start(Stage primaryStage) throws Exception {
        stage = primaryStage;
        primaryStage.setTitle("C16");


        Pane pane = ex06();


        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.show();
        pane.requestFocus();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }

    public static Pane ex00() {
        return new Pane();
    }
    public static Pane ex01() {//Use radio buttons
        Text text = new Text(75, 150, "Welcome to Java");

        RadioButton redButton = new RadioButton("Red");
        RadioButton yellowButton = new RadioButton("Yellow");
        RadioButton blackButton = new RadioButton("Black");
        RadioButton orangeButton = new RadioButton("Orange");
        RadioButton greenButton = new RadioButton("Green");


        ToggleGroup tg = new ToggleGroup();
        redButton.setToggleGroup(tg);
        yellowButton.setToggleGroup(tg);
        blackButton.setToggleGroup(tg);
        orangeButton.setToggleGroup(tg);
        greenButton.setToggleGroup(tg);

        redButton.setOnAction(event -> text.setFill(Color.RED));
        yellowButton.setOnAction(event -> text.setFill(Color.YELLOW));
        blackButton.setOnAction(event -> text.setFill(Color.BLACK));
        orangeButton.setOnAction(event -> text.setFill(Color.ORANGE));
        greenButton.setOnAction(event -> text.setFill(Color.GREEN));


        HBox colors = new HBox(redButton,yellowButton,blackButton,orangeButton,greenButton);
        Pane center = new Pane(text);
        center.setMinHeight(300);
        center.setStyle("-fx-border-color: black");

        Button leftButton = new Button("<");
        Button rightButton = new Button(">");
        leftButton.setOnAction(event -> text.setX(text.getX()-10>=0? text.getX()-10 : 0));
        rightButton.setOnAction(event -> text.setX(text.getX()+10<=center.getWidth()-50?text.getX()+10:center.getWidth()-50));
        HBox btns = new HBox(leftButton,rightButton);
        btns.setAlignment(Pos.CENTER);

        BorderPane pane = new BorderPane();
        pane.setBottom(btns);
        pane.setCenter(center);
        pane.setTop(colors);

        return pane;
    }
    public static Pane ex02() {//Select geometric figures
        StackPane figures = new StackPane();
        figures.setMinSize(400, 500);

        RadioButton circle = new RadioButton("Circle");
        RadioButton square = new RadioButton("Square");
        RadioButton ellipse = new RadioButton("Ellipse");
        CheckBox fill = new CheckBox("Fill");


        ToggleGroup tg = new ToggleGroup();
        circle.setToggleGroup(tg);
        square.setToggleGroup(tg);
        ellipse.setToggleGroup(tg);

        circle.setOnAction(event -> {
            figures.getChildren().clear();
            figures.getChildren().add(new Circle(100, Color.BLACK));
        });
        square.setOnAction(event -> {
            figures.getChildren().clear();
            figures.getChildren().add(new Rectangle(100,100, Color.BLACK));
        });
        ellipse.setOnAction(event -> {
            figures.getChildren().clear();
            figures.getChildren().add(new Ellipse(120, 80));
        });
        fill.setOnAction(event -> {
            if(((CheckBox)event.getSource()).isSelected())
                ((Shape) figures.getChildren().get(0)).setFill(Color.BLACK);
            else ((Shape) figures.getChildren().get(0)).setFill(null);
        });


        HBox options = new HBox(circle,square,ellipse,fill);
        return new VBox(figures,options);

    }
    public static Pane ex03() {//Traffic lights
        Rectangle rect = new Rectangle(300, 200, null);
        rect.setStroke(Color.BLACK);
        Circle red = new Circle(50, 100, 25, null);
        Circle yellow = new Circle(150, 100, 25, null);
        Circle green = new Circle(250, 100, 25, null);
        ToolFX.setFillStroke(null,Color.BLACK, red,yellow,green);

        Pane stack = new Pane(rect,red,green,yellow);

        RadioButton redbtn = new RadioButton("Red");
        RadioButton yelbtn = new RadioButton("Yellow");
        RadioButton grebtn = new RadioButton("Green");

        HBox btns = new HBox(redbtn,yelbtn,grebtn);
        redbtn.setOnAction(event -> {
            red.setFill(Color.RED);
            green.setFill(null);
            yellow.setFill(null);
        });

        grebtn.setOnAction(event -> {
            red.setFill(null);
            green.setFill(Color.GREEN);
            yellow.setFill(null);
        });
        yelbtn.setOnAction(event -> {
            red.setFill(null);
            green.setFill(null);
            yellow.setFill(Color.YELLOW);
        });

        ToggleGroup tg = new ToggleGroup();
        redbtn.setToggleGroup(tg);
        yelbtn.setToggleGroup(tg);
        grebtn.setToggleGroup(tg);

        return new VBox(stack,btns);

    }
    public static Pane ex04() {//Create a Celsius/Fahrenheit converter
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10));
        grid.add(new Label("Celcius"), 0, 0);
        grid.add(new Label("Farenheit"), 0, 1);

        TextField ctext = new TextField();
        TextField ftext = new TextField();
        grid.add(ctext, 1, 0);
        grid.add(ftext, 1, 1);

        ctext.setOnAction(event -> {
            ftext.setText(""+Scales.celsiusToFahrenheit(Double.parseDouble(ctext.getText())));
        });
        ftext.setOnAction(event -> {
            ctext.setText(""+Scales.fahrenheitToCelsius(Double.parseDouble(ftext.getText())));
        });
        return grid;
    }
    public static Pane ex05() {//Convert numbers
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10));
        grid.add(new Label("Decimal"), 0, 0);
        grid.add(new Label("Hex"), 0, 1);
        grid.add(new Label("Binary"), 0, 2);

        TextField dtxt = new TextField();
        TextField htxt = new TextField();
        TextField btxt = new TextField();
        grid.add(dtxt, 1, 0);
        grid.add(htxt, 1, 1);
        grid.add(btxt, 1, 2);

        dtxt.setOnAction(event -> {
            htxt.setText(""+ NumberConverter.decToHex(Integer.parseInt(dtxt.getText())));
            btxt.setText(""+ NumberConverter.decToBin(Integer.parseInt(dtxt.getText())));
        });
        htxt.setOnAction(event -> {
            dtxt.setText(""+ NumberConverter.hexToDec(dtxt.getText()));
            btxt.setText(""+ NumberConverter.hexToBin(dtxt.getText()));
        });
        btxt.setOnAction(event -> {
            dtxt.setText(""+ NumberConverter.binToDec(dtxt.getText()));
            htxt.setText(""+ NumberConverter.binToHex(dtxt.getText()));
        });
        return grid;
    }
    public static Pane ex06() {//Demonstrate TextField properties
        Label label = new Label("Text Field");
        TextField tf = new TextField("JavaFX");
        HBox h1 = new HBox(label,tf);

        RadioButton left = new RadioButton("Left");
        RadioButton center = new RadioButton("Center");
        RadioButton right = new RadioButton("Right");
        ToggleGroup tg = new ToggleGroup();
        left.setToggleGroup(tg);
        center.setToggleGroup(tg);
        right.setToggleGroup(tg);
        Label colsize = new Label("Column Size");
        TextField cols = new TextField("12");

        left.setOnAction(event -> tf.setAlignment(Pos.CENTER_LEFT));
        center.setOnAction(event -> tf.setAlignment(Pos.CENTER));
        right.setOnAction(event -> tf.setAlignment(Pos.CENTER_RIGHT));
        cols.setOnAction(event -> tf.setPrefColumnCount(Integer.parseInt(cols.getText())));

        return new VBox(h1, new HBox(left,center,right,colsize,cols));
    }
    public static void ex07() {//Set clock time
    }
    public static void ex08() {//Geometry: two circles intersect?
    }
    public static void ex09() {//Geometry: two rectangles intersect?
    }
    public static void ex10() {//Text viewer
    }
    public static void ex11() {//Create a histogram for occurrences of letters
    }
    public static void ex12() {//Demonstrate TextArea properties
    }
    public static void ex13() {//Compare loans with various interest rates
    }
    public static void ex14() {//Select a font
    }
    public static void ex15() {//Demonstrate Label properties
    }
    public static void ex16() {//Use ComboBox and ListView
    }
    public static void ex17() {//Use ScrollBar and Slider
    }
    public static void ex18() {//Simulation: a running fan
    }
    public static void ex19() {//Control a group of fans
    }
    public static void ex20() {//Count-up stopwatch
    }
    public static void ex21() {//Count-down stopwatch
    }
    public static void ex22() {//Play, loop, and stop a sound clip
    }
    public static void ex23() {//Create an image animator with audio
    }
    public static void ex24() {//Revise Listing 16.14 MediaDemo.java
    }
    public static void ex25() {//Racing cars
    }
    public static void ex26() {//Simulation: raise flag and play anthem
    }
    public static void ex27() {//Display country flag and flag description
    }
    public static void ex28() {//Slide show
    }
    public static void ex29() {//Display a calendar
    }
    public static void ex30() {//Pattern recognition: consecutive four equal numbers
    }
    public static void ex31() {//Game: connect four
    }
}