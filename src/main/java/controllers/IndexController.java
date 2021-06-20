package controllers;

import entities.Knjiga;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import util.KnjigaDao;

import java.net.URL;
import java.util.ResourceBundle;

public class IndexController implements Initializable {

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

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        isbnColumn.setCellValueFactory(new PropertyValueFactory<Knjiga, String>("isbn"));
        naslovColumn.setCellValueFactory(new PropertyValueFactory<Knjiga, String>("opis"));
        ocenaColumn.setCellValueFactory(new PropertyValueFactory<Knjiga, Double>("ocena"));
        autorColumn.setCellValueFactory(new PropertyValueFactory<>("autor"));
        ObservableList<Knjiga> listaKnjiga = FXCollections.observableArrayList(KnjigaDao.getAll());
        this.tabela.setItems(listaKnjiga);
    }

}
