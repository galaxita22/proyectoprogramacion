package cl.utalca.alumnos.proyecto;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.stage.Stage;

public class Draw {
    public void start(Stage primaryStage) {
        Canvas canvas = new Canvas(800, 600);
        Group root = new Group(canvas);

        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.fillText("Hello JavaFX Canvas", 20, 40);
        primaryStage.setTitle("JavaFX Canvas");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();


    }
}
