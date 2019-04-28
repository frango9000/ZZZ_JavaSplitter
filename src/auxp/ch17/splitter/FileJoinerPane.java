package auxp.ch17.splitter;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;

public class FileJoinerPane extends VBox {
    File file;

    public FileJoinerPane() {
        setPadding(new Insets(5));
        setSpacing(5);
        Label title = new Label("File Joiner");


        FileChooser fileChooser = new FileChooser();
        TextField fileDir = new TextField();
        fileDir.setPrefColumnCount(40);
        fileDir.setEditable(false);
        Button browseButton = new Button("Browse");
        HBox browsePane = new HBox(new Label("Pick a File"), fileDir, browseButton);


        TextField newName = new TextField();
        TextField numOfPieces = new TextField();
        numOfPieces.setEditable(false);
        TextField pieceSize = new TextField();
        pieceSize.setEditable(false);
        TextField totalSize = new TextField();
        totalSize.setEditable(false);

        GridPane grid = new GridPane();
        grid.addRow(0, new Label("New Name"), newName);
        grid.addRow(1, new Label("Num of Pieces"), numOfPieces);
        grid.addRow(2, new Label("Size of Pieces (bytes)"), pieceSize);
        grid.addRow(3, new Label("Total Size (bytes)"), totalSize);

        Button join = new Button("Join");

        browseButton.setOnAction(event -> {
            file = fileChooser.showOpenDialog(new Stage());
            if(file!=null) {
                fileDir.setText(file.getAbsolutePath());
                newName.setText(file.getName().substring(0, file.getName().length()-4));

                pieceSize.setText(FileSplitter.byteSizeFormatter(file.length()));
            }
        });

        join.setOnAction(event -> {
            file = new File(fileDir.getText());
            join();
        });

        getChildren().addAll(title, browsePane, grid, join);
    }

    private void join(){
        FileSplitter.join(file,null);

    }

}
