package ex4;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class SubFrame extends Stage implements ColorObserver {
    private final GridPane pane = new GridPane();
    private final MainFrame mainFrame;

    public SubFrame(String title, Stage owner, MainFrame mainFrame) {
        this.initOwner(owner);
        this.initStyle(StageStyle.UTILITY);
        this.setMinHeight(100);
        this.setMinWidth(200);
        this.setResizable(false);

        this.setTitle(title);
        this.initContent();

        Scene scene = new Scene(pane);
        this.setScene(scene);

        this.mainFrame = mainFrame;
    }

    // -------------------------------------------------------------------------

    private final Label lblInfo = new Label("State: Unsubscribed");

    private void initContent() {
        pane.setPadding(new Insets(20));
        pane.setHgap(10);
        pane.setVgap(10);

        Label lblHeader = new Label("Computer Science is colorful");
        pane.add(lblHeader, 0, 0);

        Button btnSubscribe = new Button("Subscribe");
        pane.add(btnSubscribe, 0, 1);
        btnSubscribe.setOnAction(e -> subscribeAction());

        Button btnUnsubscribe = new Button("Unsubscribe");
        pane.add(btnUnsubscribe, 0, 2);
        btnUnsubscribe.setOnAction(e -> unsubscribeAction());

        pane.add(this.lblInfo, 0, 3);
    }

    private void subscribeAction() {
        mainFrame.registerObserver(this);
        lblInfo.setText("State: Subscribed");
    }

    private void unsubscribeAction() {
        mainFrame.removeObserver(this);
        lblInfo.setText("State: Unsubscribed");
    }

    @Override
    public void update(String color) {
        pane.setStyle("-fx-background-color: " + color);
    }
}
