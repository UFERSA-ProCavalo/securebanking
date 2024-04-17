package ufersa.cc.sc.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;
import javafx.scene.layout.BorderPane;
import ufersa.cc.sc.models.Model;

public class ClientController implements Initializable{
    public BorderPane client_parent;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Model.getInstance().getViewFactory().getClientSelectedMenuItem().addListener((observable, oldValue, newValue) -> {
            switch (newValue) {
                case "Dashboard":
                    client_parent.setCenter(Model.getInstance().getViewFactory().getDashboardView());
                    break;
                case "Accounts":
                    client_parent.setCenter(Model.getInstance().getViewFactory().getAccountsView());
                    break;
                case "Profile":
                    // client_parent.setCenter(Model.getInstance().getViewFactory().getProfileView());
                    break;
                case "Transactions":
                    client_parent.setCenter(Model.getInstance().getViewFactory().getTransactionsView());
                    break;
                case "Feedback":
                    // client_parent.setCenter(Model.getInstance().getViewFactory().getFeedbackView());
                    break;
                default:
                    client_parent.setCenter(Model.getInstance().getViewFactory().getDashboardView());
                    break;
            }
        });
    }
}
