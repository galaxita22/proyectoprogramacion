package cl.utalca.alumnos.proyecto;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("calculadora.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1120, 350);
        stage.setTitle("Calculadora");
        stage.setScene(scene);
        Image icon = new Image(String.valueOf(Main.class.getResource("/cl/utalca/alumnos/proyecto/images/logo.png")));
        stage.getIcons().add(icon);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}