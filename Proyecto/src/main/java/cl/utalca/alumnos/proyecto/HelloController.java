package cl.utalca.alumnos.proyecto;

import javafx.fxml.FXML;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import org.controlsfx.control.action.Action;

public class HelloController {

    @FXML
    private TextField textInput;
    public int statusA = 2, statusB = 2;

    public void ClickBorrarTodo (ActionEvent borratodo){
        textInput.setText("");
        statusA = 2;
        statusB = statusA;
    }

    public void ClickBorrar (ActionEvent borrauno){
        String borrar = textInput.getText();
        if(borrar != null && borrar != "" && borrar.length()>0){
            borrar = borrar.substring(0, borrar.length()-1);
            textInput.setText(borrar);
            statusA = statusB;
        }
    }

    public void ClickNumero (ActionEvent num){
        String numero = ((Button)num.getSource()).getText();
        textInput.setText(textInput.getText()+numero);
        statusB = statusA;
        statusA = 1;
    }

    public void ClickOperadores (ActionEvent oper){
        if (statusA != 2){
        String operador = ((Button)oper.getSource()).getText();
        textInput.setText(textInput.getText()+operador);
        statusB = statusA;
        statusA = 2;
    }
    }

    public void ClickParentesis (ActionEvent par){
        String parentesis = ((Button)par.getSource()).getText();
        textInput.setText(textInput.getText()+parentesis);
        statusB = statusA;
        statusA = 3;
    }


}