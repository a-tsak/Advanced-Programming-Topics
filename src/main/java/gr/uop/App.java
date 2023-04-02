package gr.uop;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        GridPane grid = new GridPane();
        VBox vboxSets = new VBox();
        CheckBox cb1 = new CheckBox("Snap to Grid");
        CheckBox cb2 = new CheckBox("Show Grid");
        TitledPane gSets = new TitledPane("Grid Settings", vboxSets); // The titled pane for the settings
        gSets.setCollapsible(false);
        vboxSets.getChildren().addAll(cb1, cb2);
        vboxSets.setSpacing(10);

        grid.setPadding(new Insets(10));

        grid.setHgap(10);
        grid.setVgap(10);

        grid.add(gSets, 0, 0);

        var scene = new Scene(grid, 500, 180);
        stage.setScene(scene);
        stage.setTitle("Settings");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}