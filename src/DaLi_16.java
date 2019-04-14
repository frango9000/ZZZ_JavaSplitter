import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import lib.MyFX.ToolFX;

public class DaLi_16 extends Application{

    private static Stage stage;

    @Override
    public void start(Stage primaryStage) throws Exception {
        stage = primaryStage;
        primaryStage.setTitle("C16");


        Pane pane = ex03();


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
    public static void ex04() {//Traffic lights
    }
    public static void ex05() {//Convert numbers
    }
    public static void ex06() {//Demonstrate TextField properties
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