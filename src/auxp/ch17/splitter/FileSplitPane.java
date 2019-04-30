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

public class FileSplitPane extends BorderPane {
    File file;

    HBox browsePane;
    Button browseButton;
    TextField fileDir;
    FileChooser fileChooser;

    GridPane grid;
    TextField newName;
    TextField newExt;
    TextField totalSize;
    TextField numOfPieces;
    TextField sizeOfPieces;

    RadioButton pickNumOfSplitsRadio;
    RadioButton pickSizeOfSplitsRadio;
    Text finalSizeOfSplits;
    Text finalNumOfSplits;

    HBox bot;
    Button execButton;

    public FileSplitPane() {
        this(false); // default is join pane
    }

    public FileSplitPane(boolean split) {
        setPadding(new Insets(5));

        browsePane = getBrowseBox();

        grid = getFieldsGrid();

        bot = getExecButtonBox();

        if (split) {
            execButton.setText("Split");
            numOfPieces.setEditable(true);
            sizeOfPieces.setEditable(true);

            pickNumOfSplitsRadio = new RadioButton();
            pickSizeOfSplitsRadio = new RadioButton();

            ToggleGroup pickSplitType = new ToggleGroup();
            pickNumOfSplitsRadio.setToggleGroup(pickSplitType);
            pickSizeOfSplitsRadio.setToggleGroup(pickSplitType);

            finalSizeOfSplits = new Text();
            finalSizeOfSplits.setVisible(false);

            finalNumOfSplits = new Text();
            finalNumOfSplits.setVisible(false);

            grid.addRow(2, pickNumOfSplitsRadio, finalSizeOfSplits);
            grid.addRow(3, pickSizeOfSplitsRadio, finalNumOfSplits);

            setSplitActions();
        } else {
            execButton.setText("Join");
            setJoinActions();
        }

        setTop(browsePane);
        setLeft(grid);
        setBottom(bot);
    }

    private void setSplitActions() {
        browseButton.setOnAction(event -> {
            file = fileChooser.showOpenDialog(new Stage());
            if (file != null) {
                fileDir.setText(file.getAbsolutePath());
                newName.setText(file.getName());
                newExt.setText("000");
                totalSize.setText(FileSplitter.byteSizeFormatter(file.length()));
                numOfPieces.setText("1");
                sizeOfPieces.setText(file.length() + "");
            }
        });

        numOfPieces.textProperty().addListener(observable -> {
            int n = Integer.parseInt(numOfPieces.getText());
            finalSizeOfSplits.setText(FileSplitter.byteSizeFormatter((file.length() / n) + (file.length() % n == 0 ? 0 : 1)) + " bytes per file"); // if length % n != 0 1 more byte per file.
        });

        sizeOfPieces.textProperty().addListener((observable, oldValue, newValue) -> {
            if (!newValue.matches("\\d*")) {
                sizeOfPieces.setText(newValue.replaceAll("[^\\d]", ""));
            }
            if (sizeOfPieces.getText().length() > 0) {
                long n = Long.parseLong(sizeOfPieces.getText());
                finalNumOfSplits.setText("Pieces " + (file.length() % n == 0 ? file.length() / n : (file.length() / n) + 1));
            }
        });
        pickNumOfSplitsRadio.setOnAction(event -> {
            finalSizeOfSplits.setVisible(true);
            finalNumOfSplits.setVisible(false);
        });
        pickSizeOfSplitsRadio.setOnAction(event -> {
            finalSizeOfSplits.setVisible(false);
            finalNumOfSplits.setVisible(true);
        });
        execButton.setOnAction(event -> {
            FileSplitter.splitBySize(file, Integer.parseInt(sizeOfPieces.getText()));
        });
    }

    private void setJoinActions() {
        browseButton.setOnAction(event -> {
            file = fileChooser.showOpenDialog(new Stage());
            if (file != null) {
                fileDir.setText(file.getAbsolutePath());
                newName.setText(file.getName().substring(0, file.getName().length() - 5));
                newExt.setText("000");

                sizeOfPieces.setText(FileSplitter.byteSizeFormatter(file.length()));
            }
        });

        execButton.setOnAction(event -> {
            file = new File(fileDir.getText());
            FileSplitter.join(file, null);
        });
    }

    private HBox getExecButtonBox() {
        execButton = new Button("GO");
        HBox bot = new HBox(execButton);
        bot.setAlignment(Pos.CENTER);
        return bot;
    }

    private GridPane getFieldsGrid() {
        newName = new TextField();
        newExt = new TextField();
        newExt.setPrefColumnCount(4);
        newExt.setEditable(false);
        totalSize = new TextField();
        totalSize.setEditable(false);
        numOfPieces = new TextField();
        numOfPieces.setEditable(false);
        sizeOfPieces = new TextField();
        sizeOfPieces.setEditable(false);

        HBox nameWithExt = new HBox(newName, new Text("."), newExt);
        nameWithExt.setAlignment(Pos.BASELINE_LEFT);

        GridPane fieldsGrid = new GridPane();
        BorderPane.setMargin(fieldsGrid, new Insets(5));
        fieldsGrid.setHgap(3);
        fieldsGrid.setVgap(5);
        fieldsGrid.addRow(0, new Label("Output Name"), nameWithExt);
        fieldsGrid.addRow(1, new Label("Total Size (bytes)"), totalSize);
        fieldsGrid.addRow(2, new Label("Num of Pieces"), numOfPieces);
        fieldsGrid.addRow(3, new Label("Size of Pieces (bytes)"), sizeOfPieces);
        return fieldsGrid;
    }

    private HBox getBrowseBox() {
        fileChooser = new FileChooser();
        fileDir = new TextField();
        fileDir.setPrefColumnCount(40);
        fileDir.setEditable(false);
        browseButton = new Button("Browse");
        HBox browsePane = new HBox(new Label("Pick a File"), fileDir, browseButton);
        browsePane.setSpacing(5);
        browsePane.setAlignment(Pos.BASELINE_LEFT);
        browsePane.setPadding(new Insets(10));
        browsePane.setBorder(new Border(new BorderStroke(Color.LIGHTGRAY, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
        return browsePane;
    }

}
