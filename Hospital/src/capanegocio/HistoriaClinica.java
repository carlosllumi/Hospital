package capanegocio;

public class HistoriaClinica {
    private  Fecha fecha;
    private String tipoSangre;
    private boolean diabetes;
    private boolean hipertension;
    private  Cita citas[];

    public HistoriaClinica(){
        citas = new Cita[100];
    }

    public HistoriaClinica(Fecha fecha, String tipoSangre, boolean diabetes, boolean hipertension) {
        this.fecha = fecha;
        this.tipoSangre = tipoSangre;
        this.diabetes = diabetes;
        this.hipertension = hipertension;
        citas = new Cita[100];
    }

    public Fecha getFecha() {
        return fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    public boolean isDiabetes() {
        return diabetes;
    }

    public void setDiabetes(boolean diabetes) {
        this.diabetes = diabetes;
    }

    public boolean isHipertension() {
        return hipertension;
    }

    public void setHipertension(boolean hipertension) {
        this.hipertension = hipertension;
    }

    public Cita[] getCitas() {
        return citas;
    }

    public void setCitas(Cita[] citas) {
        this.citas = citas;
    }
}
