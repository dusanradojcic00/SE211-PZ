package controllers;

import entities.Knjiga;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class IndexController {

    @FXML
    private TableView<Knjiga> tabela;

    @FXML
    private TableColumn<Knjiga, String> isbnColumn;

    @FXML
    private TableColumn<Knjiga, String> naslovColumn;

    @FXML
    private TableColumn<Knjiga, String> autorColumn;

    @FXML
    private TableColumn<Knjiga, Double> ocenaColumn;


    public IndexController() {
        ObservableList<Knjiga> listaKnjiga = FXCollections.observableArrayList(tabela.getItems());


    }
}
