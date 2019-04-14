import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public abstract class DaLi_16 extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("C15");


        Pane pane = ex00();


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
    public static void ex01() {//Use radio buttons
    }
    public static void ex02() {//Select geometric figures
    }
    public static void ex03() {//Traffic lights
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