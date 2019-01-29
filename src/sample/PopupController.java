package sample;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class PopupController {

    @FXML
    Button submitBtn;

    @FXML
    TextField textField;

    public void initialize() {

        submitBtn.setOnAction(e -> {


                Platform.runLater(() -> {
                    try {
                        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("sample.fxml"));
                        Parent root1 = fxmlLoader.load();

                        Controller controller = fxmlLoader.getController();

                        controller.setText("Test");

                        System.out.println(controller.label.getText());



                    } catch (Exception ex) {
                        System.out.println(ex.toString());
                    }
                });



        });

    }
}
