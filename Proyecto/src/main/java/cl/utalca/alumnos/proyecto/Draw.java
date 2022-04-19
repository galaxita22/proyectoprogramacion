package cl.utalca.alumnos.proyecto;

import javafx.event.ActionEvent;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.canvas.Canvas;
import javafx.scene.paint.Color;


public class Draw {
    private static final int[] valores = {0,30,60,90,120,150,180,210,240,270};
    /*dibujos para num y oper
    la altura está entre 100 y 140*/

    public static void Dibujar0(GraphicsContext gc, int contador) {
        int a = valores[contador];
        gc.beginPath();
        gc.moveTo(10 + a, 100);
        gc.lineTo(30 + a, 100);
        gc.lineTo(30 + a, 140);
        gc.lineTo(10 + a, 140);
        gc.lineTo(10 + a, 100);
        gc.stroke();
    }

    public static void Dibujar1(GraphicsContext gc, int contador){
        int a = valores[contador];
        gc.beginPath();
        gc.moveTo(15+a,100);
        gc.lineTo(15+a,140);
        gc.stroke();
    }
    public static void Dibujar2(GraphicsContext gc, int contador){
        int a = valores[contador];
        gc.beginPath();
        gc.moveTo(10+a,100);
        gc.lineTo(30+a,100);
        gc.lineTo(30+a,120);
        gc.lineTo(10+a,120);
        gc.lineTo(10+a,140);
        gc.lineTo(30+a,140);
        gc.stroke();
    }
    public static void Dibujar3(GraphicsContext gc, int contador){
        int a = valores[contador];
        gc.beginPath();
        gc.moveTo(10+a,100);
        gc.lineTo(30+a,100);
        gc.lineTo(30+a,120);
        gc.lineTo(10+a,120);
        gc.lineTo(10+a,120);
        gc.moveTo(30+a,120);
        gc.lineTo(30+a,140);
        gc.lineTo(10+a,140);
        gc.lineTo(10+a,140);
        gc.stroke();
    }
    public static void Dibujar4(GraphicsContext gc, int contador) {
        int a = valores[contador];
        gc.beginPath();
        gc.moveTo(10 + a, 100);
        gc.lineTo(10 + a, 120);
        gc.lineTo(30 + a, 120);
        gc.lineTo(30 + a, 100);
        gc.lineTo(30 + a, 140);
        gc.stroke();
    }
    public static void Dibujar5(GraphicsContext gc, int contador) {
        int a = valores[contador];
        gc.beginPath();
        gc.moveTo(30 + a, 100);
        gc.lineTo(10 + a, 100);
        gc.lineTo(10 + a, 120);
        gc.lineTo(30 + a, 120);
        gc.lineTo(30 + a, 140);
        gc.lineTo(10 + a, 140);
        gc.stroke();
    }

    public static void Dibujar6(GraphicsContext gc, int contador) {
        int a = valores[contador];
        gc.beginPath();
        gc.moveTo(30 + a, 100);
        gc.lineTo(10 + a, 100);
        gc.lineTo(10 + a, 120);
        gc.lineTo(30 + a, 120);
        gc.lineTo(30 + a, 140);
        gc.lineTo(10 + a, 140);
        gc.lineTo(10 + a, 120);
        gc.stroke();
    }
    public static void Dibujar7(GraphicsContext gc, int contador) {
        int a = valores[contador];
        gc.beginPath();
        gc.moveTo(10 + a, 100);
        gc.lineTo(30 + a, 100);
        gc.lineTo(30 + a, 140);
        gc.stroke();
    }
    public static void Dibujar8(GraphicsContext gc, int contador) {
        int a = valores[contador];
        gc.beginPath();
        gc.moveTo(10 + a, 100);
        gc.lineTo(30 + a, 100);
        gc.lineTo(30 + a, 140);
        gc.lineTo(10 + a, 140);
        gc.lineTo(10 + a, 100);
        gc.moveTo(10 + a, 120);
        gc.lineTo(30 + a, 120);
        gc.stroke();
    }
    public static void Dibujar9(GraphicsContext gc, int contador) {
        int a = valores[contador];
        gc.beginPath();
        gc.moveTo(30 + a, 140);
        gc.lineTo(30 + a, 100);
        gc.lineTo(10 + a, 100);
        gc.lineTo(10 + a, 120);
        gc.lineTo(30 + a, 120);
        gc.stroke();
    }

    public static void DibujarSuma(GraphicsContext gc, int contador) {
        int a = valores[contador];
        gc.beginPath();
        gc.moveTo(20 + a, 120);
        gc.lineTo(20 + a, 115);
        gc.lineTo(20 + a, 125);
        gc.lineTo(20 + a, 120);
        gc.lineTo(15 + a, 120);
        gc.lineTo(25 + a, 120);
        gc.stroke();
    }
    public static void DibujarResta(GraphicsContext gc, int contador) {
        int a = valores[contador];
        gc.beginPath();
        gc.moveTo(20 + a, 120);
        gc.lineTo(15 + a, 120);
        gc.lineTo(25 + a, 120);
        gc.stroke();
    }
    public static void DibujarMultiplicacion(GraphicsContext gc, int contador){
        int a = valores[contador];
        gc.beginPath();
        gc.moveTo(20 + a, 120);
        gc.lineTo(25 + a, 125);
        gc.moveTo(25 + a, 120);
        gc.lineTo(20 + a, 125);
        gc.stroke();
    }
}



