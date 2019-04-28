package auxp.ch17.splitter;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;

public class FileSplitterPane extends VBox {
    File file;
    TextField numOfSplitsTF;
    TextField sizeOfSplitsTF;

    public FileSplitterPane() {
        setPadding(new Insets(5));
        setSpacing(5);
        Label title = new Label("File Splitter");


        FileChooser fileChooser = new FileChooser();
        TextField fileDir = new TextField();
        fileDir.setPrefColumnCount(40);
        fileDir.setEditable(false);
        Button browseButton = new Button("Browse");
        Text size = new Text();


        numOfSplitsTF = new TextField();
        RadioButton pickNumOfSplitsRadio = new RadioButton();
        Text finalSizeOfSplits = new Text();
        finalSizeOfSplits.setVisible(false);
        HBox numOptions = new HBox(numOfSplitsTF,pickNumOfSplitsRadio,finalSizeOfSplits);
        numOptions.setSpacing(5);

        sizeOfSplitsTF = new TextField();
        RadioButton pickSizeOfSplitsRadio = new RadioButton();
        Text finalNumOfSplits = new Text();
        finalNumOfSplits.setVisible(false);
        HBox sizeOptions = new HBox(sizeOfSplitsTF,pickSizeOfSplitsRadio,finalNumOfSplits);
        sizeOptions.setSpacing(5);

        ToggleGroup pickSplitType = new ToggleGroup();
        pickNumOfSplitsRadio.setToggleGroup(pickSplitType);
        pickSizeOfSplitsRadio.setToggleGroup(pickSplitType);

        GridPane grid = new GridPane();
        grid.setHgap(3);
        grid.setVgap(5);
        grid.addRow(0, new Label("Pick a File"), fileDir, browseButton);
        grid.addRow(1, new Label("Size of File: "), size);
        grid.addRow(2, new Label("Number of files:"), numOptions);
        grid.addRow(3, new Label("Size of files (bytes):"), sizeOptions);

        Button splitButton = new Button("Split");
        HBox bot = new HBox(splitButton);
        bot.setAlignment(Pos.CENTER);


        browseButton.setOnAction(event -> {
            file = fileChooser.showOpenDialog(new Stage());
            if(file!=null) {
                fileDir.setText(file.getAbsolutePath());
                size.setText(FileSplitter.byteSizeFormatter(file.length()));
                numOfSplitsTF.setText("1");
                sizeOfSplitsTF.setText(file.length()+"");
            }
        });

        numOfSplitsTF.textProperty().addListener(observable -> {
            int n = Integer.parseInt(numOfSplitsTF.getText());
            finalSizeOfSplits.setText( FileSplitter.byteSizeFormatter( (file.length()/n) + (file.length()%n==0 ? 0 : 1) ) + " bytes per file"); // if length % n != 0 1 more byte per file.
        });

        sizeOfSplitsTF.textProperty().addListener(observable -> {
            long n = Long.parseLong(sizeOfSplitsTF.getText());
            finalNumOfSplits.setText( "Pieces " + ( file.length() % n == 0 ? file.length()/n : (file.length()/n)+1 ) );
        });

        pickNumOfSplitsRadio.setOnAction(event -> {
            finalSizeOfSplits.setVisible(true);
            finalNumOfSplits.setVisible(false);
        });
        pickSizeOfSplitsRadio.setOnAction(event -> {
            finalSizeOfSplits.setVisible(false);
            finalNumOfSplits.setVisible(true);
        });
        splitButton.setOnAction(event -> split());

        getChildren().addAll(title,grid, bot);
    }

    private void split(){
        FileSplitter.splitBySize(file, Integer.parseInt(sizeOfSplitsTF.getText()));
    }
}
