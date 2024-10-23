package EjeFactura;

public class MainFactura {
    public static void main(String[] args) {

        Factura f1 = new Factura("1234","Martillo",3,15.50);
        System.out.println("Numero de pieza: "+f1.getCantidad());
        System.out.println("Descripcion: "+f1.getDescripcion());
        System.out.println("Cantidad: "+f1.getCantidad());
        System.out.println("Precio por Articulo: $"+f1.getPrecio());
        System.out.println("Monto de la Factura: $"+f1.obtenerMontoFactura());
    }

}


