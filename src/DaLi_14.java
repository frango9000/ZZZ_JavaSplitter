import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import lib.Misc.Randomizer;



public class DaLi_14 extends Application {

    private static int WIDTH = 1000;
    private static int HEIGHT = 600;

    private static Stage stage;

    @Override
    public void start(Stage primaryStage) throws Exception {
        stage = primaryStage;
        primaryStage.setTitle("C14");


        Pane pane = ex06();


        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
    public static void appendToTitle(String str) {
        stage.setTitle(stage.getTitle() + "_" + str);
    }
    public static void ex00() {
    }
    public static Pane ex01() {//Display images
        appendToTitle("E01");
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(10));
        pane.setHgap(10);
        pane.setVgap(10);

        String[] images = {"res/image/flag5.gif", "res/image/4.jpg", "res/image/china.gif", "res/image/flag1.gif"};
        Group g = new Group();
        for (int i = 0; i < images.length; i++) {
            Image f = new Image(images[i]);
            ImageView iv = new ImageView(f);

            iv.setFitHeight(HEIGHT / 2);
            iv.setFitWidth(WIDTH / 2);

            switch (i) {
                case 0:
                    pane.add(iv, 0, 0);
                    break;
                case 1:
                    pane.add(iv, 0, 1);
                    break;
                case 2:
                    pane.add(iv, 1, 0);
                    break;
                case 3:
                    pane.add(iv, 1, 1);
                    break;
            }
        }
        return pane;
    }
    public static Pane ex02() {//Tic-tac-toe board
        appendToTitle("E02");
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(10));
        pane.setHgap(10);
        pane.setVgap(10);

        String[] images = {"res/image/o.gif", "res/image/x.gif"};
        for (int row = 0, col = 0, kt = 1; kt < 10; kt++) {

            int random = Randomizer.randomInt(3);

            switch (random) {
                case 0:
                    pane.add(new ImageView(images[0]), col, row);
                    break;
                case 1:
                    pane.add(new ImageView(images[1]), col, row);
                    break;
                case 2:
                    pane.add(new Pane(), col, row);
                    break;
            }
            col++;
            if (col == 3) {
                row++;
                col = 0;
            }
        }
        return pane;
    }
    public static Pane ex03() {//Display three tile
        appendToTitle("E03");
        Pane pane = new HBox();

        int elements = 3;

        while (elements > 0) {
            int rand = Randomizer.randomInt(1, 53);
            Image i = new Image("res/image/card/" + (rand + 1) + ".png");
            ImageView iv = new ImageView(i);
            pane.getChildren().add(iv);
            elements--;
        }
        return pane;
    }
    public static Pane ex04() {//Color and font
        appendToTitle("E04");
        HBox pane = new HBox(0);
        pane.setMinHeight(100);
        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(10));

        for (int i = 0; i < 5; i++) {
            Text text = new Text("JavaFX");
            text.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 24));
            text.setRotate(90);
            text.setFill(Color.color(Math.random(), Math.random(), Math.random(), Math.random()));
            pane.getChildren().add(text);
        }
        return pane;
    }
    public static Pane ex05() {//Characters around circle
        appendToTitle("E05");
        Pane pane = new Pane();

        pane.setMinWidth(200);
        pane.setMinHeight(200);

        char[] title = "Learning JavaFX ".toCharArray();
        int anglePerChar = 360 / title.length + 1;
        int radius = 70;
        int centerX = 95, centerY = 100;


        int angle = 0;
        for (char c : title) {
            Text ch = new Text(c + "");
            ch.setX(centerX + (radius * Math.sin(Math.toRadians(90 - angle))));
            ch.setY(centerY + (radius * Math.cos(Math.toRadians(90 - angle))));
            ch.setRotate(90 + angle);
            ch.setFont(Font.font("Arial", FontWeight.BOLD, FontPosture.REGULAR, 20));

            angle += anglePerChar;
            pane.getChildren().add(ch);
        }
        return pane;

    }
    public static Pane ex06() {//Game: display a checkerboard
        appendToTitle("E06");
        VBox checkers = new VBox();
        for (int i = 0; i < 4; i++) {
            HBox h1 = new HBox();
            HBox h2 = new HBox();
            for (int j = 0; j < 17; j++) {
                if ( j == 8 ) continue;
                Color w = new Color(1, 1, 1, 1);
                Color b = new Color(0, 0, 0, 1);
                Rectangle r = new Rectangle(40, 40, (j%2 == 0)? w : b);
                if(j<8)
                    h1.getChildren().add(r);
                else
                    h2.getChildren().add(r);
            }
            checkers.getChildren().addAll(h1,h2);
        }
        return checkers;
    }
    public static void ex07() {//Display random 0 or 1
    }
    public static void ex08() {
    }
    public static void ex09() {
    }
    public static void ex10() {
    }
    public static void ex11() {
    }
    public static void ex12() {
    }
    public static void ex13() {
    }
    public static void ex14() {
    }
    public static void ex15() {
    }
    public static void ex16() {
    }
    public static void ex17() {
    }
    public static void ex18() {
    }
    public static void ex19() {
    }
    public static void ex20() {
    }
    public static void ex21() {
    }
    public static void ex22() {
    }
    public static void ex23() {
    }
    public static void ex24() {
    }
    public static void ex25() {
    }
    public static void ex26() {
    }
    public static void ex27() {
    }
    public static void ex28() {
    }
    public static void ex29() {
    }
}