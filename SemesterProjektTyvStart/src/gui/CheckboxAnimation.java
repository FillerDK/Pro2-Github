package gui;

import javafx.animation.RotateTransition;
import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ProgressBar;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.util.Duration;

public class CheckboxAnimation extends Application {
    @Override
    public void start(Stage primaryStage) {
        CheckBox checkBox = new CheckBox();
        checkBox.getStyleClass().add("custom-checkbox");

        // Rotate animation on click
        checkBox.setOnAction(event -> {
            RotateTransition rotate = new RotateTransition(Duration.millis(300), checkBox);
            rotate.setByAngle(checkBox.isSelected() ? 90 : -90); // Rotate down or back up
            rotate.play();
        });

        Button btnBarrel = new Button();
        GridPane.setHalignment(btnBarrel, HPos.CENTER);

        ProgressBar progressBar = new ProgressBar(0.4);
        //progressBar.setProgress(ProgressBar.INDETERMINATE_PROGRESS);
        VBox vBox = new VBox(progressBar);
        vBox.setStyle("-fx-alignment: center;");

        GridPane pane = new GridPane();
        pane.add(checkBox, 0, 0);
        pane.add(btnBarrel, 1, 0);
        pane.add(vBox, 2, 0);

        Scene scene = new Scene(pane, 300, 200);
        scene.getStylesheets().add("style.css"); // Your CSS file for styling
        primaryStage.setScene(scene);
        primaryStage.setTitle("Checkbox Animation");
        primaryStage.show();
    }
}
