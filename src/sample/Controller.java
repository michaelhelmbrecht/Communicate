package sample;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Controller {

    @FXML
    Button button;

    @FXML
    Label label;

    public void initialize() {

        button.setOnAction(e -> {


            Platform.runLater(() -> {
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("popup.fxml"));
                try {
                    Parent root1 = fxmlLoader.load();

                    Stage stage = new Stage();
                    stage.initModality(Modality.NONE);
                    stage.initStyle(StageStyle.DECORATED);
                    stage.setTitle("ABC");

                    stage.setScene(new Scene(root1));

                    stage.show();

                    System.out.println(label.getText());
                } catch (Exception ex) {
                    System.out.println(ex.toString());
                }


            });

        });


    }


    public void setText(String text) {
        label.setText(text);
    }
}
