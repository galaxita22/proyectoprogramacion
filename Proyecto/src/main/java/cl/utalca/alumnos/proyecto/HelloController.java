package cl.utalca.alumnos.proyecto;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import org.controlsfx.control.action.Action;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable{

    private static int contador;

    @FXML
    private TextField textInput;
    public int statusA = 2, statusB = 2;

    @FXML
    public Canvas canvas;
    private GraphicsContext gc;

    @FXML
    private Button draw;

    public void ClickBorrarTodo (ActionEvent borratodo){
        textInput.setText("");
        statusA = 2;
        statusB = statusA;
    }

    public void ClickBorrar (ActionEvent borrauno){
        String borrar = textInput.getText();
        if(borrar != null && borrar.length() > 0){
            borrar = borrar.substring(0, borrar.length()-1);
            textInput.setText(borrar);
            statusA = statusB;
            contador-=1;
            //Borrar en canvas
        }
    }

    public void ClickNumero (ActionEvent num){
        String numero = ((Button)num.getSource()).getText();
        textInput.setText(textInput.getText()+numero);
        statusB = statusA;
        statusA = 1;

        switch (numero) {

            case "1" -> {
                Draw.Dibujar1(gc, contador);
                contador += 1;
            }
            case "2" -> {
                Draw.Dibujar2(gc, contador);
                contador += 1;
            }
            case "3" -> {
                Draw.Dibujar3(gc, contador);
                contador += 1;
            }
            case "4" -> {
                Draw.Dibujar4(gc, contador);
                contador += 1;
            }
            case "5" -> {
                Draw.Dibujar5(gc, contador);
                contador += 1;
            }
            case "6" -> {
                Draw.Dibujar6(gc, contador);
                contador += 1;
            }
            case "7" -> {
                Draw.Dibujar7(gc, contador);
                contador += 1;
            }
            case "8" -> {
                Draw.Dibujar8(gc, contador);
                contador += 1;
            }
            case "9" -> {
                Draw.Dibujar9(gc, contador);
                contador += 1;
            }
            default -> {
                Draw.Dibujar0(gc, contador);
                contador += 1;
            }
        }

    }

    public void ClickOperadores (ActionEvent oper){
        if (statusA != 2){
        String operador = ((Button)oper.getSource()).getText();
        textInput.setText(textInput.getText()+operador);
        statusB = statusA;
        statusA = 2;
        switch (operador) {
            case"+" ->{
                Draw.DibujarSuma(gc, contador);
                contador += 1;
            }
            case"-" ->{
                System.out.println("a");
            }

        }
    }
    }

    public void ClickParentesis (ActionEvent par){
        String parentesis = ((Button)par.getSource()).getText();
        textInput.setText(textInput.getText()+parentesis);
        statusB = statusA;
        statusA = 3;
    }

    @FXML
    public void ClickDibujar (ActionEvent draw){
        gc.setFill(Color.AQUA);
        gc.fillRect(10,10,100,100);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        gc = canvas.getGraphicsContext2D();
    }
}