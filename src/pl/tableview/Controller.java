package pl.tableview;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.Random;

public class Controller {

    @FXML
    private TableView<TableItem> tableView;

    public Controller() {
    }

    @FXML
    private void initialize() {
        ObservableList<TableColumn<TableItem, ?>> columns = tableView.getColumns();
        TableColumn lpColumn = columns.get(0);
        lpColumn.setCellValueFactory(
                new PropertyValueFactory<TableItem, String>("lp"));

        TableColumn randomValueColumn = columns.get(1);
        randomValueColumn.setCellValueFactory(
                new PropertyValueFactory<TableItem, String>("randomValue"));
        for (int i=0; i<5; i++) {
            tableView.getItems().add(new TableItem(i+1, new Random().nextInt()));
        }
    }
}
