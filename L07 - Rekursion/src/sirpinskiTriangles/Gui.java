package sirpinskiTriangles;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Point2D;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
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

        initContent(pane);
        Scene sirpinski = new Scene(pane, 800, 600);

        window.setScene(sirpinski);
        window.show();
    }

    public void initContent(GridPane gridPane) {
        gridPane.setPadding(new Insets(20));
        gridPane.setHgap(10);
        gridPane.setVgap(10);

        Pane pane = new Pane();
        drawTriangle(pane, 400, 300, 300, 4);
        gridPane.add(pane, 0, 0);

        HBox hBox = new HBox();
        hBox.setAlignment(Pos.BASELINE_CENTER);
        hBox.setSpacing(10);
        gridPane.add(hBox, 0, 1);

        Button btnDec = new Button("<");
        Button btnAsc = new Button(">");
        Label lblOrder = new Label("Order: 0");

        hBox.getChildren().addAll(btnDec, lblOrder, btnAsc);
    }

    private void drawTriangle(Pane pane, double x, double y, double size, int order) {
        if (order == 0) {
            Polygon triangle = createTriangle(x, y, size);
            triangle.setFill(null);
            triangle.setStroke(Color.BLACK);
            pane.getChildren().add(triangle);
        } else {
            double newSize = size / 2;
            drawTriangle(pane, x, y, newSize, order - 1);
            drawTriangle(pane, x - newSize, y + newSize, newSize, order - 1);
            drawTriangle(pane, x + newSize, y + newSize, newSize, order - 1);
        }
    }

    private Polygon createTriangle(double x, double y, double size) {
        Polygon triangle = new Polygon();
        triangle.getPoints().addAll(
                x, y,                           // top
                x - size, y + size,         // venstre hjørne
                x + size, y + size          // højre hjørne
        );
        return triangle;
    }
}