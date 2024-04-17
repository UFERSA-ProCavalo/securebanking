package ufersa.cc.sc.controllers;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;
import ufersa.cc.sc.models.Model;

public class SignupController implements Initializable{

    @FXML
    private Button cancel_button;

    @FXML
    private TextField cpf_field;

    @FXML
    private Label cpf_label;

    @FXML
    private Label error_label;

    @FXML
    private TextField login_field;

    @FXML
    private Label login_label;

    @FXML
    private TextField password_field;

    @FXML
    private Label password_label;

    @FXML
    private TextField phone_field;

    @FXML
    private Label phone_label;

    @FXML
    private Button signup_button;

    @FXML
    private PasswordField hidden_password;

    @FXML
    private FontAwesomeIconView hidden_password_toggle;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        cancel_button.setOnAction(e -> cancel());
        signup_button.setOnAction(e -> signup());
    }

    public void signup() {
        String login = login_field.getText();
        String password = password_field.getText();
        String cpf = cpf_field.getText();
        String phone = phone_field.getText();

        if (login.isEmpty() || password.isEmpty() || cpf.isEmpty() || phone.isEmpty()) {
            error_label.setText("All fields must be filled");
            return;
        }

        // if (!Model.getInstance().getDatabase().createUser(login, password, cpf,
        // phone)) {
        // error_label.setText("User already exists");
        // return;
        // }
        Stage stage = (Stage) signup_button.getScene().getWindow();

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Success");

        alert.initModality(Modality.APPLICATION_MODAL);
        alert.initOwner(stage);

        alert.getDialogPane().setContentText("User created successfully");

        Optional<ButtonType> result = alert.showAndWait();
        if (result.get() == ButtonType.OK){
            System.out.println("User created successfully");
        }
        
        // Model.getInstance().getDatabase().createAccount(login, 0.0);
        // Model.getInstance().getDatabase().createAccount(login, 0.0);

        Model.getInstance().getViewFactory().closeStage(stage);
        Model.getInstance().getViewFactory().showLoginWindow();
    }

    public void cancel() {
        Stage stage = (Stage) cancel_button.getScene().getWindow();
        Model.getInstance().getViewFactory().closeStage(stage);
        Model.getInstance().getViewFactory().showLoginWindow();
    }

}
