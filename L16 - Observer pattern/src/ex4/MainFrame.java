package ex4;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.util.ArrayList;

public class MainFrame extends Application {
    private final GridPane pane = new GridPane();

    @Override
    public void start(Stage stage) {
        stage.setTitle("Ex. 4: Observer Pattern");
        this.initContent();

        Scene scene = new Scene(this.pane);
        stage.setScene(scene);
        stage.show();

        subFrame1 = new SubFrame("SubFrame 1", stage, this);
        subFrame2 = new SubFrame("SubFrame 2", stage, this);
    }

    // ------------------------------------------------------------------------

    private SubFrame subFrame1;
    private SubFrame subFrame2;

    private void initContent() {
        pane.setPadding(new Insets(20));
        pane.setHgap(10);
        pane.setVgap(10);

        Label lblNumber = new Label("Number");
        pane.add(lblNumber, 0, 0);

        ToggleGroup group = new ToggleGroup();

        RadioButton rbnRed = new RadioButton("Red");
        pane.add(rbnRed, 0, 1);
        rbnRed.setToggleGroup(group);
        rbnRed.setOnAction(event -> this.redAction());

        RadioButton rbnGreen = new RadioButton("Green");
        pane.add(rbnGreen, 0, 2);
        rbnGreen.setToggleGroup(group);
        rbnGreen.setOnAction(event -> this.greenAction());

        RadioButton rbnBlue = new RadioButton("Blue");
        pane.add(rbnBlue, 0, 3);
        rbnBlue.setToggleGroup(group);
        rbnBlue.setOnAction(event -> this.blueAction());

        Button btnShowFrame1 = new Button("Open SubFrame 1");
        pane.add(btnShowFrame1, 0, 4);
        btnShowFrame1.setOnAction(e -> subFrame1.show());

        Button btnShowFrame2 = new Button("Open SubFrame 2");
        pane.add(btnShowFrame2, 0, 5);
        btnShowFrame2.setOnAction(e -> subFrame2.show());
    }

    // ------------------------------------------------------------------------

    private String color;

    private void redAction() {
        color = "pink";
        pane.setStyle("-fx-background-color: " + color);
        notifyObservers(color);
    }

    private void greenAction() {
        color = "lightgreen";
        pane.setStyle("-fx-background-color: " + color);
        notifyObservers(color);
    }

    private void blueAction() {
        color = "lightskyblue";
        pane.setStyle("-fx-background-color: " + color);
        notifyObservers(color);
    }

    // ------------------------------------------------------------------------

    private final ArrayList<SubFrame> observers = new ArrayList<>();

    public void registerObserver(SubFrame obs) {
        observers.add(obs);
    }

    public void removeObserver(SubFrame obs) {
        observers.remove(obs);
    }

    private void notifyObservers(String color) {
        for (SubFrame obs : observers) {
            obs.update(color);
        }
    }
}
