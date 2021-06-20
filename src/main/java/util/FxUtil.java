package util;

import javafx.scene.control.Alert;

public class FxUtil {

    public static void showMessage(String title, String message){
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle(title);
        alert.setHeaderText(message);
        alert.showAndWait();
    }



}
