package ufersa.cc.sc.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import ufersa.cc.sc.models.Model;

public class ClientMenuController implements Initializable {

    @FXML
    private Button accounts_button;

    @FXML
    private Button dashboard_button;

    @FXML
    private Button feedback_button;

    @FXML
    private Button logout_button;

    @FXML
    private Button profile_button;

    @FXML
    private Button transactions_button;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        addListener();
    }

    private void addListener() {
        dashboard_button.setOnAction(e -> {
            DashboardSelected();
        });

        accounts_button.setOnAction(e -> {
            AccountsSelected();
        });

        profile_button.setOnAction(e -> {
            ProfileSelected();
        });

        transactions_button.setOnAction(e -> {
            TransactionsSelected();
        });

        feedback_button.setOnAction(e -> {
            //
        });

        logout_button.setOnAction(e -> {
            //
        });
    }

    private void DashboardSelected() {
        Model.getInstance().getViewFactory().getClientSelectedMenuItem().set("Dashboard");
    }

    private void AccountsSelected() {
        Model.getInstance().getViewFactory().getClientSelectedMenuItem().set("Accounts");
    }

    private void ProfileSelected() {
        Model.getInstance().getViewFactory().getClientSelectedMenuItem().set("Profile");
    }

    private void TransactionsSelected() {
        Model.getInstance().getViewFactory().getClientSelectedMenuItem().set("Transactions");
    }

}