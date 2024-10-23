package EjeFactura;

public class Factura {
    private  String coddigo;
    private String descripcion;
    private int cantidad;
    private double precio;

    public Factura(String coddigo, String descripcion, int cantidad, double precio) {
        this.coddigo = coddigo;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public String getCoddigo() {
        return coddigo;
    }

    public void setCoddigo(String coddigo) {
        this.coddigo = coddigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        if (cantidad<0)
            cantidad = 0;
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio<0)
            precio =0;
        this.precio = precio;
    }

    public double obtenerMontoFactura(){
        return  cantidad* precio;
    }
}

