import auxp.ch14.Chart1;
import auxp.ch14.Chart2;
import auxp.ch14.MyCylinder;
import auxp.ch14.UglySmiley;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import lib.Misc.Randomizer;

import java.util.LinkedList;


public class DaLi_14 extends Application {

    private static Stage stage;

    public static Pane ex13() {
        return new Chart2();
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

            int HEIGHT = 600;
            iv.setFitHeight(HEIGHT / 2);
            int WIDTH = 1000;
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
    public static Pane ex07() {//Display random 0 or 1
        VBox vb = new VBox();
        vb.setAlignment(Pos.CENTER);
        vb.setPadding(new Insets(3));
        vb.setSpacing(2);
        for (int i = 0; i < 10; i++) {
            HBox hb = new HBox();
            hb.setAlignment(Pos.CENTER);
            hb.setSpacing(2);
            for (int j = 0; j < 10; j++) {
                StackPane sp = new StackPane();
                sp.setAlignment(Pos.CENTER);
                Rectangle r = new Rectangle(20,20);
                r.setFill(null);
                Text n = new Text(Randomizer.randomInt(2) == 0? "0":"1");
                r.setArcHeight(10);
                r.setArcWidth(10);
                r.setStroke(Color.GRAY);
                sp.getChildren().addAll(r,n);
                hb.getChildren().add(sp);
            }
            vb.getChildren().add(hb);
        }
        return vb;
    }
    public static Pane ex08() {//Display 54 cards
        GridPane gp = new GridPane();
        LinkedList<ImageView> ll = new LinkedList<>();

        for (int i = 0; i < 54; i++) {
            ll.offer(new ImageView(new Image("res/image/card/" + (i + 1) + ".png")));
        }

        for (int row = 0; ll.peek() != null; row++) {
            for (int col = 0; ll.peek() != null && col < 13; col++) {
                gp.add(ll.poll(), col, row);
            }
        }
        return gp;
    }
    public static Pane ex09() {//Create four taichi
        GridPane gp = new GridPane();
        gp.setPadding(new Insets(3 ,4,5,2));
        gp.setVgap(3);
        gp.setHgap(3);
        gp.setAlignment(Pos.CENTER);

        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 2; col++) {
                Pane stack = new Pane();

                Circle c = new Circle(50, 50, 45);
                c.setFill(null);
                c.setStroke(Color.BLACK);
                int startAngle = 30;
                for (int i = 0; i < 4; i++) {
                    startAngle += 90;
                    Arc arc = new Arc(50,50,35,35,startAngle,35);
                    arc.setFill(Color.BLUE);
                    arc.setType(ArcType.ROUND);
                    stack.getChildren().add(arc);
                }

                stack.getChildren().add(c);
                gp.add(stack, col, row);
            }
        }
        return gp;
    }
    public static Pane ex10() {//Display a cylinder
        Pane pane = new MyCylinder();
        return pane;
    }
    public static Pane ex11() {//Paint a smiley fac
        stage.setMinHeight(150);
        stage.setMinWidth(100);
        stage.setHeight(150);
        stage.setWidth(100);
        return new UglySmiley();
    }
    public static Pane ex12() {//Display a bar chart
        return new Chart1();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        stage = primaryStage;
        primaryStage.setTitle("C14");


        Pane pane = ex13();


        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.show();
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