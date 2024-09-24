package sirpinskiTriangles;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
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

        drawTriangle(pane, 1);

        HBox hBox = new HBox();
        hBox.setAlignment(Pos.BASELINE_CENTER);
        hBox.setSpacing(10);
        pane.add(hBox, 0, 1);

        Button btnDec = new Button("<");
        Button btnAsc = new Button(">");
        Label lblOrder = new Label("Order: 0");

        hBox.getChildren().addAll(btnDec, lblOrder, btnAsc);
    }

    public void drawTriangle(GridPane pane, int order) {
        int x = 50;
        int y = 300;
        int h = 300;

        if (order == 0) {
            // Polygon with 3 points (50,150), (100,50) and (150,150)
            Polygon polygon = new Polygon(x, y, x + h, y - h, x + 2*h, y);
            polygon.setFill(Color.TRANSPARENT);
            polygon.setStroke(Color.BLACK);
            pane.getChildren().add(polygon);
        } else {
            Polygon polygon = new Polygon(x, y, x + h/2, y - h/2, x + h, y);
            polygon.setFill(Color.TRANSPARENT);
            polygon.setStroke(Color.BLACK);
            pane.getChildren().add(polygon);

            drawTriangle(pane, order - 1);
        }
    }
}