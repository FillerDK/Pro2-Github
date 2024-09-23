package sirpinskiTriangles;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

public class Gui extends Application {
    // section S

    @Override
    public void start(Stage mainStage) {
        Stage window = mainStage;
        window.setTitle("Sirpinski Triangles");
        GridPane pane = new GridPane();

        initContent(pane);
        Scene sirpinski = new Scene(pane, 200, 200);

        window.setScene(sirpinski);
        window.show();
    }

    public void initContent(GridPane pane) {
        pane.setPadding(new Insets(20));
        pane.setHgap(10);
        pane.setVgap(10);

        int startX = 50;
        int startY = 150;
        int h = 150;

        // Polygon with 3 points (200,100), (300,100) and (250,150)
        Polygon polygon = new Polygon(200, 100, 300, 100, 250, 150);
        pane.getChildren().add(polygon);
    }
}