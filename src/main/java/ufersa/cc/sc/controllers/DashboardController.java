package ufersa.cc.sc.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class DashboardController {

    @FXML
    private Label checking_balance;

    @FXML
    private Label checking_number;

    @FXML
    private Label date;

    @FXML
    private Label expense_label;

    @FXML
    private Label fixed_balance;

    @FXML
    private Label income_label;

    @FXML
    private Label saving_balance;

    @FXML
    private TextField send_amount_field;

    @FXML
    private Button send_button;

    @FXML
    private TextArea send_message_area;

    @FXML
    private TextField send_receiver_field;

    @FXML
    private Text username;

}
