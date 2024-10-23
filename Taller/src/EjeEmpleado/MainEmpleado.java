package EjeEmpleado;

import java.net.SocketOption;
public class MainEmpleado {
    public static void main(String[] args){
        Empleado e1 = new Empleado("juan","piguave", 1280);
        System.out.println("El salario de: "+e1.getNombre()+" "+e1.getApellido()+" es "+salarioAnual(e1.getSalario()));
        e1.setSalario(e1.getSalario()*1.1);
        System.out.println("El salario de: "+e1.getNombre()+" "+e1.getApellido()+" es "+salarioAnual(e1.getSalario()));
    }
    public static double salarioAnual(double salario){
        return salario * 12;
    }
}
