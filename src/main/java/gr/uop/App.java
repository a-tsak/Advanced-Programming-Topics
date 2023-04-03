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
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
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



        //Grid Settings TitledPane
        VBox vboxSets = new VBox();
        CheckBox cb1 = new CheckBox("Snap to Grid");
        CheckBox cb2 = new CheckBox("Show Grid");
        TitledPane gSets = new TitledPane("Grid Settings", vboxSets); // The titled pane for the settings
        gSets.setCollapsible(false);
        vboxSets.getChildren().addAll(cb1, cb2);
        vboxSets.setSpacing(10);
        gSets.setAlignment(Pos.TOP_CENTER);
        

        //Grid Dimensions TitledPane
        VBox vboxDims = new VBox();
        Label label1 = new Label("Horizontal: ");
        Label label2 = new Label("Vertical: ");
        TextField tf1 = new TextField();
        TextField tf2 = new TextField();
        tf1.setPrefWidth(80);
        tf2.setPrefWidth(80);
        HBox box1 = new HBox();
        box1.setAlignment(Pos.CENTER_RIGHT);
        box1.getChildren().addAll(label1, tf1);
        HBox box2 = new HBox();
        box2.setAlignment(Pos.CENTER_RIGHT);
        box2.getChildren().addAll(label2, tf2);
        TitledPane gDims = new TitledPane("Grid Dimensions", vboxDims);
        gDims.setCollapsible(false);
        vboxDims.getChildren().addAll(box1, box2);
        vboxDims.setSpacing(10);
        gDims.setAlignment(Pos.TOP_CENTER);
        



        //3 Buttons to the right
        VBox vboxButtons = new VBox();
        Button b1 = new Button("OK");
        Button b2 = new Button("Cancel");
        Button b3 = new Button("Help"); 
        b1.setPrefWidth(60);
        b2.setPrefWidth(60);
        b3.setPrefWidth(60);
        vboxButtons.getChildren().addAll(b1,b2,b3);
        vboxButtons.setSpacing(10);
        vboxButtons.setAlignment(Pos.TOP_CENTER);


        //Separator and label
        Separator s1 = new Separator(Orientation.HORIZONTAL);
        Label status = new Label("Status");
        VBox bottom = new VBox(s1,status);
        bottom.setAlignment(Pos.BOTTOM_LEFT);
        status.setAlignment(Pos.BOTTOM_LEFT);


        //Grid properties
        grid.setVgap(10);
        grid.setHgap(10);
        grid.setPadding(new Insets(10,30,10,30));
        grid.setAlignment(Pos.CENTER);
        GridPane.setHgrow(grid, Priority.ALWAYS);
        GridPane.setVgrow(grid, Priority.ALWAYS);
        
        
       

        //Add elements to grid
        
        grid.add(gSets, 0, 0);
        grid.add(gDims, 1, 0);
        grid.add(vboxButtons, 2, 0);
        grid.add(bottom,0,1,3,1);
        
        
        //Scene initialisation
        var scene = new Scene(grid, 500, 180);
        stage.setScene(scene);
        stage.setTitle("Settings");
        stage.setMinWidth(500);
        stage.setMinHeight(180); 
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}