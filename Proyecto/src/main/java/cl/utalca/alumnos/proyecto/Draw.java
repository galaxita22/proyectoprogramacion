package cl.utalca.alumnos.proyecto;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;


public class Draw {
    //private static final int[] valores = {0,30,60,90,120,150,180,210,240,270};
    /*dibujos para num y oper
    la altura está entre 100 y 140*/
    public static void Dibujar0(GraphicsContext gc, int a, int b) {
        gc.beginPath();
        gc.moveTo(10 + a, 100+b);
        gc.lineTo(30 + a, 100+b);
        gc.lineTo(30 + a, 140+b);
        gc.lineTo(10 + a, 140+b);
        gc.lineTo(10 + a, 100+b);
        gc.setStroke(Color.DEEPSKYBLUE);
        gc.stroke();
    }

    public static void Dibujar1(GraphicsContext gc, int a, int b){
        
        gc.beginPath();
        gc.moveTo(15+a,100+b);
        gc.lineTo(15+a,140+b);
        gc.setStroke(Color.DEEPSKYBLUE);
        gc.stroke();

    }
    public static void Dibujar2(GraphicsContext gc, int a, int b){
        
        gc.beginPath();
        gc.moveTo(10+a,100+b);
        gc.lineTo(30+a,100+b);
        gc.lineTo(30+a,120+b);
        gc.lineTo(10+a,120+b);
        gc.lineTo(10+a,140+b);
        gc.lineTo(30+a,140+b);
        gc.setStroke(Color.DEEPSKYBLUE);
        gc.stroke();
    }
    public static void Dibujar3(GraphicsContext gc, int a, int b){
        
        gc.beginPath();
        gc.moveTo(10+a,100+b);
        gc.lineTo(30+a,100+b);
        gc.lineTo(30+a,120+b);
        gc.lineTo(10+a,120+b);
        gc.lineTo(10+a,120+b);
        gc.moveTo(30+a,120+b);
        gc.lineTo(30+a,140+b);
        gc.lineTo(10+a,140+b);
        gc.lineTo(10+a,140+b);
        gc.setStroke(Color.DEEPSKYBLUE);
        gc.stroke();
    }
    public static void Dibujar4(GraphicsContext gc, int a, int b) {
        
        gc.beginPath();
        gc.moveTo(10 + a, 100+b);
        gc.lineTo(10 + a, 120+b);
        gc.lineTo(30 + a, 120+b);
        gc.lineTo(30 + a, 100+b);
        gc.lineTo(30 + a, 140+b);
        gc.setStroke(Color.DEEPSKYBLUE);
        gc.stroke();
    }
    public static void Dibujar5(GraphicsContext gc, int a, int b) {
        
        gc.beginPath();
        gc.moveTo(30 + a, 100+b);
        gc.lineTo(10 + a, 100+b);
        gc.lineTo(10 + a, 120+b);
        gc.lineTo(30 + a, 120+b);
        gc.lineTo(30 + a, 140+b);
        gc.lineTo(10 + a, 140+b);
        gc.setStroke(Color.DEEPSKYBLUE);
        gc.stroke();
    }

    public static void Dibujar6(GraphicsContext gc, int a, int b) {
        
        gc.beginPath();
        gc.moveTo(30 + a, 100+b);
        gc.lineTo(10 + a, 100+b);
        gc.lineTo(10 + a, 120+b);
        gc.lineTo(30 + a, 120+b);
        gc.lineTo(30 + a, 140+b);
        gc.lineTo(10 + a, 140+b);
        gc.lineTo(10 + a, 120+b);
        gc.setStroke(Color.DEEPSKYBLUE);
        gc.stroke();
    }
    public static void Dibujar7(GraphicsContext gc, int a, int b) {
        
        gc.beginPath();
        gc.moveTo(10 + a, 100+b);
        gc.lineTo(30 + a, 100+b);
        gc.lineTo(30 + a, 140+b);
        gc.setStroke(Color.DEEPSKYBLUE);
        gc.stroke();
    }
    public static void Dibujar8(GraphicsContext gc, int a, int b) {
        
        gc.beginPath();
        gc.moveTo(10 + a, 100+b);
        gc.lineTo(30 + a, 100+b);
        gc.lineTo(30 + a, 140+b);
        gc.lineTo(10 + a, 140+b);
        gc.lineTo(10 + a, 100+b);
        gc.moveTo(10 + a, 120+b);
        gc.lineTo(30 + a, 120+b);
        gc.setStroke(Color.DEEPSKYBLUE);
        gc.stroke();
    }
    public static void Dibujar9(GraphicsContext gc, int a, int b) {
        
        gc.beginPath();
        gc.moveTo(30 + a, 140+b);
        gc.lineTo(30 + a, 100+b);
        gc.lineTo(10 + a, 100+b);
        gc.lineTo(10 + a, 120+b);
        gc.lineTo(30 + a, 120+b);
        gc.setStroke(Color.DEEPSKYBLUE);
        gc.stroke();
    }

    public static void DibujarSuma(GraphicsContext gc, int a) {
        
        gc.beginPath();
        gc.moveTo(20 + a, 120);
        gc.lineTo(20 + a, 115);
        gc.lineTo(20 + a, 125);
        gc.lineTo(20 + a, 120);
        gc.lineTo(15 + a, 120);
        gc.lineTo(25 + a, 120);
        gc.setStroke(Color.RED);
        gc.stroke();
    }
    public static void DibujarResta(GraphicsContext gc, int a) {
        
        gc.beginPath();
        gc.moveTo(15 + a, 120);
        gc.lineTo(25 + a, 120);
        gc.setStroke(Color.RED);
        gc.stroke();
    }
    public static void DibujarMultiplicacion(GraphicsContext gc, int a){
        
        gc.beginPath();
        gc.moveTo(20 + a, 117.5);
        gc.lineTo(25 + a, 122.5);
        gc.moveTo(25 + a, 117.5);
        gc.lineTo(20 + a, 122.5);
        gc.setStroke(Color.RED);
        gc.stroke();
    }

    // hice este "division" para dejar listos todos los operadores con el color correspondiente, no tomen en cuenta el dibujo pq no es lo solicitado
    public static void  DibujarDivision(GraphicsContext gc, int a){
        
        gc.beginPath();
        gc.moveTo(0 + a, 150);
        gc.lineTo(40 + a, 150);
        gc.setStroke(Color.RED);
        gc.stroke();
    }
    public static void  DibujarPrimerParentesis(GraphicsContext gc, int a){
        gc.beginPath();
        gc.moveTo(30+a, 100);
        gc.setStroke(Color.GOLDENROD    );
        gc.strokeArc(15+a, 95, 10, 50, 90, 180, ArcType.OPEN);
        gc.stroke();
    }
    public static void  DibujarSegundoParentesis(GraphicsContext gc, int a){
        gc.beginPath();
        gc.moveTo(30+a, 100);
        gc.setStroke(Color.GOLDENROD);
        gc.strokeArc(15+a, 95, 10, 50, 270, 180, ArcType.OPEN);
        gc.stroke();
    }
}



