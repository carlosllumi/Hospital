package EjeFecha;

public class Fecha {
    private int dia;
    private  int mes;
    private  int anio;

    public Fecha() {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }


    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        return String.format("%02d : %02d : %02d",mes,dia,anio);
    }
}
