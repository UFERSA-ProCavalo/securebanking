package ufersa.cc.sc.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import ufersa.cc.sc.models.Model;

public class LoginController implements Initializable {

    @FXML
    private Label error_label;

    @FXML
    private Button login_button;

    @FXML
    private TextField login_field;

    @FXML
    private Label login_label;

    @FXML
    private TextField password_field;

    @FXML
    private Label password_label;

    @FXML
    private Button signup_button;

    @FXML
    private PasswordField hidden_password;

    @FXML
    private FontAwesomeIconView hidden_password_toggle;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        login_button.setOnAction(e -> login());
        signup_button.setOnAction(e -> signup());
    }

    private void login() {
        String login = login_field.getText();
        String password = password_field.getText();

        // if (login.isEmpty() || password.isEmpty()) {
        // error_label.setText("Login and password must be filled");
        // return;
        // }

        // if (!Model.getInstance().getDatabase().login(login, password)) {
        // error_label.setText("Login or password is incorrect");
        // return;
        // }

        Stage stage = (Stage) login_button.getScene().getWindow();
        Model.getInstance().getViewFactory().closeStage(stage);
        Model.getInstance().getViewFactory().showClientWindow();
    }

    private void signup() {
        Stage stage = (Stage) login_button.getScene().getWindow();
        Model.getInstance().getViewFactory().closeStage(stage);
        Model.getInstance().getViewFactory().showSignupWindow();
    }
}