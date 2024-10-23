package EjeFrecuenciaCardiaca;


import java.util.Calendar;
import java.util.GregorianCalendar;

public class FrecuenciaCardiaca {
    private String nombre;
    private String apellido;
    private  int DiaNac;
    private int MesNac;
    private int anioNac;
    private int edad;
    private int FCM;

    public FrecuenciaCardiaca(String nombre, String apellido, int diaNac, int mesNac, int anioNac) {
        this.nombre = nombre;
        this.apellido = apellido;
        DiaNac = diaNac;
        MesNac = mesNac;
        this.anioNac = anioNac;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getFCM() {
        return FCM;
    }

    public void setFCM(int FCM) {
        this.FCM = FCM;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDiaNac() {
        return DiaNac;
    }

    public void setDiaNac(int diaNac) {
        DiaNac = diaNac;
    }

    public int getMesNac() {
        return MesNac;
    }

    public void setMesNac(int mesNac) {
        MesNac = mesNac;
    }

    public int getAnioNac() {
        return anioNac;
    }

    public void setAnioNac(int anioNac) {
        this.anioNac = anioNac;
    }

    public int Calcularedad(int dianac, int mesnac, int anionac){
        //Utilizamos un calendario Gregoriano inicializado en el dia de hoy
        GregorianCalendar gc=new GregorianCalendar();
        int dia=gc.get(Calendar.DAY_OF_MONTH);
        int mes=gc.get(Calendar.MONTH)+1;
        int anio=gc.get(Calendar.YEAR);
        int edad=anio-anionac;
        return edad;
    }


}
