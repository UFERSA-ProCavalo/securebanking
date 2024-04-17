package ufersa.cc.sc;

import javafx.application.Application;
import javafx.stage.Stage;
import ufersa.cc.sc.models.Model;

public class App extends Application {
    public static void main(String[] args) throws Exception {
        launch(args);
    }   

    @Override
    public void start(Stage stage) {
        Model.getInstance().getViewFactory().showLoginWindow();
    }

}
