package ufersa.cc.sc.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class AccountsController  implements Initializable{

    @FXML
    private Label account_balance;

    @FXML
    private Label account_date;

    @FXML
    private Label account_number;

    @FXML
    private TextField amount_from_fixed;

    @FXML
    private TextField amount_from_savings;

    @FXML
    private TextField amount_to_fixed;

    @FXML
    private TextField amount_to_savings;

    @FXML
    private Label fixed_balance;

    @FXML
    private Label savings_balance;

    @FXML
    private Label transaction_limit;

    @FXML
    private Button transfer_to_fixed;

    @FXML
    private Button transfer_to_savings;

    @FXML
    private Button withdraw_from_fixed;

    @FXML
    private Button withdraw_from_savings;

    @FXML
    private Label withdraw_limit;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // Model.getInstance().getViewFactory().getClientSelectedMenuItem().set("Accounts");
    }
}
