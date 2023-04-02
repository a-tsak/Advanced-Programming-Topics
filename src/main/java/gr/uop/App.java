package gr.uop;




import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
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
        
        TitledPane gSets = new TitledPane("Grid Settings", vboxSets);    //The titled pane for the settings
        gSets.setCollapsible(false);
        //gSets.setText("Grid Settings");
        //gSets.add(vboxSets);
















        grid.setPadding(new Insets(10));
        
        // Δυνατότητα ορισμού απόστασης μεταξύ τους (σε pixel).
        grid.setHgap(10);
        grid.setVgap(10);







        grid.add(gSets,0,0);






        var scene = new Scene(grid, 500, 180);
        stage.setScene(scene);
        stage.setTitle("Settings"); 
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}