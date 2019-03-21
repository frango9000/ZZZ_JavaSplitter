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
import javafx.stage.Stage;
import lib.Misc.Randomizer;


public class DaLi_14 extends Application {

    private static int WIDTH = 1000;
    private static int HEIGHT = 600;

    @Override
    public void start(Stage primaryStage) throws Exception {

        Pane pane = ex03();


        Scene scene = new Scene(pane);
        primaryStage.setTitle("Chapter 14");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
    public static void ex00() {
    }
    public static Pane ex01() {//Display images
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

            iv.setFitHeight(HEIGHT/2);
            iv.setFitWidth(WIDTH/2);

            switch (i){
                case 0:
                    pane.add(iv, 0, 0);break;
                case 1:
                    pane.add(iv, 0, 1);break;
                case 2:
                    pane.add(iv, 1, 0);break;
                case 3:
                    pane.add(iv, 1, 1);break;
            }
        }
        return pane;
    }
    public static Pane ex02() {//Tic-tac-toe board
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(10));
        pane.setHgap(10);
        pane.setVgap(10);

        String[] images = {"res/image/o.gif", "res/image/x.gif"};
        for (int row = 0, col = 0, kt = 1; kt < 10; kt++) {

            int random = Randomizer.randomInt(3);

            switch (random){
                case 0:
                    pane.add(new ImageView(images[0]), col, row);break;
                case 1:
                    pane.add(new ImageView(images[1]), col, row);break;
                case 2:
                    pane.add(new Pane(), col, row);break;
            }
            col++;
            if(col == 3){
                row++;
                col = 0;
            }
        }
        return pane;
    }
    public static Pane ex03() {//Display three tile
        Pane pane = new HBox();

        int elements = 3;

        while (elements > 0){
            int rand = Randomizer.randomInt(1,53);
            Image i = new Image("res/image/card/" + (rand+1) + ".png");
            ImageView iv = new ImageView(i);
            pane.getChildren().add(iv);
            elements--;
        }
        return pane;
    }
    public static void ex04() {
    }
    public static void ex05() {
    }
    public static void ex06() {
    }
    public static void ex07() {
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