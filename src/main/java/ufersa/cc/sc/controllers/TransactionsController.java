package ufersa.cc.sc.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;
import javafx.scene.control.ListView;

public class TransactionsController implements Initializable{
    public ListView transactions_listview;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // Model.getInstance().getViewFactory().getClientSelectedMenuItem().set("Transaction");
    }
}
