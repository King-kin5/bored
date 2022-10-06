package com.example.bored;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class ListController {

    @FXML
    private Button add;

    @FXML
    private Label label;

    @FXML
    private ListView<String> listview;

    @FXML
    private Button remove;

    @FXML
    private TextField textfield;

    @FXML
    void addname(ActionEvent event) {
        listview.getItems().add(textfield.getText());
    }
        @FXML
    void removename(ActionEvent event) {
        int selectedID=listview.getSelectionModel().getSelectedIndex();
        listview.getItems().remove(selectedID);
    }

}
