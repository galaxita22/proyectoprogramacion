package cl.utalca.alumnos.proyecto;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.scene.control.TextField;
import org.controlsfx.control.action.Action;

public class HelloController {

    @FXML
    private TextField textInput;

    public void ClickNumero (ActionEvent num){
        String numero = ((Button)num.getSource()).getText();
        textInput.setText(textInput.getText()+numero);
    }

    public void ClickOperadores (ActionEvent oper){
        String operador = ((Button)oper.getSource()).getText();
        textInput.setText(textInput.getText()+operador);
    }

    public void ClickParentesis (ActionEvent par){
        String parentesis = ((Button)par.getSource()).getText();
        textInput.setText(textInput.getText()+parentesis);
    }

}