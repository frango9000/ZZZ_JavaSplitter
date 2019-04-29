package auxp.ch17.splitter;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;

public class FileJoinerPane extends BorderPane {
    File file;

    public FileJoinerPane() {
        setPadding(new Insets(5));



        FileChooser fileChooser = new FileChooser();
        TextField fileDir = new TextField();
        fileDir.setPrefColumnCount(40);
        fileDir.setEditable(false);
        Button browseButton = new Button("Browse");
        HBox browsePane = new HBox(new Label("Pick a File"), fileDir, browseButton);
        browsePane.setSpacing(5);
        browsePane.setAlignment(Pos.BASELINE_LEFT);
        browsePane.setPadding(new Insets(10));
        browsePane.setBorder(new Border(new BorderStroke(Color.LIGHTGRAY, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));


        TextField newName = new TextField();
        TextField totalSize = new TextField();
        totalSize.setEditable(false);
        TextField numOfPieces = new TextField();
        numOfPieces.setEditable(false);
        TextField pieceSize = new TextField();
        pieceSize.setEditable(false);

        GridPane grid = new GridPane();
        BorderPane.setMargin(grid, new Insets(5));
        grid.setHgap(3);
        grid.setVgap(5);
        grid.addRow(0, new Label("Output Name"), newName);
        grid.addRow(1, new Label("Total Size (bytes)"), totalSize);
        grid.addRow(2, new Label("Num of Pieces"), numOfPieces);
        grid.addRow(3, new Label("Size of Pieces (bytes)"), pieceSize);

        Button joinButton = new Button("Join");
        HBox bot = new HBox(joinButton);
        bot.setAlignment(Pos.CENTER);

        browseButton.setOnAction(event -> {
            file = fileChooser.showOpenDialog(new Stage());
            if(file!=null) {
                fileDir.setText(file.getAbsolutePath());
                newName.setText(file.getName().substring(0, file.getName().length()-4));

                pieceSize.setText(FileSplitter.byteSizeFormatter(file.length()));
            }
        });

        joinButton.setOnAction(event -> {
            file = new File(fileDir.getText());
            join();
        });

        setTop(browsePane);
        setLeft(grid);
        setBottom(bot);
    }

    private void join(){
        FileSplitter.join(file,null);

    }

}
