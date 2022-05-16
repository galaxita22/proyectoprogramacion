package cl.utalca.alumnos.proyecto.controladores;

import cl.utalca.alumnos.proyecto.funciones.numeros.Numeros;
import cl.utalca.alumnos.proyecto.funciones.operadores.Operadores;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class Controlador implements Initializable {

    private static int posX, posY;

    @FXML
    private TextField textInput;
    public int statusA = 2, statusB = 2, statusParentesis = 0, statusC;

    @FXML
    public Canvas canvas;
    private GraphicsContext gc;

    public void ClickBorrarTodo (ActionEvent borratodo){
        textInput.setText("");
        statusA = 2;
        statusB = statusA;
        gc.clearRect(0,0,515,313);
        posX = 0;
        posY =0;
    }

    /*public void ClickBorrar (ActionEvent borrauno){
        String borrar = textInput.getText();
        if(borrar != null && borrar.length() > 0){
            borrar = borrar.substring(0, borrar.length()-1);
            textInput.setText(borrar);
            statusA = statusB;
            contador-=1;
            //gc.clearRect();
            //Borrar en canvas
        }
    }*/

    public void ClickNumero (ActionEvent num){
        String numero = ((Button)num.getSource()).getText();
        textInput.setText(textInput.getText()+numero);
        statusB = statusA;
        statusA = 1;

        switch (numero) {
            case "1" -> {
                Numeros.draw(1, gc, posX, posY);
                posX += 30;
                posY =0;
            }
            case "2" -> {
                Numeros.draw(2, gc, posX, posY);
                posX += 30;
                posY =0;
            }
            case "3" -> {
                Numeros.draw(3, gc, posX, posY);
                posX += 30;
                posY =0;
            }
            case "4" -> {
                Numeros.draw(4, gc, posX, posY);
                posX += 30;
                posY =0;
            }
            case "5" -> {
                Numeros.draw(5, gc, posX, posY);
                posX += 30;
                posY =0;
            }
            case "6" -> {
                Numeros.draw(6, gc, posX, posY);
                posX += 30;
                posY =0;
            }
            case "7" -> {
                Numeros.draw(7, gc, posX, posY);
                posX += 30;
                posY =0;
            }
            case "8" -> {
                Numeros.draw(8, gc, posX, posY);
                posX += 30;
                posY =0;
            }
            case "9" -> {
                Numeros.draw(9, gc, posX, posY);
                posX += 30;
                posY =0;
            }
            default -> {
                if(posY != 60){
                    Numeros.draw(0, gc, posX, posY);
                    posX += 30;
                }
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
                    Operadores.draw("+", gc, posX);
                    posX += 30;
                }
                case"-" ->{
                    Operadores.draw("-",gc, posX);
                    posX += 30;
                }
                case"*" ->{
                    Operadores.draw("*",gc, posX);
                    posX += 30;
                }
                case"/" ->{
                    posX -=30;
                    Operadores.draw("/",gc, posX);
                    posY =60;
                }

            }
        }
    }

    public void ClickPrimerParentesis (ActionEvent par){
        String parentesis = ((Button)par.getSource()).getText();
        textInput.setText(textInput.getText()+parentesis);
        statusB = statusA;
        statusA = 3;
        statusParentesis+=1;

        Operadores.draw("(", gc, posX);
        posX +=30;
    }

    public void  ClickSegundoParentesis(ActionEvent par2){
        String parentesis = ((Button)par2.getSource()).getText();
        if(statusParentesis > 0){
            statusParentesis -=1;
            textInput.setText(textInput.getText()+parentesis);
            statusB = statusA;
            statusA = 3;

            Operadores.draw(")",gc, posX);
            posX += 30;
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        gc = canvas.getGraphicsContext2D();
    }

}