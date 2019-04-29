package auxp.ch17.splitter;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;

public class FileSplitterPane extends BorderPane {
    File file;
    TextField numOfSplitsTF;
    TextField sizeOfSplitsTF;

    public FileSplitterPane() {
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

        TextField newExt = new TextField();
        newExt.setPrefColumnCount(4);
        newExt.setEditable(false);
        TextField totalSize = new TextField();
        totalSize.setEditable(false);

        numOfSplitsTF = new TextField();
        RadioButton pickNumOfSplitsRadio = new RadioButton();
        Text finalSizeOfSplits = new Text();
        finalSizeOfSplits.setVisible(false);
        HBox numOfPieces = new HBox(numOfSplitsTF,pickNumOfSplitsRadio,finalSizeOfSplits);
        numOfPieces.setSpacing(5);

        sizeOfSplitsTF = new TextField();
        RadioButton pickSizeOfSplitsRadio = new RadioButton();
        Text finalNumOfSplits = new Text();
        finalNumOfSplits.setVisible(false);
        HBox pieceSize = new HBox(sizeOfSplitsTF,pickSizeOfSplitsRadio,finalNumOfSplits);
        pieceSize.setSpacing(5);

        ToggleGroup pickSplitType = new ToggleGroup();
        pickNumOfSplitsRadio.setToggleGroup(pickSplitType);
        pickSizeOfSplitsRadio.setToggleGroup(pickSplitType);

        GridPane grid = new GridPane();
        BorderPane.setMargin(grid, new Insets(5));
        grid.setHgap(3);
        grid.setVgap(5);
        grid.addRow(0, new Label("Output Name"), new HBox(newName,newExt));
        grid.addRow(1, new Label("Total Size (bytes)"), totalSize);
        grid.addRow(2, new Label("Num of Pieces"), numOfSplitsTF,pickNumOfSplitsRadio,finalSizeOfSplits);
        grid.addRow(3, new Label("Size of Pieces (bytes)"), sizeOfSplitsTF,pickSizeOfSplitsRadio,finalNumOfSplits);

        Button splitButton = new Button("Split");
        HBox bot = new HBox(splitButton);
        bot.setAlignment(Pos.CENTER);


        browseButton.setOnAction(event -> {
            file = fileChooser.showOpenDialog(new Stage());
            if(file!=null) {
                fileDir.setText(file.getAbsolutePath());
                totalSize.setText(FileSplitter.byteSizeFormatter(file.length()));
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

        setTop(browsePane);
        setLeft(grid);
        setBottom(bot);
    }

    private void split(){
        FileSplitter.splitBySize(file, Integer.parseInt(sizeOfSplitsTF.getText()));
    }
}
