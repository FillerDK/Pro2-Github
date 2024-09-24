package sirpinskiTriangles;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
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
        pane.setMinSize(400, 400);

        initContent(pane);
        Scene sirpinski = new Scene(pane);

        window.setScene(sirpinski);
        window.show();
    }

    public void initContent(GridPane pane) {
        pane.setPadding(new Insets(20));
        pane.setHgap(10);
        pane.setVgap(10);

        int x = 50;
        int y = 150;
        int h = 100;

        // Polygon with 3 points (200,100), (300,100) and (250,150)
        Polygon polygon = new Polygon(x, y, x + h/2, y - h, x + h, y);
        polygon.setFill(Color.WHITE);
        polygon.setStroke(Color.BLACK);
        pane.getChildren().add(polygon);
    }
}