package cl.utalca.alumnos.proyecto.funciones;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.shape.ArcType;

public class Dibuja {
    //private static final int[] valores = {0,30,60,90,120,150,180,210,240,270};

    public static void drawNum(GraphicsContext gc, int posX, int posY, String[] numbers ) {
        gc.beginPath();

        // lT AA BB -> lineTo(AA,BB)
        // mT AA BB -> moveTo(AA,BB)

        for (String number : numbers) {
            int start = Integer.parseInt(number.split(" ")[1]) + posX;
            int end = Integer.parseInt(number.split(" ")[2]) + posY;

            if (number.contains("lT")) {
                gc.lineTo(start, end);
            } else {
                gc.moveTo(start, end);
            }
        }
        //gc.setStroke(Color.DEEPSKYBLUE);
        gc.stroke();
    }

    public static void drawOper(GraphicsContext gc, int posX, String[] operators ) {
        gc.beginPath();

        // lT AA BB -> lineTo(AA,BB)
        // mT AA BB -> moveTo(AA,BB)
        // sA AA BB -> strokeArc(AA,BB,CC,DD,EE,FF,TYPE)

        for (String operator : operators) {
            double start = Double.parseDouble(operator.split(" ")[1]) + posX; //->AA
            double end = Double.parseDouble(operator.split(" ")[2]); //->BB

            if (operator.contains("lT")) {
                gc.lineTo(start, end);
            } else if (operator.contains("mT")) {
                gc.moveTo(start, end);
            } else {
                double CC = Double.parseDouble(operator.split(" ")[3]);
                double DD = Double.parseDouble(operator.split(" ")[4]);
                double EE = Double.parseDouble(operator.split(" ")[5]);
                double FF = Double.parseDouble(operator.split(" ")[6]);
                ArcType TYPE = ArcType.valueOf(operator.split(" ")[7]);
                gc.strokeArc(start, end, CC, DD, EE, FF, TYPE);
            }
        }
        //gc.setStroke(Color.RED);
        gc.stroke();
    }
}
