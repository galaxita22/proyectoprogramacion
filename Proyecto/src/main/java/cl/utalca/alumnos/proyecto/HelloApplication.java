package cl.utalca.alumnos.proyecto;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import java.io.IOException;

public class HelloApplication extends Application {

    public void  start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 360);
        stage.setTitle("Calculadora");
        stage.setScene(scene);
        Image icon = new Image(getClass().getResourceAsStream("/cl/utalca/alumnos/proyecto/images/icon.png"));
        stage.getIcons().add(icon);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}