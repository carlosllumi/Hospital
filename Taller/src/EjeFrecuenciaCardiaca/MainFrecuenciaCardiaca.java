package EjeFrecuenciaCardiaca;

import javax.swing.*;
import java.sql.SQLOutput;

public class MainFrecuenciaCardiaca {
    public static void main(String[] args) {
        FrecuenciaCardiaca c1 = new FrecuenciaCardiaca("Carlos", "Llumiquinga", 8, 1, 2003);
        c1.setEdad(c1.Calcularedad(c1.getDiaNac(), c1.getMesNac(), c1.getAnioNac()));
        c1.setNombre(JOptionPane.showInputDialog("Ingresa tu nombre: "));
        System.out.println(c1.getNombre());
        System.out.println("Edad: " + c1.getEdad());
        c1.setFCM(calcularFCM(c1.getEdad()));
        System.out.println("Su Frecuencia cardiaca maxima es de : " + calcularFCM(c1.getEdad()));
        System.out.println("" + calcularFCE(c1.getFCM(), c1.getEdad()));
    }

    public static int calcularFCM(int edad) {
        return 220 - edad;
    }

    public static String calcularFCE(int FCM, int edad) {
        double linferior = FCM*0.5;
        double lmaximo = FCM*0.85;
        return "Su Freciencia cardiaca esperada es de: "+linferior+" a "+lmaximo;
    }

}
