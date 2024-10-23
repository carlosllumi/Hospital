package EjeFecha;

import java.util.Scanner;

public class MainFecha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    Fecha f1 = new Fecha();

        System.out.println("Ingrese el dia: ");
        f1.setDia(sc.nextInt());
        System.out.println("Ingrese el mes: ");
        f1.setMes(sc.nextInt());
        System.out.println("Ingrese el anio: ");
        f1.setAnio(sc.nextInt());
    System.out.println(f1.toString());
    }
}
