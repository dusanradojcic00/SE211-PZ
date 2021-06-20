package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import util.BazaUtil;
import util.FxUtil;
import util.KorisnikDao;

import java.io.IOException;
import java.sql.*;

public class LoginController {

    @FXML
    private TextField inputEmail;

    @FXML
    private TextField inputPass;

    @FXML
    private Button loginBtn;

    public LoginController(){

    }

    @FXML
    void login(ActionEvent event) throws IOException {
        String email = inputEmail.getText();
        String pass = inputPass.getText();
        if (KorisnikDao.login(email, pass)) {
            Parent parent = FXMLLoader.load(getClass().getResource("/index.fxml"));
            Scene scene = new Scene(parent);
            Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        } else {
            FxUtil.showMessage("Neispravni podaci", "Neispravni podaci za logovanje, molimo Vas pokusajte ponovo!");
        }
    }

}

